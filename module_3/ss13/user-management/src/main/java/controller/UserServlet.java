package controller;

import model.User;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateform(request, response);
                break;
            case "delete":
                showDeleteform(request, response);
                break;
            case "edit":
                showEditform(request, response);
                break;
            case "view":
                viewUser(request, response);
                break;
            case "findCountry":
                showFindCountryForm(request, response);
            default:
                listUser(request, response);
                break;
        }
    }

    private void showFindCountryForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("user/search.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = new ArrayList<>(userService.selectAllUsers().values());
        request.setAttribute("user", userList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/display.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void viewUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.selectUser(id);
        RequestDispatcher dispatcher;
        if (user == null) {
            dispatcher = request.getRequestDispatcher("user/error-404.jsp");
        } else {
            request.setAttribute("user", user);
            dispatcher = request.getRequestDispatcher("/view.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void showCreateform(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showDeleteform(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/delete.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showEditform(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(id);
        request.setAttribute("id", id);
        request.setAttribute("user", user);
        try {
            request.getRequestDispatcher("user/edit.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(request, response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
            case "edit":
                editUser(request, response);
                break;
            case "search":
                findCountry(request, response);
            default:
                break;
        }
    }

    private void findCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String country = request.getParameter("country");
        List<User> userList = null;
        try {
            userList = userService.findCountry(country);
            request.setAttribute("userList", userList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("user/search.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException | ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        int id = Integer.parseInt(request.getParameter("id"));
        User user = new User(id, name, email, country);
        request.setAttribute("user", user);
        request.getRequestDispatcher("user/update.jsp").forward(request, response);
        try {
            userService.updateUser(id, user);
            response.sendRedirect("/UserServlet");
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.selectUser(id);
        request.setAttribute("user", user);
        request.getRequestDispatcher("user/delete.jsp").forward(request, response);
        if (user == null) {
            request.getRequestDispatcher("user/error-404").forward(request, response);
        } else {
            try {
                userService.deleteUser(id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            response.sendRedirect("/UserServlet");
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        try {
            userService.insertUser(user);
            request.setAttribute("message1", "new user was created");
            request.setAttribute("user", user);
            request.getRequestDispatcher("user/create.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
