package it.corso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.OperazioneDao;
import it.corso.model.Operazione;


@Service
public class OperazioneServiceImpl implements OperazioneService 
{
	@Autowired
	private OperazioneDao operazioneDao;
	
	@Override
	public void registraOperazione(Operazione operazione) 
	{
		operazioneDao.save(operazione);
	}
	
	@Override
	public Operazione getOperazioneById(int id) 
	{
		return operazioneDao.findById(id).get();		
	}
	
	@Override
	public List<Operazione> getOperazioni() 
	{
		return (List<Operazione>) operazioneDao.findAll();	
	}
	
	@Override
	public void cancellaOperazione(Operazione operazione) 
	{
		operazioneDao.delete(operazione);
	}
}
