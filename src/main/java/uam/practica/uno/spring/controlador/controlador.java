package uam.practica.uno.spring.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlador {
	@GetMapping ("/")
	public String listas ( Model model){
	return "listas";
	}
}
