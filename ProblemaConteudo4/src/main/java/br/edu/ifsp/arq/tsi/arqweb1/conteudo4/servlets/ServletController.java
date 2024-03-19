package br.edu.ifsp.arq.tsi.arqweb1.conteudo4.servlets;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.tsi.arqweb1.conteudo4.model.Person;
import br.edu.ifsp.arq.tsi.arqweb1.conteudo4.model.PersonUtil;

@WebServlet("/ServletPersons")
public class ServletController extends HttpServlet{

	private static final long serialVersionUID = 1L;	
	
	
	public ServletController() {
		super();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String data = req.getParameter("persons");
		PersonUtil personUtil = new PersonUtil();
		List<Person> list = personUtil.getPersons(data);
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/Result.jsp");
		dispatcher.forward(req, resp);
	}
	
}
