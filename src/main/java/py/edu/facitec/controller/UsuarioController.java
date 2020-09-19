package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {

	@RequestMapping ("/form_usuario")
	public String metodo() {
		
		
		return "usuario/index";
	}
}
