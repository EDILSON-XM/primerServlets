package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SaludoServlet
 */
public class SaludoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaludoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida=response.getWriter();
		
		salida.println("<h1> respuesta del formulario</h1>");
		
		String nombre=request.getParameter("nombre");
		
		String apellidos=request.getParameter("ape");
		if(nombre==null|| apellidos==null|| nombre.isBlank()||apellidos.isBlank()) {
			salida.println("<p>Debe introducir nombre y apellidos </p>");
			salida.println("<a href='formulario.html'> Volver </a>");
		}else {
		salida.println("<h2> Bienvenido " + nombre + " " + apellidos + " </h2>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
