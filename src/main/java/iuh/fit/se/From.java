package iuh.fit.se;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "fromServlet", value = "/from-servlet"
)
public class From extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException {
        response.setContentType("text/plain");

        // Hello
        java.io.PrintWriter out = response.getWriter();
        out.println("Hello, this is a response from the From servlet!");
        out.println( "first name: "+ request.getParameter("first-name") );
        out.println( "last name: "+ request.getParameter("last-name") );
        out.println( "username: "+ request.getParameter("username") );
        out.println( "password: "+ request.getParameter("password") );
        out.println( "email: "+ request.getParameter("email") );
        out.println( "facebook: "+ request.getParameter("facebook") );
        out.println( "bio: "+ request.getParameter("bio") );

       out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        resp.setContentType("text/plain");
        java.io.PrintWriter out = resp.getWriter();
        out.println("This is a POST request response from the From servlet!");
        out.println("first name: " + req.getParameter("first-name"));
        out.println("last name: " + req.getParameter("last-name"));
        out.println("username: " + req.getParameter("username"));
        out.println("password: " + req.getParameter("password"));
        out.println("email: " + req.getParameter("email"));
        out.println("facebook: " + req.getParameter("facebook"));
        out.println("bio: " + req.getParameter("bio"));
        out.close();

    }

    @Override
    public void destroy() {
    }
}
