package vn.iotstar.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iotstar.models.UserModel;
import vn.iotstar.services.IUserService;
import vn.iotstar.services.impl.UserServiceImpl;

@WebServlet(urlPatterns = {"/forgotpass"})
public class ForgotPasswordController extends HttpServlet{
	private static final long serialVersionUID = -1255739104002423134L;
	IUserService userService = new UserServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.getRequestDispatcher("views/forgotpassword.jsp").forward(req, resp);
	}
	
	
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		
		UserModel user = userService.findByUserName(username);
		/* Chuc nang nay moi demo, chua co chuc nang gui mail de lay mat khau 
		if(user.getEmail().equals(email) && user.getUsername().equals(username))
		{
		  Email sm = new Email()   
			
		  boolean test = sm. EmailSend(sm);
			
			if(test) {
				req.setAttribute("message", "Vui long kiem tra email de nhan mat khau moi");
				
			}else {
				req.setAttribute("error", "Loi gui email");
			}
				
		}
		else
		{
			req.setAttribute("error", "Username hoac email ko ton tai trong he thong");
			req.getRequestDispatcher("views/forgorpassword.jsp").forward(req, resp);
			return;
		}
		req.getRequestDispatcher("views/forgotpassword.jsp").forward(req, resp);
		*/
	}
	
}
