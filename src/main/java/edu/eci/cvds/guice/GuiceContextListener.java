package edu.eci.cvds.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import edu.eci.cvds.persistence.ReviewDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisReviewDAO;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.eci.cvds.persistence.AuthorDAO;
import edu.eci.cvds.persistence.BookDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisAuthorDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisBookDAO;
import edu.eci.cvds.services.ECIBookServices;
import edu.eci.cvds.services.impl.ECIBookServicesImpl;

public class GuiceContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		Injector injector = Guice.createInjector(new XMLMyBatisModule() {
			@Override
			protected void initialize() {

				install(JdbcHelper.MySQL);

				setEnvironmentId("development");

				setClassPathResource("mybatis-config.xml");

				// Decanatura
                bind(ECIBookServices.class).to(ECIBookServicesImpl.class);
                bind(AuthorDAO.class).to(MyBatisAuthorDAO.class);
				// Programa
                bind(BookDAO.class).to(MyBatisBookDAO.class);
                bind(ReviewDAO.class).to(MyBatisReviewDAO.class);
			}
		}

		);

		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute(Injector.class.getName(), injector);
	}

}