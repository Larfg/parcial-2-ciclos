package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Review;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReviewMapper {

    List<Review> getByBook(@Param("libro") int bookId);

}
