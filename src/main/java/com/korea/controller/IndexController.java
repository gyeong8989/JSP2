package com.korea.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController implements SubController {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {

		
			try {
				
				req.getRequestDispatcher("/WEB-INF/Login.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO: handle exception
			
			} catch (IOException e) {
				// TODO: handle exception
			}
	}

}
