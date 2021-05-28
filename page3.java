import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class page3 extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("uname");  
    String coun=request.getParameter("ucountry");  
          
    if(coun.equals("India")){  
        RequestDispatcher rd=request.getRequestDispatcher("page1");  
        rd.forward(request, response);  
    }  
    else{  
        
        RequestDispatcher rd=request.getRequestDispatcher("/");  
        rd.include(request, response);  
        out.print("Sorry We dont deliver outside India!");  
    }  
}
}  