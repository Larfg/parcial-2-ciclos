package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Review;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.ReviewDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ReviewMapper;

public class MyBatisReviewDAO implements ReviewDAO {

    @Inject
    private ReviewMapper reviewMapper;

    @Override
    public List<Review> buscarPorLibro(int libroId) throws PersistenceException {
        return reviewMapper.getByBook(libroId);
    }
}
