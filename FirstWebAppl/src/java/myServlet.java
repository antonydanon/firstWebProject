/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Logic.Logic;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author anton
 */
public class myServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<Integer> list = Logic.getList();
        request.setAttribute("LIST", list);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/main.jsp");
        dispatcher.forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<Integer> list = Logic.getList();
        Collections.sort(list);
        
        request.setAttribute("LIST", list);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/main.jsp");
        dispatcher.forward(request, response);
        
    }

   

}
