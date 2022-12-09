package com.example.demo.services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.PersonnelRepository;
import com.example.demo.persistance.dao.RoleEquipeRepository;
import com.example.demo.persistance.entities.Equipe;
import com.example.demo.persistance.entities.RoleEquipe;
import com.example.demo.services.interfaces.IRoleEquipe;
@Service
public class RoleEquipeService implements IRoleEquipe{

	@Autowired
	RoleEquipeRepository roleEquipeRepository;
	
    @Autowired
    public void setRoleEquipeRepository(RoleEquipeRepository roleEquipeRepository){
        this.roleEquipeRepository=roleEquipeRepository;
    }
	@Override
	public List<RoleEquipe> listAllRole() {
		// TODO Auto-generated method stub
		return roleEquipeRepository.findAll();
	}

	@Override
	public RoleEquipe saveRole(RoleEquipe e) {
		// TODO Auto-generated method stub
		return roleEquipeRepository.save(e);
	}

	@Override
	public RoleEquipe updateRole(RoleEquipe e) {
		// TODO Auto-generated method stub
		return roleEquipeRepository.saveAndFlush(e);
	}

	@Override
	public RoleEquipe getRoleById(long id) {
		// TODO Auto-generated method stub
		return roleEquipeRepository.getById(id);
	}

	@Override
	public boolean deleteRole(long id) {
		// TODO Auto-generated method stub
		roleEquipeRepository.deleteById(id);
		return true;
	}

	@Override
	public boolean deleteAllRole() {
		// TODO Auto-generated method stub
		roleEquipeRepository.deleteAll();
		return true;
	}

}
