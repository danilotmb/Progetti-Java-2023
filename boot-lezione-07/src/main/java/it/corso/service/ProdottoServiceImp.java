package it.corso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import it.corso.model.Prodotto;

@Service
public class ProdottoServiceImp implements ProdottoService {

	@Override
	public void creaCatalogo(HttpSession session) 	
	{
		List<Prodotto> catalogo = new ArrayList<>();
		for (int i = 1; i <= 10; i++)
		{
			Prodotto prodotto = new Prodotto();
			
			prodotto.setId(i);
			prodotto.setDescrizione("prodotto " + i);
			prodotto.setPrezzo((new Random().nextDouble() + 0.1) * 100);
			
			catalogo.add(prodotto);
		}
		
		session.setAttribute("catalogo", catalogo);
		

	}

	@Override
	public void aggiungiACarrello(HttpSession session, int idProdotto) 
	{
		@SuppressWarnings("unchecked")
		List<Prodotto> catalogo = (List<Prodotto>) session.getAttribute("catalogo");
		@SuppressWarnings("unchecked")
		List<Prodotto> carrello = session.getAttribute("carrello") == null ? 
				new ArrayList<>() : (List<Prodotto>) session.getAttribute("carrello");
		
		for(Prodotto p : catalogo)
			if(p.getId() == idProdotto)
			{
				carrello.add(p);
				break;
			}
			session.setAttribute("carrello", carrello);
	}
	
	

}
