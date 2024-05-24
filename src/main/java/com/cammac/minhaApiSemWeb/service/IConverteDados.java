package com.cammac.minhaApiSemWeb.service;

public interface IConverteDados {

	<T> T obterDados(String json,Class<T> classe);
}
