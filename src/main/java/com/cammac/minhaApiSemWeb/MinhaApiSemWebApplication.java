package com.cammac.minhaApiSemWeb;

import java.text.NumberFormat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cammac.minhaApiSemWeb.model.ProductReview;
import com.cammac.minhaApiSemWeb.model.Produto;
import com.cammac.minhaApiSemWeb.service.ConsumoApi;
import com.cammac.minhaApiSemWeb.service.ConverteDados;

@SpringBootApplication
public class MinhaApiSemWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MinhaApiSemWebApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		
		var consumoApi = new ConsumoApi();
		
		var json = consumoApi.obterDados("https://dummyjson.com/products/1");
		
		System.out.println(json);
		
		ConverteDados converteDados = new ConverteDados();
		Produto produto = converteDados.obterDados(json,Produto.class);
		System.out.println();
		System.out.println("Produto:");
        System.out.println("ID: " + produto.id());
        System.out.println("Nome: " + produto.descricao());
        System.out.println("Marca: " + produto.marca());
        System.out.println("Categoria: " + produto.categoriaEnum().getDescription());
        System.out.println("Preço: " + currencyFormat.format(produto.preco()));
        System.out.println("Estoque: " + produto.estoque());
        
        System.out.println("**** Comentários *****");

        for (ProductReview review  : produto.feedback()) {
            System.out.println("- Nota: " + review.nota());
            System.out.println("  Comentário: " + review.comentario());
            System.out.println("  Data: " + review.data());
            System.out.println("  Nome  Avaliador: " + review.nomeAvaliador());
            System.out.println("  Email Avaliador: " + review.emailAvaliador());
            
        }
	}
}

