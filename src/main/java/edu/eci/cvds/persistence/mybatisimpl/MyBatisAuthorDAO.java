package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Author;
import edu.eci.cvds.persistence.AuthorDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.AuthorMapper;

/**
 * Implementación de {@link AuthorDAO}
 */
public class MyBatisAuthorDAO implements AuthorDAO {

	@Inject
	private AuthorMapper authorMapper;

	@Override
	public List<Author> listarTodos() throws PersistenceException {
		try {
			return authorMapper.getAuthors();
		} catch (Exception e) {
			throw new PersistenceException("listarTodos persistence error");
		}
	}

	@Override
	public Author buscarAutor(int autorId) throws PersistenceException {
		try {
			return authorMapper.getAuthors(autorId);
		} catch (Exception e) {
			throw new PersistenceException("buscarAutor persistence error");
		}
	}

}
