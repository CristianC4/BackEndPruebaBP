package com.castle.prueba.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.castle.prueba.dto.ResponsePruebaDTO;
import com.castle.prueba.entity.SolicitudEntity;
import com.castle.prueba.repository.SolicitudRepository;
import com.castle.prueba.services.SolicitudService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class SolicitudServiceImpl implements SolicitudService{

	@Autowired
	private SolicitudRepository solicitudRepository;
	
	@Override
	public ResponsePruebaDTO<SolicitudEntity> getSolicitudById(Integer id) {
		ResponsePruebaDTO<SolicitudEntity> response = new ResponsePruebaDTO<>();
		try {
			log.info("INICIA SERVICIO DE OBTENER UNA SOLICITUD");
			response.setCode(1);
			response.setMessage("Consulta Exitosa");
			response.setData(solicitudRepository.findById(id).get());
			log.info("FINALIZA SERVICIO DE OBTENER UNA SOLICITUD");
		} catch (Exception e) {
			response.setCode(99);
			response.setMessage("Consulta Fallida");
			response.setData(null);
			log.info("ERROR EN EL SERVICIO DE OBTENER UNA SOLICITUD"+e);
		}
		return response;
	}

	@Override
	public ResponsePruebaDTO<List<SolicitudEntity>> getAllSollicitudes() {
		ResponsePruebaDTO<List<SolicitudEntity>> response = new ResponsePruebaDTO<>();
		try {
			log.info("INICIA SERVICIO DE OBTENER TODAS LAS SOLICITUDES");
			response.setCode(1);
			response.setMessage("Consulta Exitosa");
			response.setData(solicitudRepository.findAll());
			log.info("FINALIZA SERVICIO DE OBTENER TODAS LAS SOLICITUDES");
		} catch (Exception e) {
			response.setCode(99);
			response.setMessage("Consulta Fallida");
			response.setData(null);
			log.info("ERROR EN EL SERVICIO DE OBTENER TODAS LAS SOLICITUDES"+e);
		}
		return response;
	}

	@Override
	public ResponsePruebaDTO<Boolean> deleteSolicitud(Integer id) {
		ResponsePruebaDTO<Boolean> response = new ResponsePruebaDTO<>();
		try {
			log.info("INICIA SERVICIO DE BORRAR UNA SOLICITUD");
			solicitudRepository.deleteById(id);
			response.setCode(1);
			response.setMessage("Consulta Exitosa");
			response.setData(true);
			log.info("FINALIZA SERVICIO DE BORRAR UNA SOLICITUD");
		} catch (Exception e) {
			response.setCode(99);
			response.setMessage("Consulta Fallida");
			response.setData(false);
			log.info("ERROR EN EL SERVICIO DE BORRAR UNA SOLICITUD"+e);
		}
		return response;
	}

	@Override
	public ResponsePruebaDTO<SolicitudEntity> createSolicitud(SolicitudEntity solicitud) {
		ResponsePruebaDTO<SolicitudEntity> response = new ResponsePruebaDTO<>();
		try {
			if(solicitud.getInitDate().after(new Date(System.currentTimeMillis())) && solicitud.getAmount()>1000000) {
				log.info("INICIA SERVICIO DE CREAR UNA SOLICITUD");
				response.setCode(1);
				response.setMessage("Consulta Exitosa");
				response.setData(solicitudRepository.save(solicitud));
				log.info("FINALIZA SERVICIO DE CREAR UNA SOLICITUD");
			}else {
				response.setCode(99);
				response.setMessage("Consulta Fallida");
				response.setData(null);
				log.info("LOS DATOS NO COINCIDEN");
			}
			
		} catch (Exception e) {
			response.setCode(99);
			response.setMessage("Consulta Fallida");
			response.setData(null);
			log.info("ERROR EN EL SERVICIO DE CREAR UNA SOLICITUD"+e);
		}
		return response;
	}

	@Override
	public ResponsePruebaDTO<SolicitudEntity> updateSolicitud(SolicitudEntity solicitud) {
		ResponsePruebaDTO<SolicitudEntity> response = new ResponsePruebaDTO<>();
		try {
			log.info("INICIA SERVICIO DE ACTUALIZAR UNA SOLICITUD");
			response.setCode(1);
			response.setMessage("Consulta Exitosa");
			response.setData(solicitudRepository.save(solicitud));
			log.info("FINALIZA SERVICIO DE ACTUALIZAR UNA SOLICITUD");
		} catch (Exception e) {
			response.setCode(99);
			response.setMessage("Consulta Fallida");
			response.setData(null);
			log.info("ERROR EN EL SERVICIO DE ACTUALIZAR UNA SOLICITUD"+e);
		}
		return response;
	}

	@Override
	public ResponsePruebaDTO<SolicitudEntity> getSolicitudByIdClient(String idClient) {
		ResponsePruebaDTO<SolicitudEntity> response = new ResponsePruebaDTO<>();
		try {
			log.info("INICIA SERVICIO DE OBTENER UNA SOLICITUD POR CLIENTE");
			response.setCode(1);
			response.setMessage("Consulta Exitosa");
			response.setData(solicitudRepository.findByIdClient(idClient));
			log.info("FINALIZA SERVICIO DE OBTENER UNA SOLICITUD POR CLIENTE");
		} catch (Exception e) {
			response.setCode(99);
			response.setMessage("Consulta Fallida");
			response.setData(null);
			log.info("ERROR EN EL SERVICIO DE OBTENER UNA SOLICITUD POR CLIENTE"+e);
		}
		return response;
	}	

}
