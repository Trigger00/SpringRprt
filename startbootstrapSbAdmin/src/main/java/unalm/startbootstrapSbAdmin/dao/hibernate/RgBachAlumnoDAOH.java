package unalm.startbootstrapSbAdmin.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import unalm.startbootstrapSbAdmin.dao.RgBachAlumnoDAO;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;

@Repository("rgBachAlumnoDAO")
public class RgBachAlumnoDAOH extends BaseHibernateDAO implements
		RgBachAlumnoDAO {

	public List<RgBachAlumno> list() {
		Criteria criteria = this.getSession().createCriteria(RgBachAlumno.class);
		return criteria.list();
	}

	public RgBachAlumno get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(RgBachAlumno t) {
		this.getSession().save(t);

	}

	public void update(RgBachAlumno t) {
		// TODO Auto-generated method stub

	}

	public void delete(Long t) {
		// TODO Auto-generated method stub

	}

	public RgBachAlumnoDAO findbyCodigo(String Codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
