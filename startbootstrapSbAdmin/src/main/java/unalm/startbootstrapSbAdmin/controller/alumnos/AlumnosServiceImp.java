package unalm.startbootstrapSbAdmin.controller.alumnos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import unalm.startbootstrapSbAdmin.dao.AlumnosDao;
import unalm.startbootstrapSbAdmin.dao.RgBachAlumnoDAO;
import unalm.startbootstrapSbAdmin.model.Alumnos;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;

@Service
@Transactional
public class AlumnosServiceImp implements AlumnosService {

	@Autowired
	AlumnosDao alumnosDAO;

	@Autowired
	RgBachAlumnoDAO rgBachAlumnoDao;

	public List<Alumnos> allAlumnos() {
		return alumnosDAO.list();
	}

	public Alumnos findAlumno(Long codigo) {
		return alumnosDAO.get(codigo);

	}

	public void guardAlumno(RgBachAlumno rgBachAlumno) {
		rgBachAlumnoDao.save(rgBachAlumno);
	}

	public List<RgBachAlumno> allRegistros() {
		return rgBachAlumnoDao.list();
	}

	/*
	 * public void guardAlumno(Alumnos alumno) {
	 * 
	 * alumnosDAO.save(alumno); }
	 */

}
