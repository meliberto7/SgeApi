
package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "HomeController", urlPatterns = {"/HomeController", "/ola"})
public class HomeController extends HttpServlet {

    Gson conversor = new Gson();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String paginaAtual = request.getServletPath();
        
        switch(paginaAtual) {
            
            case "/ola":
                
                response.setContentType("application/JSON");
                response.setCharacterEncoding("UTF-8");
                
                Map<String, String> res = new HashMap<String, String>();
                
                res.put("mensagem", "Hello word!");
                
                PrintWriter out = response.getWriter();
                
                out.write(conversor.toJson(res));
                out.flush();
                
                break;
            
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
