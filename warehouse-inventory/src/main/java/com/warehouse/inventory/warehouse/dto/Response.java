package com.warehouse.inventory.warehouse.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.warehouse.inventory.warehouse.constants.ResponseStatus;

import lombok.Data;
import lombok.NonNull;

@Data
public class Response<T> {
	@NonNull
	private ResponseStatus status;
	private String messageCode;
	private String message;
	@NonNull
	@JsonFormat(pattern = "dd-MMM-yyyy HH:mm:ss")
	private Date processFinishDate;
	private T data;

}
