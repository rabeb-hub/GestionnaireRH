package com.example.demo.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.persistance.entities.Equipe;
import com.example.demo.persistance.entities.RoleEquipe;

@Service
public interface IRoleEquipe {
	List<RoleEquipe> listAllRole();
	RoleEquipe saveRole(RoleEquipe e);
    RoleEquipe updateRole(RoleEquipe e);
    RoleEquipe getRoleById(long id);
    boolean deleteRole(long id);
    boolean deleteAllRole();
}
