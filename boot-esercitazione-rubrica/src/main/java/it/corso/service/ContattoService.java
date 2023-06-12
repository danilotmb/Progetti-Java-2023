package it.corso.service;

import java.util.List;

import it.corso.model.Contatto;

public interface ContattoService 
{
	void registraContatto (Contatto contatto);
	Contatto getContattoById (int id);
	List<Contatto> getContatti();
	void cancellaContatto(Contatto contatto);
}
