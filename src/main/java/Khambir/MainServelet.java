package Khambir;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dio on 11.03.2017.
 */
public class MainServelet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        requestHandler(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        requestHandler(request, response);
    }


    private void requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String view = null;
        if (request.getRequestURI().equals("/")){
            view = "home";
        }
        if (request.getRequestURI().equals("/login")){
            view = "login";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(getView(view));

        try {
            dispatcher.forward(request, response);
        }catch (IOException | ServletException e){

        }
    }

     private String getView(String view){
         String prefix = "/WEB-INF/";
         String sufix = ".jsp";
         return prefix+view+sufix;
     }
}
