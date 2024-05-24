package com.cammac.minhaApiSemWeb.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{

	private ObjectMapper mapper = new ObjectMapper();
	
	@Override
	public <T> T obterDados(String json, Class<T> classe) {
		
		try {
			return mapper.readValue(json, classe);
	
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}

}
