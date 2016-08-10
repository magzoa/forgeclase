package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	
	@RequestMapping("/")
	public String index(){
	
		System.out.println("Cargando la pagina de bienvenida");
		ModelAndView model=new ModelAndView();
		System.out.println("Nombre "+model.getViewName()+"nom "+model.getView());
		
		return "hello-world";
	}

}
