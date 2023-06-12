package it.corso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.ContattoDao;
import it.corso.model.Contatto;

@Service
public class ContattoServiceImpl implements ContattoService 
{
	@Autowired
	private ContattoDao contattoDao;

	@Override
	public void registraContatto(Contatto contatto) 
	{
		contattoDao.save(contatto);
	}

	@Override
	public Contatto getContattoById(int id)
	{
		return contattoDao.findById(id).get();
	}

	@Override
	public List<Contatto> getContatti() 
	{
		return (List<Contatto>) contattoDao.findAll();
	}

	@Override
	public void cancellaContatto(Contatto contatto) 
	{
	  contattoDao.delete(contatto);
	}

}
