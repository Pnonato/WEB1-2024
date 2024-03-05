package br.edu.ifsp.arq.arqweb1;

import java.io.IOException;
import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet
	

private static final long serialVersionUID = 1L;
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("UTF-8");
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			LocalDate dateNow = LocalDate.now();
			
			
			String data = req.getParameter("date");
			
		    LocalDate dateParameter = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

			
			dateNow.compareTo(data);
			
			
		}
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
		}

}
