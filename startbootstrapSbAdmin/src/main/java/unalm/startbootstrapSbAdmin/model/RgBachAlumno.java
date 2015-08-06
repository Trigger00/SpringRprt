package unalm.startbootstrapSbAdmin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name = "rg_bach_alumno")
public class RgBachAlumno implements Serializable {
	@SequenceGenerator(name = "LOG_ID_SEQ", sequenceName = "LOG_ID_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_ID_SEQ")
	@Column(name = "ID")
	private Long id;

	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "ALU_NOMBRE")
	private String aluNombre;

	public RgBachAlumno() {
		super();
	}

	public RgBachAlumno(Long id, String matricula, String aluNombre) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.aluNombre = aluNombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAluNombre() {
		return aluNombre;
	}

	public void setAluNombre(String aluNombre) {
		this.aluNombre = aluNombre;
	}

}
