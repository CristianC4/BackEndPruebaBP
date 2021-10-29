package com.castle.prueba.dto;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
public class AverageResponseDTO implements Serializable{

	private static final long serialVersionUID = -6237388280719589770L;
	private Date dateBestAverage;
	private Integer bestAmmount;
}
