package br.com.gerenciadorstudy.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorstudy.modelo.Banco;
import br.com.gerenciadorstudy.modelo.Empresa;

public class AdicionarEmpresa {

	public void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parmNomeEmpresa = request.getParameter("nome");
		
		System.out.println("adiconando empresa "+ parmNomeEmpresa);
		//Objeto empresa para adiconar informa��o no banco de dados
		Empresa empresa = new Empresa();
		empresa.setNome(parmNomeEmpresa);
		
		//Simulando a conex�o com o banco de dados
		Banco banco = new Banco();
		banco.adiconar(empresa);
		
	
		//Chamando o JSP
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresaName", empresa.getNome());
		rd.forward(request, response);
		
		
	}
	

}
