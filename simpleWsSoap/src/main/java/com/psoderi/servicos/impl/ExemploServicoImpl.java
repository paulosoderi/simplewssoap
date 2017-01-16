package com.psoderi.servicos.impl;

import javax.jws.WebService;

import com.psoderi.servicos.ws.ExemploServico;

@WebService(endpointInterface = "com.psoderi.servicos.ws.ExemploServico")
public class ExemploServicoImpl implements ExemploServico{

	public String isAlive() {
		return "Estou vivo!!! E respondendo...";
	}
}
