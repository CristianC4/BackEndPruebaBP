package com.castle.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.castle.prueba.dto.DeleteRequestDTO;
import com.castle.prueba.dto.ResponsePruebaDTO;
import com.castle.prueba.entity.SolicitudEntity;
import com.castle.prueba.services.SolicitudService;

@RestController
@CrossOrigin(origins = "*")
public class SolicitudController {

	@Autowired
	private SolicitudService solicitudService;
	
	@GetMapping(value = "/getAll", produces = {"application/json"})
	public ResponsePruebaDTO<List<SolicitudEntity>> getAllSolicitudes(){
		return solicitudService.getAllSollicitudes();
	}
	
	@GetMapping(value = "/getSolicitud", produces = {"application/json"})
	public ResponsePruebaDTO<SolicitudEntity> getSolicitudById(@RequestParam Integer id){
		return solicitudService.getSolicitudById(id);
	}
	
	@DeleteMapping(value = "/deleteSolicitud", produces = {"application/json"})
	public ResponsePruebaDTO<Boolean> deleteSolicitud(@RequestBody DeleteRequestDTO request){
		return solicitudService.deleteSolicitud(request.getIdSolicitud());
	}
	
	@PostMapping(value = "/createSolicitud", produces = {"application/json"})
	public ResponsePruebaDTO<SolicitudEntity> createSolicitud(@RequestBody SolicitudEntity solicitud){
		return solicitudService.createSolicitud(solicitud);
	}
	
	@PostMapping(value = "/updateSolicitud", produces = {"application/json"})
	public ResponsePruebaDTO<SolicitudEntity> updateSolicitud(@RequestBody SolicitudEntity solicitud){
		return solicitudService.updateSolicitud(solicitud);
	}
	
	@GetMapping(value = "/getSolicitudByClient", produces = {"application/json"})
	public ResponsePruebaDTO<SolicitudEntity> getSolicitudByIdClient(@RequestParam String idClient){
		return solicitudService.getSolicitudByIdClient(idClient);
	}
	
}
