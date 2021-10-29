package com.castle.prueba.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class ResponsePruebaDTO<T> implements Serializable{ 
	
	private static final long serialVersionUID = 4585354669378049960L;
	
	private Integer code;
	private String message;
	private T data;
}
