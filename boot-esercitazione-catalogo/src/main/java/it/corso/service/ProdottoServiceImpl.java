package it.corso.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import it.corso.model.Prodotto;

@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Override
	public void creaCatalogo(HttpSession session) 
	{
		List<Prodotto> catalogo = new ArrayList<>();
		
			Prodotto prodotto1 = new Prodotto();
			
			prodotto1.setId(1);
			prodotto1.setTitolo("Samsung-SM-A13");
			prodotto1.setDescrizione("Samsung Galaxy A13 Smartphone Android, Processore Dual+Exa Core, Display Infinity-V da 6.6, Android 12.3 GB RAM, 32 GB di Memoria Interna Espandibile, Batteria 5.000 mAh ");
			prodotto1.setPrezzo(143.89);
			
			catalogo.add(prodotto1);
			
			Prodotto prodotto2 = new Prodotto();
			
			prodotto2.setId(2);
			prodotto2.setTitolo("Samsung-A32");
			prodotto2.setDescrizione("Samsung Galaxy A32 4G Smartphone Android Senza SIM 6.4 Pollici, Display Infinity-U FHD+, 4 Fotocamere Posteriori, 4GB RAM e 128GB, Batteria 5.000 mAh ");
			prodotto2.setPrezzo(212.00);
			
			catalogo.add(prodotto2);
		
			
			Prodotto prodotto3 = new Prodotto();
			
			prodotto3.setId(3);
			prodotto3.setTitolo("Samsung-A32");
			prodotto3.setDescrizione("Samsung Galaxy A32 4G Smartphone Android Senza SIM 6.4 Pollici, Display Infinity-U FHD+, 4 Fotocamere Posteriori, 4GB RAM e 128GB, Batteria 5.000 mAh ");
			prodotto3.setPrezzo(212.00);
			
			catalogo.add(prodotto3);
			

		
		session.setAttribute("catalogo", catalogo);

	}

}
