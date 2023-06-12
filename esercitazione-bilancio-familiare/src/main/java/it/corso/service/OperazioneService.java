package it.corso.service;

import java.util.List;

import it.corso.model.Operazione;


public interface OperazioneService 
{
	void registraOperazione (Operazione operazione);
	
	Operazione getOperazioneById (int id);
	
	List<Operazione> getOperazioni ();
	
	void cancellaOperazione (Operazione operazione);
}
