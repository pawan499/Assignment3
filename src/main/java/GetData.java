

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetData
 */
@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		PrintWriter pw=null;
		try {
		 pw =res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String input1=req.getParameter("input1");
		String input2=req.getParameter("input2");
		
		int index=input1.indexOf(input2);
		if(index!=-1)
		pw.println("<center><h1>"+input1.substring(index+1)+"</h1></center>");
		else
			pw.println("<center><h1>The letter does\r\n"
					+ "not exist in the sentence</h1></center>");
	}

}
