package br.com.gerenciadorstudy.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorstudy.modelo.Banco;
import br.com.gerenciadorstudy.modelo.Empresa;

public class ListaEmpresa {

	public void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Empresa> lista = Banco.getEmpresa();
		
		request.setAttribute("empresas", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresaCriada.jsp");
		rd.forward(request, response);
		
	}
	
	

}
