package com.castle.prueba.services;

import com.castle.prueba.dto.AverageRequestDTO;
import com.castle.prueba.dto.AverageResponseDTO;
import com.castle.prueba.dto.ResponsePruebaDTO;
import com.castle.prueba.entity.SolicitudEntity;
import java.util.List;

public interface SolicitudService {
	
	public ResponsePruebaDTO<SolicitudEntity> getSolicitudById(Integer id);
	public ResponsePruebaDTO<List<SolicitudEntity>> getAllSollicitudes();
	public ResponsePruebaDTO<Boolean> deleteSolicitud(Integer id);
	public ResponsePruebaDTO<SolicitudEntity> createSolicitud(SolicitudEntity solicitud);
	public ResponsePruebaDTO<SolicitudEntity> updateSolicitud(SolicitudEntity solicitud);
	public ResponsePruebaDTO<SolicitudEntity> getSolicitudByIdClient(String idClient);
	public ResponsePruebaDTO<AverageResponseDTO> getAverageAmount(AverageRequestDTO request);
}
