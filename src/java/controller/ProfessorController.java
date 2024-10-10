package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Professores;
import model.dao.ProfessoresDAO;


@WebServlet(name = "ProfessorController", urlPatterns = {"/ProfessorController", "/professores"})
public class ProfessorController extends HttpServlet {

    Gson conversor = new Gson();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String paginaAtual = request.getServletPath();
        
        switch(paginaAtual) {
                
                case "/professores":
                
                response.setContentType("application/JSON");
                response.setCharacterEncoding("UTF-8");

                Map<String, List<Professores>> professores = new HashMap<String, List<Professores>>();
                
                ProfessoresDAO daoProf = new ProfessoresDAO();
                
                professores.put("professores", daoProf.listar());
                
                PrintWriter out = response.getWriter();
                
                out.write(conversor.toJson(professores));
                out.flush();
                
                break;
                
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
