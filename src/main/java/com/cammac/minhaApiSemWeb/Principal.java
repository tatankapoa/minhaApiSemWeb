package com.cammac.minhaApiSemWeb;

import com.cammac.minhaApiSemWeb.model.Produto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Principal {

	public static void main(String[] args) throws Throwable, JsonProcessingException {
		String json = """
		        {
		            "products": [
		                {
		                    "id": 1,
		                    "title": "Essence Mascara Lash Princess",
		                    "description": "The Essence Mascara Lash Princess is a popular mascara known for its volumizing and lengthening effects. Achieve dramatic lashes with this long-lasting and cruelty-free formula.",
		                    "category": "beauty"
		                }
		            ]
		        }
		        """;

		        ObjectMapper mapper = new ObjectMapper();
		        Produto[] products = mapper.readValue(json, Produto[].class);

		        for (Produto product : products) {
		            System.out.println(product);
		        }
		    }

	}


