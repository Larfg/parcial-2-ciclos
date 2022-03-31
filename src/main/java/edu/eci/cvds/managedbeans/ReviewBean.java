package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Author;
import edu.eci.cvds.entities.Review;
import edu.eci.cvds.services.ECIBookServices;
import edu.eci.cvds.services.ServicesException;

@SuppressWarnings("deprecation")
@ManagedBean(name = "reviewBean")
@RequestScoped
public class ReviewBean extends BasePageBean {

    @Inject
    private ECIBookServices ECIBookServices;

    static int libro_id;
    private Review review;
    List<Review> reviewList;
    String resena;



    public List<Review> buscarResenasPorLibro() throws Exception {
        try {
            return ECIBookServices.buscarResenaPorLibro(libro_id);
        } catch (ServicesException ex) {
            throw ex;
        }
    }

    public void listaDeResenaAString() {
            for (Review review:reviewList) {
                resena += review.toString();
            }
    }

}