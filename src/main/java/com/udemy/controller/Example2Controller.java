
// en esta clase vamos a recibir parametros mediante una petición get
package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//con esta primera anotación le indicamos que spring tiene que tratar este beam como un controlador
@Controller

//le indicamos que el controlador es de tipo mapeo
@RequestMapping("/example2")

// controlador para la vista example2
public class Example2Controller {
	
	//definimos la plantilla, que será example2

	private static final String EXAMPLE2_VIEW = "example2";
	 
	//indicamos que vamos a hacer un metodo get, es decir los datos los vamos a tener por get mediante parametros
	@GetMapping("/request1")
	//localhost:8080/example2/request1?par1=JOSE - así pasaremos los parametros
	//creamos el método, como parametro le pasamos la anotación @requestParam, que a su vez recibirá el parametro par1
	//del tipo String y definido como name
	public ModelAndView request1(@RequestParam(name="par1",required=false, defaultValue="NULL") String name) {
		// instanciamos el obejetto mev
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		//aqui le indicamos que vamos a añadir un objeto a la plantilla example2 
		mav.addObject("nombre_en_modelo",name);
		return mav;
		
	}

}
