package com.ita.u1.firstWebAppl.servlet;

import com.ita.u1.firstWebAppl.dao.FileReader;
import com.ita.u1.firstWebAppl.dao.Readable;
import com.ita.u1.firstWebAppl.service.Sorter;
import com.ita.u1.firstWebAppl.service.Sortable;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.util.List;

public class myServlet extends HttpServlet {
    
    static final String pathToJspPage = "/main.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Readable reader = new FileReader();
        List<Integer> list = reader.getList();
       
        request.setAttribute("LIST", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher(pathToJspPage);
        dispatcher.forward(request, response);   
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Readable reader = new FileReader();
        List<Integer> list = reader.getList();
        
        Sortable sorter = new Sorter();
        list = sorter.sort(list);
        
        request.setAttribute("LIST", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher(pathToJspPage);
        dispatcher.forward(request, response); 
    }
}
