/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;

/**
 *
 * @author lmene
 */
@WebServlet(name = "JsonListServlet", urlPatterns = {"/ApiSeuNomeServlet.json"})
public class ApiSeuNomeServlet extends HttpServlet {
    private ArrayList<String> list = new ArrayList<>();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
       try (PrintWriter out = response.getWriter()) {
    String[] materias = {"Ética e Responsabilidade Profissional", 
        "Banco de Dados", 
        "Engenharia de Software III",
        "Programação Orientada a Objetos",
        "Linguagem de Programação IV - INTERNET",
        "Sistemas Operacionais II",
        "Inglês IV",
        "Metodologia da Pesquisa Científico-Tecnológica"
    };
    
    JSONObject leandro = new JSONObject();
    leandro.put("LeandroAguiar", "RA: 1290482212017"); // Adicione o "RA" ao objeto JSON

    JSONArray materiasArray = new JSONArray();
    for (String materia : materias) {
        materiasArray.put(materia); // Adicione cada matéria ao array JSON
    }

    leandro.put("Materias", materiasArray); // Adicione o array de matérias ao objeto JSON

    out.print(leandro.toString());
}

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
