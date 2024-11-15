package com.gmail.hamiltonjr2010.domain.repository;
import com.gmail.hamiltonjr2010.domain.model.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends JpaRepository<Writer, Long> {}
