package org.bookworm.library.repositories;

import org.bookworm.library.entities.Publisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

    Page<Publisher> findAll(@NotNull Pageable pageable);

    Optional<Publisher> findById(Integer id);

    Publisher save(@NotNull Publisher branch);

    void deleteById(Integer id);
}
