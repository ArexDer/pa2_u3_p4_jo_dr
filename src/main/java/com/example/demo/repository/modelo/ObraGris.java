package com.example.demo.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "obra_gris")
public class ObraGris {

	@Id
	@GeneratedValue(generator = "seq_obra_gris", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_obra_gris",sequenceName = "seq_obra_gris", allocationSize = 1 )
	@Column(name = "obr_id")
	private Integer id;

	@Column(name = "obr_nombre")
	private String nombre;
	
	@Column(name = "obr_direccion")
	private String direccion;
	
	@Column(name = "obr_fecha_inicio")
	private LocalDate fechaInicio;
	
	@ManyToOne
	@JoinColumn(name = "obra_gris_id_arquitecto")
	private Arquitecto arquitecto;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Arquitecto getArquitecto() {
		return arquitecto;
	}

	public void setArquitecto(Arquitecto arquitecto) {
		this.arquitecto = arquitecto;
	}

	@Override
	public String toString() {
		return "ObraGris [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", fechaInicio=" + fechaInicio
				+ "]";
	}
	
	
	

}
