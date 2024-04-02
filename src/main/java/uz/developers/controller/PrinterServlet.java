package uz.developers.controller;

import uz.developers.model.Printer;
import uz.developers.service.DatabaseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
@WebServlet(value = "/printerServlet")
public class PrinterServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DatabaseService databaseService = new DatabaseService();
        ArrayList<Printer> printerList = databaseService.getPrinter();

        req.setAttribute("printerList",printerList);
        req.getRequestDispatcher("/Printer.jsp").forward(req,resp);
    }
}
