package config;

import javax.servlet.jsp.jstl.core.Config;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitialize extends

	AbstractAnnotationConfigDispatcherServletInitializer{

	
		protected Class<?>[] getRootConfigClasses() {
			return null;
		}

		
		protected Class<?>[] getServletConfigClasses() {
			
			return new Class[] {MyConfig.class};
		}

		protected String[] getServletMappings() {
			
			return new String[] {"/"};
		}

}
