package com.gestiondepartement.magementapp.repositories;

import com.gestiondepartement.magementapp.models.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Integer> {
}
