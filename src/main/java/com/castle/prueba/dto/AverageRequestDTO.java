package com.castle.prueba.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class AverageRequestDTO implements Serializable{

	private static final long serialVersionUID = 5182430443945096473L;
	private Integer idSolicitud;
	private Date dateSolicitud;
	
}
