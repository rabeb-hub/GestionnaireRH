package com.example.demo.services.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.persistance.entities.Equipe;
import com.example.demo.persistance.entities.Personnel;
import com.example.demo.persistance.entities.Tache;
import com.example.demo.services.interfaces.IPersonnel;
import com.example.demo.services.interfaces.ITache;

@RestController
@RequestMapping("/api/tache")
public class TacheController {
	@Autowired
	ITache tacheService;

    @GetMapping("/getAll")
    public List<Tache> list() {
        return tacheService.listAllTache();
    }
    
    @PostMapping("/add")
    public ResponseEntity<Object> createPersonnel(@RequestBody Tache tache) {
    	Tache t=tacheService.saveTache(tache);

    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(t.getIdTache()).toUri();

    	return ResponseEntity.created(location).build();

    }
    
    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable long id) {
    	tacheService.deleteTache(id);
    return true;
    }
    
}
