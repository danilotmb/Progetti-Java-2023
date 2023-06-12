package it.corso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.corso.model.Prodotto;

public interface ProdottoDao extends CrudRepository<Prodotto, Integer>  		//dobbiamo passare a questa repository i due tipi dati che verranno gestiti ( il primo e' il tipo dato che dovra' essere gestito, il secondo e' il tipo dato della chiave primaria)
{
	//QUERY METHODS: sono dei metodi che trasformano il proprio nome in query per i database
	List<Prodotto> findByDescrizione(String descrizione);
	
	
	//se il nome non e' trasformabile in linguaggio query sql utilizzo la notazione @Query dove passiamo la query scritta da noi, speciifichiamo che si tratti di una nativeQuery e nella list passiamo anche il marcatore usato nella query tramite il @Param
	@Query
	(
			value = "SELECT * FROM prodotti WHERE descizione = :d",
			nativeQuery = true
	)
	List<Prodotto> dammiProdotti (@Param("d") String desc);
}
