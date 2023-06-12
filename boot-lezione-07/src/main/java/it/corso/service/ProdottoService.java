package it.corso.service;

import javax.servlet.http.HttpSession;

public interface ProdottoService 
{
	void creaCatalogo(HttpSession session);
	
	void aggiungiACarrello(HttpSession session, int idProdotto);
}
