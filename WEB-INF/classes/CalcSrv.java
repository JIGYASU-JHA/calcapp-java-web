import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CalcSrv extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String action = request.getParameter("action");

        out.println("<html><body>");

        if(action.equals("Add")) {
            int sum = num1 + num2;
            out.println("<h2>Addition = " + sum + "</h2>");
        }
        else if(action.equals("Product")) {
            int product = num1 * num2;
            out.println("<h2>Product = " + product + "</h2>");
        }

        out.println("</body></html>");
        out.close();
    }
}
