package com.meeplay.backend.repository;

import com.meeplay.backend.model.Sesion;
import com.meeplay.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SesionRepository extends JpaRepository<Sesion, Long> {
    List<Sesion> findByHost(User host);
}
