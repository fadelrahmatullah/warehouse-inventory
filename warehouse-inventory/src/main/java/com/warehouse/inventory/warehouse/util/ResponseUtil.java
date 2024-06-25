package com.warehouse.inventory.warehouse.util;

import org.springframework.stereotype.Component;

import com.warehouse.inventory.warehouse.constants.ResponseStatus;
import com.warehouse.inventory.warehouse.dto.Response;

import java.util.Date;

@Component
public class ResponseUtil {

	public <T> Response<T> generateResponseSuccess(String messageCode, T data, String... varValues) {
		
		Response<T> result = new Response<>(ResponseStatus.SUCCESS, new Date());
		result.setMessageCode(messageCode);
		result.setMessage("Success");
		result.setData(data);

		return result;
	}

	public <T> Response<T> generateResponseSuccess(T data) {

		return this.generateResponseSuccess("0001SUCC", data);
	}

	public <T> Response<T> generateResponseError(String messageCode, T data, String... varValues) {

		Response<T> result = new Response<>(ResponseStatus.ERROR, new Date());
		result.setMessageCode(messageCode);
		result.setMessage("Error : "+varValues.toString());
		result.setData(null);
		return result;

	}

	public Response<Object> generateResponseSuccess() {
		return this.generateResponseSuccess(null);
	}

	public Response<Object> generateResponseError(Exception ex) {
		Response<Object> result = new Response<>(ResponseStatus.ERROR, new Date());
		result.setMessageCode("0001ERR");
		result.setMessage(ex.getMessage());

		return result;
	}

	public Response<Object> generateResponseError(String messageCode, String... varValues) {
		Response<Object> result = new Response<>(ResponseStatus.ERROR, new Date());
		result.setMessageCode("0001ERR");
		result.setMessage(varValues.toString());

		return result;
	}
}