package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.model.Suscritud;
import py.edu.facitec.repository.SuscritoRepository;

@Controller
public class suscritoController {

	//INYECCION DE DEPENDENCIA
	@Autowired
	private SuscritoRepository suscritoRepository;
	
	@RequestMapping ("/form_suscrito")
	public String metodo() {
		
		return "suscrito/index";
	}
	
	
	@RequestMapping(value ="/registrar_suscrito", method= RequestMethod.POST)
	
	//NOMBRE Y CORREO
	//recibe los datos del formulario 
	public ModelAndView registrar (Suscritud suscrito) {
	
		
		//registrar suscrito
		suscritoRepository.save(suscrito);
		
		System.out.println("Registrado con exito: "+suscrito);
		
		return new ModelAndView("redirect:form_suscrito");
	}
	
	
	
}
