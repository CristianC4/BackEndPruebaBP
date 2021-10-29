package com.castle.prueba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import java.io.Serializable;


import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "t01_solicitud", schema = "public", indexes = @Index(columnList = "id_cliente"))
@Data
public class SolicitudEntity implements Serializable{
	
	private static final long serialVersionUID = -938186941399884002L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "estado")
	private Integer state;
	
	@Column(name = "fecha_ingreso")
	private Date initDate;
	
	@Column(name = "monto")
	private Integer amount;
	
	@Column(name = "id_cliente")
	private String idClient;
	
}
