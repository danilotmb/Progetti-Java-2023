package it.corso.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.multipart.MultipartFile;

import it.corso.dao.AutoreDao;
import it.corso.dao.CategoriaDao;
import it.corso.dao.LibroDao;
import it.corso.model.Autore;
import it.corso.model.Categoria;
import it.corso.model.Libro;


@Service
public class LibroServiceImpl implements LibroService 
{
	@Autowired
	LibroDao libroDao;
	
	@Autowired
	AutoreDao autoreDao;
	
	@Autowired
	CategoriaDao categoriaDao;
	
	
	
	@Override
	public void registraLibro(Object...dati) 
	{
		Libro libro = new Libro();
		
		Autore autore = null;
		
		Categoria categoria = null;
		
		Optional<Autore> autoreOptional = Optional.ofNullable(autoreDao.findByNomeAndCognome((String) dati [2], (String)dati[3]));
		if(autoreOptional.isPresent())
			autore = autoreOptional.get();
		else
		{
			autore = new Autore();
			autore.setNome((String) dati[2]);
			autore.setCognome((String) dati[3]);
			autoreDao.save(autore);
			
		}
		
		Optional<Categoria> categoriaOptional = Optional.ofNullable(categoriaDao.findByDescrizione((String) dati[4]));
		
		if (categoriaOptional.isPresent())
			categoria = categoriaOptional.get();
		else
		{
			categoria = new Categoria();
			categoria = setDescrizione((String) dati[4]);
			categoriaDao.save(categoria);
			
		}
		
		MultipartFile copertina = (MultipartFile) dati[5];
		libro.setTitolo((String) dati[0]);
		libro.setTrama((String) dati[1]);
		libro.setAutore(autore);
		libro.setCategoria(categoria);
		
		if(copertina != null && !copertina.isEmpty())
		{
			try 
			{
				libro.setCopertina("data:image/png;base64," + Base64Utils.encodeToString(copertina.getBytes()));
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		libroDao.save(libro);
		
	}

	@Override
	public Libro getLibroById(int id) 
	{
		return libroDao.findById(id).get();
	}

	@Override
	public List<Libro> getLibri() 
	{
		return (List<Libro>) libroDao.findAll();
	}

	@Override
	public void cancellaLibro(Libro libro) 
	{
		libroDao.delete(libro);
	}

}
