package br.com.gerenciadorstudy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorstudy.modelo.Banco;
import br.com.gerenciadorstudy.modelo.Empresa;


@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Altera empresa Servlet");
		
	    String parmEmpresa = request.getParameter("nome");
	    
	    String parmId =request.getParameter("id");
	    Integer id = Integer.valueOf(parmId);
   
	    //Validação se o id é valido
	    
	    Banco banco = new Banco();
	    Empresa emp = banco.buscaEmpresaID(id);
	    
	    if (emp !=null) {
	    	banco.atualizar(parmEmpresa, emp);
	    }else {
	    	System.out.println("O ID nãofoi localizado");
	    }
	    System.out.println("Empresa alterada com sucesso");	
	    
	    response.sendRedirect("listaEmpresas");
	}

}
