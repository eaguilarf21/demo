package com.example.demo.controller;

import com.example.demo.entity.GradoEntity;
import com.example.demo.interfaz.GradoInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datoGrado")
public class GradoController {

    @Autowired
    private GradoInterfaz inter;

    @GetMapping
    public List<GradoEntity> busqueda(){
        return (List<GradoEntity>) inter.findAll();
    }

    @PostMapping
    public void Create(@RequestBody GradoEntity pGradoEntity)
    {
        inter.save(pGradoEntity);
    }

    @PutMapping
    public void Update(@RequestBody GradoEntity pGradoEntity)
    {
        inter.save(pGradoEntity);
    }
}
