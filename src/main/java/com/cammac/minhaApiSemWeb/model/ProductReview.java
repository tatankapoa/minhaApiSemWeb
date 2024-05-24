package com.cammac.minhaApiSemWeb.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ProductReview (@JsonAlias("rating") Integer nota,
			                 @JsonAlias("comment") String comentario,
			                 @JsonAlias("date") Date data,
			                 @JsonAlias("reviewerName") String nomeAvaliador,
			                 @JsonAlias("reviewerEmail") String emailAvaliador
		
		) {
	
}