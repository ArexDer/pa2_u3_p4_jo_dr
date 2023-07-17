package com.example.demo.repository.modelo;

import java.time.LocalDate;
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
@Table(name = "arquitecto")
public class Arquitecto {
	
	@Id
	@GeneratedValue(generator = "seq_arquitecto", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_arquitecto",sequenceName = "seq_arquitecto", allocationSize = 1 )
	@Column(name = "arq_id")
	private Integer id;
	
	@Column(name = "arq_nombre")
	private String nombre;
	
	@Column(name = "arq_apellido")
	private String apellido;
	
	@Column(name = "arq_fecha_nacimineto")
	private LocalDate fechaNacimineto;
	
	@OneToMany(mappedBy = "arquitecto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ObraGris> obraGris;

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

	public LocalDate getFechaNacimineto() {
		return fechaNacimineto;
	}

	public void setFechaNacimineto(LocalDate fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}

	public List<ObraGris> getObraGris() {
		return obraGris;
	}

	public void setObraGris(List<ObraGris> obraGris) {
		this.obraGris = obraGris;
	}

	@Override
	public String toString() {
		return "Arquitecto [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimineto="
				+ fechaNacimineto ;
	}
	
	
	

}
