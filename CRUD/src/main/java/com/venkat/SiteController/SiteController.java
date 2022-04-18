package com.venkat.SiteController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.venkat.Entity.Users;
import com.venkat.Models.HibModels;

/**
 * Servlet implementation class SiteController
 */
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SiteController() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String page = request.getParameter("page");
		
		switch(page){
		case"home":
			HomePage(request,response);
			break;
		case"addusers":
			AddUsers(request,response);
			break;
		case"listuser":
			Userlist(request,response);
			
			break;
		case"updateuser":
			Updateuser(request,response);
			
			break;
		case"DeleteUser":
			Users deluser = new Users(Integer.parseInt(request.getParameter("sno")));
			System.out.println(deluser);
			//DeleteUser(deluser);
			new HibModels().Deleteuser(deluser);
			Userlist(request,response);
			break;
		default:
			errPage(request,response);
		}
		
	}



	private void Userlist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Users> listuser = new ArrayList<>();
		listuser = new HibModels().list();
		request.setAttribute("listuser", listuser);
		request.getRequestDispatcher("/userView/listUser.jsp").forward(request,response);
		
	}


	private void AddUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Add Users");
		request.getRequestDispatcher("/Forms/addUsers.jsp").forward(request,response);
		
	}


	private void errPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/index.jsp").forward(request,response);
		
	}


	private void HomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/index.jsp").forward(request,response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			String add = request.getParameter("form");
		
		switch(add){
		case"userop":
			Users user = new Users(request.getParameter("name"),request.getParameter("design"),request.getParameter("email"));
			Addusers(user);
			Userlist(request,response);
			break;
		case"updateuser":
			Users update = new Users((Integer.parseInt(request.getParameter("sno"))),request.getParameter("name"),request.getParameter("design"),request.getParameter("email"));
			Updateusers(update);
			Userlist(request,response);
			break;
		default:
			errPage(request,response);
		}
		
	
	}


	private void Updateuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Update User");
		request.getRequestDispatcher("/Forms/updateUsers.jsp").forward(request,response);
		return;
	}


	private void Updateusers(Users update) {
		new HibModels().Update(update);
		return;
		
	}


	private void Addusers(Users user) {
		new HibModels().addusers(user);
		return;
	}


	
	

}
