package ds;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/srv1")
public class salaray_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String str1=request.getParameter("Salary");
		String str2=request.getParameter("p1");
		double hra=Double.parseDouble(str1)*.20;
		PrintWriter pw=response.getWriter();
		pw.print("<h2>Salaray:"+str1+"</h2>");
	//pw.print(str1);
		pw.print("<h2>DA     :"+str2 +"</h2>");
	//pw.print(str2);
		pw.print("<h2>HRA    :" +hra+"</h2>");
	//pw.print(hra);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
