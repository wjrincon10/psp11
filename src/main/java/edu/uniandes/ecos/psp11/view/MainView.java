/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp11.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class MainView {
     public static void showHome(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        PrintWriter pw = resp.getWriter();
        pw.write("<html>");
        pw.println("<h1>PSP 1.1 Program!</h1>");
        
         pw.write("<form action=\"calc\" method=\"post\"> \n" +
                "    Ingrese los numeros X: <input type=\"text\" name=\"calcx\">\n" +
                "    Ingrese los numeros Y: <input type=\"text\" name=\"calcy\">\n" +
                "    <input type=\"submit\" value=\"Calc\">\n" +
                "</form> ");
        pw.write("</html>");

    }
    
    public static void showResults(HttpServletRequest req, HttpServletResponse resp,  String valuesX, String valuesY, Double VS, Double S, Double M, Double L, Double VL)
            throws ServletException, IOException {
        resp.getWriter().println("<b>List X:</b> "+valuesX +"<br>");
        resp.getWriter().println("<b>List Y:</b> "+valuesY +"<br>");
        resp.getWriter().println("<b>VS:</b> "+ VS + "<br>");
        resp.getWriter().println("<b>S:</b> "+ S + "<br>");
        resp.getWriter().println("<b>M:</b> "+ M + "<br>");
        resp.getWriter().println("<b>L:</b> "+ L + "<br>");
        resp.getWriter().println("<b>VL:</b> "+ VL + "<br>");
        //resp.getWriter().println("<b>STD: </b> "+stdDev + "<br>");
    }
    
    public static void error(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("Error!!!");
    }
}
