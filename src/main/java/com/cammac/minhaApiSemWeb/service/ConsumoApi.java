package com.cammac.minhaApiSemWeb.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
	
	public String obterDados(String url) {
		
		HttpClient client = HttpClient.newHttpClient();		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		
		
		HttpResponse<String> response = null;
		
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(); 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
		
		String json = response.body();
		return json;
		
	}

}
