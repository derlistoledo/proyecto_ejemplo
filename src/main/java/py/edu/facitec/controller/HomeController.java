package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping ("/") //Falta crear el archivo index dentro de archivo
	public String index() {
		
		System.out.println("Cargando pagina de inicio");
		
		return "index";
	}
	
}
