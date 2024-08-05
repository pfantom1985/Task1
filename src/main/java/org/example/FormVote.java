package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.time.LocalDateTime.*;

@WebServlet(name = "PrintServlet", urlPatterns = "/results")
public class FormVote extends HttpServlet {
//@Override
// protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//writer.write(твой html);
//}

    @Override
    protected void doPost(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        //List<Vote> votes = new ArrayList<>();

//TODO заполнить.
//String[] names = req.getParameterValues("name");

        String artists = req.getParameter("artist");
        String[] genres = req.getParameterValues("genre");
        LocalDateTime dateTime = LocalDateTime.now();
        String about = req.getParameter("text");
// в процессе.
        VotingResults votes = new VotingResults();
        votes.add(new Vote(artists, Arrays.toString(genres), about, dateTime));

//TODO валидация 1 группа минимум 3 жанра. если ок вернуть списки, если нет - вернуть страницу ошибки.


//        for (String name : names) {
//            writer.write("<p>" + "name - " + name + "</p>");
//        }

    }
}