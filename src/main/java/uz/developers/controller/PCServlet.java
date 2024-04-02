package uz.developers.controller;

import uz.developers.model.PC;
import uz.developers.service.DatabaseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
@WebServlet(value = "/pcservlet")
public class PCServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DatabaseService databaseService = new DatabaseService();
        ArrayList<PC> pcList = databaseService.getPC();

        req.setAttribute("pcList",pcList);
        req.getRequestDispatcher("/PC.jsp").forward(req,resp);
    }
}
