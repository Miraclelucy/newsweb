package com.lucy.servlet;

import com.lucy.common.BaseServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="bbsServlet", urlPatterns={"/bbs"},loadOnStartup=1)
public class BbsServlet extends BaseServlet{


	public String save(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");	
		  String name=request.getParameter("name");	
          String title=request.getParameter("title");
          String text=request.getParameter("text"); 
          boolean flag=new com.lucy.service.Bbsservice().insetbbs(name, title, text);
          response.sendRedirect("bbs/bbs.jsp");
		return "";
	}

	public String del(HttpServletRequest request, HttpServletResponse response) throws  IOException{
		int id=Integer.parseInt(request.getParameter("bbsid"));
		System.out.println(id);
		boolean flag= new com.lucy.service.Bbsservice().delbbs(id);
		if(flag){
			//response.sendRedirect(request.getContextPath()+"");
			return "/admin/bbs.jsp";
		}else{
			//response.sendRedirect(request.getContextPath()+"/admin/bbs.jsp");
			return "/admin/bbs.jsp";
		}

	}


}
