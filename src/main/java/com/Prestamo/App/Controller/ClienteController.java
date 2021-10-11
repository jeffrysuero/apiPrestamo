package com.Prestamo.App.Controller;

import com.Prestamo.App.Model.Cliente;
import com.Prestamo.App.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(name = "/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    public ResponseEntity<List<Cliente>> getAll(){
        List<Cliente> clientes = clienteService.getAll();
        if(clientes.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(clientes);
    }

}
