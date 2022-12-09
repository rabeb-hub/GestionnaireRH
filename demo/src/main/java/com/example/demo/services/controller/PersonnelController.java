package com.example.demo.services.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.persistance.dao.PersonnelRepository;
import com.example.demo.persistance.entities.Personnel;
import com.example.demo.services.interfaces.IPersonnel;

@RestController
@RequestMapping("/api/personnel")
public class PersonnelController {

	@Autowired
	IPersonnel personnelservice;

    @GetMapping("/getAll")
    public List<Personnel> list() {
        return personnelservice.listAllPersonnel();
    }
	

    @PostMapping("/add")
    public ResponseEntity<Object> createPersonnel(@RequestBody Personnel personnel) {
    	Personnel p=personnelservice.savePersonnel(personnel);

    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(p.getId()).toUri();

    	return ResponseEntity.created(location).build();

    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Object> update(@RequestBody Personnel personnel, @PathVariable long id) {

    	Personnel personnelOptional = personnelservice.getPersonnelById(id);

    	if (personnelOptional==null)
    		return ResponseEntity.notFound().build();

    	personnel.setId(id);
    	
    	personnelservice.updatePersonnel(personnel);

    	return ResponseEntity.noContent().build();
    }
    
	@GetMapping("/{id}")
	Personnel personnelById(@PathVariable long id) {
        return personnelservice.getPersonnelById(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityPersonnel() {
        return personnelservice.getQuantityOfPersonnel();
    }
	
	@GetMapping("/personnelByName/{name}")
	Personnel personnelByName(@PathVariable String name) {
        return personnelservice.findPersonnelByName(name);
    }
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable long id) {
		personnelservice.deletePersonnel(id);
        return true;
    }
	
}
