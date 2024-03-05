package br.ifsp.edu.arq.arqweb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	

	public RegisterServlet() {
		super();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//obter dados da requisição
				req.setCharacterEncoding("UTF-8");
				String fullName = req.getParameter("fullName");
				String email = req.getParameter("email");
				String email2 = req.getParameter("email2");
				String[] options = req.getParameterValues("options");
				String selectedOptions = " ";
				for(String opt: options) {
					selectedOptions += opt + " ";
				}
				
				//gerar a resposta 
				resp.setContentType("text/html;charset=UTF-8");
				PrintWriter writer = resp.getWriter();
				writer.println("<html>");
				
				writer.println("<head>");
						writer.println("\t<meta charset=\"UTF-8\" >");
						writer.println("\t<title>Páginade Resposta - Register App </title>");
					writer.println("</head>");
					
					writer.println("<body>");
							writer.println("\t<h1>Cadastro realizado com sucesso!</h1>");
							writer.println("\t<h2>Nome completo:" + fullName +  "</h2>");
							writer.println("\t<h2>E-mail:" + email +  "</h2>");
							writer.println("\t<h2>E-mail Secundário:" + email2 +  "</h2>");
							writer.println("\t<h2>Interesses nos Cursos:" + selectedOptions +  "</h2>");
					writer.println("</body>");	

				writer.println("</html>");
				writer.close();
				
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}
}
