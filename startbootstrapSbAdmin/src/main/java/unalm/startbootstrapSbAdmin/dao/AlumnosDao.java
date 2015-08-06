package unalm.startbootstrapSbAdmin.dao;

import unalm.startbootstrapSbAdmin.model.Alumnos;


public interface AlumnosDao extends GenericDAO<Alumnos>{
	   Alumnos findByAlumno(String codigo);
}
