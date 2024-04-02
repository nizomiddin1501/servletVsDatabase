package uz.developers.controller;

import uz.developers.model.Laptop;
import uz.developers.service.DatabaseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
@WebServlet(value = "/laptopServlet")
public class LaptopServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DatabaseService databaseService = new DatabaseService();
        ArrayList<Laptop> laptopList = databaseService.getLaptop();

        req.setAttribute("laptopList",laptopList);
        req.getRequestDispatcher("/Laptop.jsp").forward(req,resp);





    }
}
