package com.castle.prueba.dto;

import lombok.Data;
import java.io.Serializable;

import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class DeleteRequestDTO  implements Serializable{
	
	private static final long serialVersionUID = 2262995408503684872L;

	private Integer idSolicitud;
}
