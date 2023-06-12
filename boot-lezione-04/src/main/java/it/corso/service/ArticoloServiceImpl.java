package it.corso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.corso.model.Articolo;

@Service
public class ArticoloServiceImpl implements ArticoloService 
{

	@Override
	public List<Articolo> getCatalogo() 
	{
		List<Articolo> catalogo = new ArrayList<>();
		
		Articolo uno = new Articolo();
		uno.setId(1);
		uno.setDescrizione("Maglione di lana");
		uno.setPrezzo(59.9099299);
		
		Articolo due = new Articolo();
		due.setId(2);
		due.setDescrizione("Televisore 4k");
		due.setPrezzo(599.97689);
		
		Articolo tre = new Articolo();
		tre.setId(3);
		tre.setDescrizione("iPhone 13");
		tre.setPrezzo(699.0067);
		
		catalogo.add(uno);
		catalogo.add(due);
		catalogo.add(tre);
		
		return catalogo;
	}

}
