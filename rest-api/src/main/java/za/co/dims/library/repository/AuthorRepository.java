package za.co.dims.library.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import za.co.dims.library.domain.Author;

import java.io.Serializable;

/**
 * Created by dims on 2017/09/01.
 */

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Serializable> {
}
