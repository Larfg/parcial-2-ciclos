package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import edu.eci.cvds.entities.Author;
import org.apache.ibatis.annotations.Param;

public interface AuthorMapper {

	public List<Author> getAuthors();

	public Author getAuthors(@Param("authorId") int authorId);

}
