
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
import model.bean.Disciplinas;
import model.dao.DisciplinasDAO;


@WebServlet(name = "DisciplinaController", urlPatterns = {"/DisciplinaController", "/disciplinas", "/disciplina"})
public class DisciplinaController extends HttpServlet {

    Gson conversor = new Gson();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String paginaAtual = request.getServletPath();
        
        switch(paginaAtual) {
            
            case "/disciplinas":
                
                response.setContentType("application/JSON");
                response.setCharacterEncoding("UTF-8");
                
                Map<String, List<Disciplinas>> res2 = new HashMap<String, List<Disciplinas>>();
                
                List<Disciplinas> listDis = new DisciplinasDAO().listar();
                
                res2.put("disciplinas", listDis);
                
                PrintWriter out2 = response.getWriter();
                
                out2.write(conversor.toJson(res2));
                out2.flush();
                
                break;
            
            case "/disciplina":
                
                response.setContentType("application/JSON");
                response.setCharacterEncoding("UTF-8");
                
                int id = Integer.parseInt(request.getParameter("id_disciplina"));
                
                PrintWriter out3 = response.getWriter();
                
                out3.write(conversor.toJson(new DisciplinasDAO().lerDisciplinaEspecifica(id)));
                out3.flush();
                
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
