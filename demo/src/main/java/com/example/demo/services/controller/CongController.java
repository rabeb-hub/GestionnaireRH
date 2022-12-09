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

import com.example.demo.persistance.entities.Conge;
import com.example.demo.persistance.entities.Personnel;
import com.example.demo.services.interfaces.IConge;


@RestController
@RequestMapping("/api/conge")
public class CongController {
	@Autowired
	IConge Congeservice;

    @GetMapping("/getAll")
    public List<Conge> list() {
        return Congeservice.listAllConge();
    }
    
    
   @PostMapping("/add")
    public ResponseEntity<Object> createConge(@RequestBody Conge cong) {
    	Conge c=Congeservice.saveConge(cong);

    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(c.getIdCong()).toUri();

    	return ResponseEntity.created(location).build();

    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Object> update(@RequestBody Conge conge, @PathVariable long id) {

    	Conge congeOptional = Congeservice.getCongeById(id);

    	if (congeOptional==null)
    		return ResponseEntity.notFound().build();

    	conge.setIdCong(id);
    	
    	Congeservice.updateConge(congeOptional);

    	return ResponseEntity.noContent().build();
    }
    
    
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable long id) {
		Congeservice.deleteConge(id);
        return true;
    }
}
