package com.example.demo.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistance.entities.Personnel;
import com.example.demo.services.interfaces.IPersonnel;

@RestController
@RequestMapping("/api/personnel")
public class PersonnelController {

	@Autowired
	IPersonnel personnelservice;
	
    @GetMapping("")
    public List<Personnel> list() {
        return personnelservice.listAllPersonnel();
    }
	
/*	@RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	Personnel save(@RequestBody Personnel personnel) {	
		  System.out.println("*******save ***********");
		  Personnel p=personnelservice.savePersonnel(personnel);
		  System.out.println("*******"+p.getName());
        return p ;
    }
	
	*/
	@GetMapping("/{id}")
	Personnel personnelById(@PathVariable int id) {
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
