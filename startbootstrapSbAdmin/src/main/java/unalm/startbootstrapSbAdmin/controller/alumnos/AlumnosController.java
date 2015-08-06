package unalm.startbootstrapSbAdmin.controller.alumnos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import unalm.startbootstrapSbAdmin.model.Alumnos;
import unalm.startbootstrapSbAdmin.model.Programa;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;

@Controller
@RequestMapping(value = { "/" })
public class AlumnosController {

	@Autowired
	AlumnosService service;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		List<Alumnos> alumnos = service.allAlumnos();
		model.addAttribute("alumnos2", alumnos);

		List<RgBachAlumno> registro = service.allRegistros();
		model.addAttribute("registros", registro);
		return "test/index";

	}

	@RequestMapping("{id}/editar")
	public String editar(@PathVariable("id") Long id, Model model) {

		System.out.println("entro a editar");

		Alumnos alumnos = service.findAlumno(id);
		if (alumnos == null) {
			return "test/index";
		}

		model.addAttribute("alumnos", alumnos);
		List<Alumnos> alumnos3 = service.allAlumnos();
		model.addAttribute("alumnos2", alumnos3);


		List<RgBachAlumno> registro = service.allRegistros();
		model.addAttribute("registros", registro);
		
		System.out.println(alumnos.getAlu_nombre());
		System.out.println(alumnos.getMatricula());
		return "test/index";
	}


	@RequestMapping("guardar")
	public String guardar(Alumnos alumnos) {
		System.out.println("entro a guardar");
		RgBachAlumno rgBachAlumno = new RgBachAlumno();
		rgBachAlumno.setMatricula(alumnos.getMatricula());
		rgBachAlumno.setAluNombre(alumnos.getAlu_nombre());
		service.guardAlumno(rgBachAlumno);
		
		
	
		//return "test/index";
		return "redirect:/test";
	}

}
