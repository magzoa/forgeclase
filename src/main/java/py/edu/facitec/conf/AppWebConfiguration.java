package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class})

public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	
	resolver.setSuffix(".jsp");
	resolver.setPrefix("/WEB-INF/views/");

	return 	resolver;
	}
	
	//para habilitar el acceso a recursos estaticos, css javascript
		@Override
		public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
			configurer.enable();
		}	

}
