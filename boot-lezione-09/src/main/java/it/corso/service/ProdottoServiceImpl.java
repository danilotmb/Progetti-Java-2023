package it.corso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.ProdottoDao;
import it.corso.model.Prodotto;


@Service
public class ProdottoServiceImpl implements ProdottoService 
{
	@Autowired
	private ProdottoDao prodottoDao;
	
	@Override
	public void registraProdotto(Prodotto prodotto) 
	{
		prodottoDao.save(prodotto);
		

	}

	@Override
	public Prodotto getProdottoById(int id) 
	{
		return prodottoDao.findById(id).get();		//essendo di tipo optional, aggiungo il get per forzare l'ottenimento dell'id
	}

	@Override
	public List<Prodotto> getProdotti() 
	{
		return (List<Prodotto>) prodottoDao.findAll();		//il findAll ritornando un oggetto ITERABLE ha bisogno del casting 
	}

	@Override
	public void cancellaProdotto(Prodotto prodotto) 
	{
		prodottoDao.delete(prodotto);
	}

}
