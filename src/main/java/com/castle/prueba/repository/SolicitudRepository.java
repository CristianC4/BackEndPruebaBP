package com.castle.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.castle.prueba.entity.SolicitudEntity;

@Repository
public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Integer>{
	public SolicitudEntity findByIdClient(String idClient);
}
