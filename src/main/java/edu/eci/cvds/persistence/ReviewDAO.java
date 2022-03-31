package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Review;

public interface ReviewDAO {

    public List<Review> buscarPorLibro(int libroId) throws PersistenceException;
}
