import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.ResponseBean;
import bean.ThreadBean;


public class SearchServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws IOException,ServletException{
			req.setCharacterEncoding("UTF-8");
			DatabaseAccesser dba=new DatabaseAccesser();
			ArrayList SearchList=new ArrayList();
			TextConversion tc = new TextConversion();
			int flag = 1;




			String searchtitle=tc.TextReplace(req.getParameter("searchtitle"));
			String searchcount = dba.SearchCount(searchtitle);
			SearchList=dba.SearchThread(searchtitle);
			String Message="åüçıÉèÅ[Éh:"+searchtitle +" "+" "+"åüçıåèêî:"+searchcount;
			req.setAttribute("message",Message);
			req.setAttribute("ThreadList",SearchList);
			req.setAttribute("flag",flag);
			// RequestDispatcher SearchMessage=req.getRequestDispatcher("Thread");

			RequestDispatcher SearchResult=req.getRequestDispatcher("Thread");
			SearchResult.forward(req,res);

		}
	}
