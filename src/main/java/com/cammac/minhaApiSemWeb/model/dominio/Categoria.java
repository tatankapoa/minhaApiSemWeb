package com.cammac.minhaApiSemWeb.model.dominio;

public enum Categoria {
	
	BEAUTY("beauty", "beleza"),
	FRAGRANCES("fragrances","fragrâncias"),
	FURNITURE("furniture","móveis"),
	GROCERIES("groceries","mercearia");
	
	
	private final String value;

	private final String description;
	
	private Categoria(String value, String description) {
		this.value = value;
		this.description = description;
	}
	
	public static Categoria obtemCategoria(String value) {
		for (Categoria dominio : Categoria.values()) {

			if (dominio.getValue().equalsIgnoreCase(value)) {
				return dominio;
			}
		}

		return null;
	}

	public String getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	
	
}
