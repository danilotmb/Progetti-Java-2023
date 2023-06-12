package it.corso.dao;

import org.springframework.data.repository.CrudRepository;

import it.corso.model.Contatto;

public interface ContattoDao extends CrudRepository<Contatto, Integer>
{

}
