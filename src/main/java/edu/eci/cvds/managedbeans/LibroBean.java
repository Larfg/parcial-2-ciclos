package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Author;
import edu.eci.cvds.entities.Book;
import edu.eci.cvds.services.ECIBookServices;
import edu.eci.cvds.services.ServicesException;

/**
 * Bean para la interfaz de usuario de los programas
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "libroBean")
@RequestScoped
public class LibroBean extends BasePageBean {

	/**
	 * Default generated serial version id
	 */
	private static final long serialVersionUID = -1071897882966043904L;

	@Inject
	private ECIBookServices ECIBookServices;

	@ManagedProperty(value = "#{param.author}")
	private Integer autorId;

	private Author author;

	private void loadAutor() {
		try {
			System.out.println("Carga inicial");
			System.out.println("Carga con " + autorId + " y " + ECIBookServices);
			System.out.println("Carga después");
			if (autorId != null) {
				author = ECIBookServices.buscarAutor(autorId);
				System.out.println("Encontró: " + author);
			}
		} catch (ServicesException e) {
			e.printStackTrace();
		}
	}

	public List<Book> getLibros() throws Exception {
		try {
			if (autorId == null) {
				return ECIBookServices.listarLibros();
			} else {
				return ECIBookServices.buscarPorAutor(autorId);
			}
		} catch (ServicesException ex) {

			throw ex;
		}
	}

	public Integer getAutorId() {
		return autorId;
	}

	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}

	public Author getAutor() throws Exception {
		if (author == null && autorId != null) {
			author = ECIBookServices.buscarAutor(autorId);
		}
		return author;
	}

	public void setAutor(Author author) {
		this.author = author;
	}

}
