import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;


public class page1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
        try {
            String n=request.getParameter("uname");
            String addr=request.getParameter("uaddress");
            
            int app=Integer.parseInt(request.getParameter("uapple"));
            int ora=Integer.parseInt(request.getParameter("uorange"));
            int mus=Integer.parseInt(request.getParameter("umusk"));
            int wat=Integer.parseInt(request.getParameter("uwater"));
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Bill</title>");            
            out.println("</head>");
            out.println("<body style=\"background-color:grey;color:white;\">");
            out.println("<h1 style=\"background-color:black; color:white; text-align: center; padding: 10px 6px;\">Welcome to <span style=\"color: cyan;\"> E-cart </span> fruit sellers!</h1>");
            out.println("<div style=\"text-align: center; font-size: 1.3rem; margin-top: 60px\">Welcome "+n+"<br>");
            out.println("<div style=\"text-align: center; font-size: 1.1rem; margin-top: 30px\">Your Generated Bill is as follows:<br>");
//            out.println("<img src='../apple.jpg'>");
            out.println("<table style=\"margin-left: 550px;font-size: 1.5rem; margin-top:70px\"><thead style: \"color: cyan\"><th> Sl. No. </th><th> Name </th><th> Qtty. </th><th> Cost </th><th> Amount </th></thead><tr><td>01.</td><td>Apple</td><td>"+app+"</td><td>Rs.3</td><td>"+app*3+"</td></tr><tr><td>02.</td><td>Water Melon</td><td>"+wat+"</td><td>Rs.10</td><td>"+wat*10+"</td></tr><tr><td>03.</td><td>Oranges</td><td>"+ora+"</td><td>Rs.7</td><td>"+ora*7+"</td></tr><tr><td>04.</td><td>Musk Melon</td><td>"+mus+"</td><td>Rs.15</td><td>"+mus*15+"</td></tr></table>");
            out.println("<div style=\"text-align: center; font-size: 1.3rem; margin-top: 40px\">Total amount: "+(app*3+wat*10+ora*7+mus*15)+"<br>");
            HttpSession session=request.getSession();
            session.setAttribute("uname",n);
            session.setAttribute("uaddress",addr);
            out.println("<div style=\"margin-top: 40px\"><a href='page2' style=\"text-align: center; font-size: 1.3rem; border: 3px solid cyan; border-radius: 10px 15px; padding: 10px 15px;\">Finish</a></div>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
