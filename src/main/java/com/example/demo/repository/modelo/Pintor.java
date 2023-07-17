package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pintor")
public class Pintor {
	
	@Id
	@GeneratedValue(generator = "seq_pintor", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_pintor",sequenceName = "seq_pintor", allocationSize = 1 )
	@Column(name = "pin_id")
	private Integer id;
	
	@Column(name = "pin_nombre")
	private String nombre;
	
	@Column(name = "pin_apellido")
	private String apellido;
	
	@Column(name = "pin_edad")
	private String edad;
	
	@Column(name = "pin_nacionalidad")
	private String nacionalidad;
	
	@OneToMany(mappedBy = "pintor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Obra> obras;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}

	@Override
	public String toString() {
		return "Pintor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", nacionalidad=" + nacionalidad + "]";
	}

	
	
	
}
