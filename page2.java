import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
public class page2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session=request.getSession(false);
            String n=(String)session.getAttribute("uname");
            String uadd=(String)session.getAttribute("uaddress");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>onfirmation</title>");            
            out.println("</head>");
            out.println("<body style=\"background-color:grey;color:white;\">");
            out.println("<h1 style=\"background-color:black; color:white; text-align: center; padding: 10px 6px;\">Welcome to <span style=\"color: cyan;\"> E-cart </span> fruit sellers!</h1>");
            
            out.println("<div style=\"font-size: 1.3rem; text-align: center;\">Thank you "+n+" for using E-cart Fruitsellers!<br>Your order will be delivered at "+uadd);
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
