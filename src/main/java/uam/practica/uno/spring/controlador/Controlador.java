package uam.practica.uno.spring.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping("/listas")
	public String listas(Model model) {
		return "listas";
	}
	
	@GetMapping("/formulario")
	public String formulario(Model model) {
		return "formulario";
	}
	
	@GetMapping("/tabla")
	public String tabla(Model model) {
		return "tabla";
	}
	
	@GetMapping("/tablaconimagenes")
	public String tablaconimagenes(Model model) {
		return "tablaconimagenes";
	}
	
	@GetMapping("/tablamodifica")
	public String tablamodifica(Model model) {
		return "tablamodifica";
	}
}
