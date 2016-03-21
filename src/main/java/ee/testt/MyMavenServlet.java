package ee.testt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by NightStranger on 3/22/2016.
 */
public class MyMavenServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {

        // Set response content type
        resp.setContentType("text/html");

        // Get parameter from request
        String paramValue = req.getParameter("param1");

        // Prepare output html
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + "Hello World from MyServlet!" + "</h1>");
        out.println("Param 1 = " + paramValue);
    }

}
