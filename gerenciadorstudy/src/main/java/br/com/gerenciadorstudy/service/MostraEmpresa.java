package br.com.gerenciadorstudy.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorstudy.modelo.Banco;
import br.com.gerenciadorstudy.modelo.Empresa;

public class MostraEmpresa {

	public void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paremId = request.getParameter("id");
		Integer id  = Integer.valueOf(paremId);
		
		Banco banco = new Banco();
		
		Empresa emp = banco.buscaEmpresaID(id);
		
		System.out.println(emp.getNome()+" "+emp.getId());
		
		
		request.setAttribute("empresa", emp);
		RequestDispatcher rd = request.getRequestDispatcher("/FormAlteraEmpresa.jsp");
		rd.forward(request, response);
		
	}

}
