package com.meeplay.backend.repository;

import com.meeplay.backend.model.Inscripcion;
import com.meeplay.backend.model.InscripcionStatus;
import com.meeplay.backend.model.Sesion;
import com.meeplay.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
    List<Inscripcion> findBySesion(Sesion sesion);
    List<Inscripcion> findByPlayer(User player);
    Optional<Inscripcion> findBySesionAndPlayer(Sesion sesion, User player);
    int countBySesionAndStatus(Sesion sesion, InscripcionStatus status);
}
