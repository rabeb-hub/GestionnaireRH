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

import com.example.demo.persistance.entities.RoleEquipe;
import com.example.demo.persistance.entities.Tache;
import com.example.demo.services.interfaces.IRoleEquipe;
import com.example.demo.services.interfaces.ITache;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	@Autowired
	IRoleEquipe roleService;

    @GetMapping("/getAll")
    public List<RoleEquipe> list() {
        return roleService.listAllRole();
    }
    
    @PostMapping("/add")
    public ResponseEntity<Object> createPersonnel(@RequestBody RoleEquipe role) {
    	RoleEquipe r=roleService.saveRole(role);

    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(r.getIdRole()).toUri();

    	return ResponseEntity.created(location).build();

    }
    
    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable long id) {
    	roleService.deleteRole(id);
    return true;
    }
}
