package it.corso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.corso.model.Operazione;

public interface OperazioneDao extends CrudRepository<Operazione, Integer>
{
	List<Operazione> findByDescrizione(String Descrizione);
}
