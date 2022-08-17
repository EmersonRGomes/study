package br.com.gerenciadorstudy.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorstudy.modelo.Banco;

public class RemoveEmpresa {

	public void run(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String paremId = request.getParameter("id");
		Integer id  = Integer.valueOf(paremId);
		
		//System.out.println("Valor a ser removido: "+id);
		
		Banco banco = new Banco();
		banco.remove(id);
		
		response.sendRedirect("/gerenciadorstudy/controller?acao=listaEmpresa");
		
	}

}
