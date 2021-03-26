package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Author;
import edu.eci.cvds.services.ECIBookServices;
import edu.eci.cvds.services.ServicesException;

/**
 * Bean para la interfaz de usuario de las decanaturas
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "autorBean")
@RequestScoped
public class AutorBean extends BasePageBean {

	@Inject
	private ECIBookServices ECIBookServices;

	public List<Author> getAutores() throws Exception {
		try {
			return ECIBookServices.listarAutores();
		} catch (ServicesException ex) {
			throw ex;
		}
	}

}
