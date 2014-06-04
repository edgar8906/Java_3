package morales.cuentas.controladores;

import morales.dependencia.perro.Perro;
import morales.dependencia.perro.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import morales.dependencia.perro.Gato;
import morales.dependencia.perro.Mascota;

public class ServletRegistro extends HttpServlet {


   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    Mascota mascota=new Gato();
    
    Persona x = new Persona();
    x.setMascota(mascota);
     
    request.setAttribute("registro", x);
    RequestDispatcher despachador=request.getRequestDispatcher("/registro.jsp");
    despachador.forward(request, response);
    
    }
}
