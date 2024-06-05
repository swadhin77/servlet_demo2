package test;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends GenericServlet{
@Override
public void service(ServletRequest req,ServletResponse res) throws ServletException , IOException
{
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	String uName = req.getParameter("uname");
	String mId = req.getParameter("mid");
	String phno=req.getParameter("num");
	pw.println("*****Details****");
	pw.println("<br>UserName : "+uName);
	pw.println("<br>MailId : "+mId);
	pw.println("<br>Phone Number : "+phno);
}
}
