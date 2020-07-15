import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.UsersBean;

class LoginServlet extends HttpServlet{
	// public void doGet(HttpServletRequest request,HttpServletResponse response)throws
	// IOException,ServletException{
	// 	RequestDispatcher forwardDispatcher = this.getServletContext().getRequestDispatcher
	// 	("C:/webapps/fujicannel/login.jsp");
	// 	forwardDispatcher.forward(request,response);
	// }




	public void doPost(HttpServletRequest req,HttpServletResponse res)throws
	IOException,ServletException{
		req.setCharacterEncoding("UTF-8");

		String name = req.getParameter("user");
		String password = req.getParameter("pass");

		UsersBean users = new UsersBean();
		users.setUserName(name);
		users.setPassWord(password);

		req.setAttribute("users",name);
		req.setAttribute("password",password);

		RequestDispatcher dispatcher = req.getRequestDispatcher("loginresult");

		dispatcher.forward(req,res);



	}
}
