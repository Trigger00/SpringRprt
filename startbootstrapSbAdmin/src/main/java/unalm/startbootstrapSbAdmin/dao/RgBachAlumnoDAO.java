package unalm.startbootstrapSbAdmin.dao;

import unalm.startbootstrapSbAdmin.model.RgBachAlumno;

public interface RgBachAlumnoDAO extends GenericDAO<RgBachAlumno>{

	RgBachAlumnoDAO findbyCodigo(String Codigo);
}
