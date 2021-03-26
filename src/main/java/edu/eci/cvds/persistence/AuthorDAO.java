package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Author;

public interface AuthorDAO {

	public List<Author> listarTodos() throws PersistenceException;

	public Author buscarAutor(int autorId) throws PersistenceException;
	
}
