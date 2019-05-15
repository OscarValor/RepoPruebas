package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//con esta primera anotación le indicamos que spring tiene que tratar este beam como un controlador
@Controller

//le indicamos que el controlador es de tipo mapeo
@RequestMapping("/example")
public class ExampleController {
	
		//nos definimos el nombre de la vista como una cte, para no tener que repetirla
		//en un proyecto grande nos construirimamos todos los nombres de la vista en otra
		//clase como ctes.
		public static final String EXAMPLE_VIEW = "example";

		//Primera forma. Nos creamos un método que nos retorne la vista
		//esta anotación es es una hija de requestmapping donde se le indica que el request method es get
		//ESTA FORMA SE UTILIZA CUANTO TENGO QUE INSERTAR POCOS DATOS EN LA VISTA
		@GetMapping("/exampleString")	

		public String exampleString(Model model) {
			
			model.addAttribute("name", "Jon");
			//indicamos la vista a devolver
			return EXAMPLE_VIEW;
		}
		
		//Segunda forma. Mediante invocacion al método modelo-vista de spring
		//que devuelve un modelo y una vista
		//ESTA OTRA FORMA SE SUELE UTILIZAR PARA CUANDO HAY QUE INSERTAR MUCHOS DATOS
		@GetMapping("/exampleMAV")
		public ModelAndView exampleMAV() {
			
			ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
			mav.addObject("name","Mikel");
			
			return mav;
			//return new ModelAndView(EXAMPLE_VIEW);
		}
}
