package com.cammac.minhaApiSemWeb.model;

import java.util.List;

import com.cammac.minhaApiSemWeb.model.dominio.Categoria;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Produto(@JsonAlias("id") Long id,
				      @JsonAlias("title") String descricao,
				      @JsonAlias("category") String categoria,
				      @JsonAlias("price") Double preco,
				      @JsonAlias("stock") Integer estoque,
				      @JsonAlias("brand") String marca,
				      @JsonAlias("sku") String sku,
				      @JsonAlias("reviews") List<ProductReview> feedback 
		
				      
				       
				      
		) {
	

	
	public Categoria categoriaEnum() {
        return Categoria.obtemCategoria(categoria);
    }

}
