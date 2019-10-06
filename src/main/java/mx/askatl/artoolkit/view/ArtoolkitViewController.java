package mx.askatl.artoolkit.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtoolkitViewController {

	  @RequestMapping("/")
	  public String hola(Model modelo) {
	    return "inicio";
	  }
	  
	  @RequestMapping("/foxy")
	  public String foxy(Model modelo) {
	    return "foxy";
	  }
}
 