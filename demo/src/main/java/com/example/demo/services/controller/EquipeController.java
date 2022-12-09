package com.example.demo.services.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.persistance.entities.Equipe;
import com.example.demo.services.interfaces.IEquipe;

@RestController
@RequestMapping("/api/Equipe")
public class EquipeController {
	@Autowired
	IEquipe equipeService;

    @GetMapping("/getAll")
    public List<Equipe> list() {
        return equipeService.listAllEquipe();
    }
    
    
   @PostMapping("/add")
    public ResponseEntity<Object> createEquipe(@RequestBody Equipe equipe) {
	   Equipe e=equipeService.saveEquipe(equipe);

    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(e.getIdEquipe()).toUri();

    	return ResponseEntity.created(location).build();

    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Object> update(@RequestBody Equipe equipe, @PathVariable long id) {

    	Equipe equipeOptional = equipeService.getEquipeById(id);

    	if (equipeOptional==null)
    		return ResponseEntity.notFound().build();

    	equipe.setIdEquipe(id);
    	
    	equipeService.updateEquipe(equipeOptional);

    	return ResponseEntity.noContent().build();
    }
    
    
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable long id) {
		equipeService.deleteEquipe(id);
        return true;
    }
}
