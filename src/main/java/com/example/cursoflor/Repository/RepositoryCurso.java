package com.example.cursoflor.Repository;

import com.example.cursoflor.domain.Votante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCurso extends JpaRepository<Votante, Long> {
}
