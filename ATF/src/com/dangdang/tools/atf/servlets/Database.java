package com.dangdang.tools.atf.servlets;

import javax.servlet.annotation.WebServlet;

import com.dangdang.tools.atf.pages.DatabasePage;

@WebServlet(name = "database", urlPatterns = { "/database/*" })
public class Database extends BaseServlet {

	private static final long serialVersionUID = 6510277067882324537L;

	@Override
	public String getBasePath() {
		return "/pages/mgmt/database/";
	}

	@Override
	public Class<?> getPageClass() {
		return DatabasePage.class;
	}

}
