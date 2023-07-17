package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "obra")
public class Obra {
	
	@Id
	@GeneratedValue(generator = "seq_obra", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_obra", sequenceName = "seq_obra", allocationSize = 1)
	@Column(name = "obra_id")
	private Integer id;
	
	@Column(name = "obra_nombre")
	private String nombre;
	
	@Column(name = "obra_estilo")
	private String estilo;
	
	@Column(name = "obra_precio")
	private BigDecimal precio;
	
	@Column(name = "obra_fecha_de_creacion")
	private LocalDate fechaDeCreacion;
	
	@ManyToOne
	@JoinColumn(name = "obra_id_pintor")
	private Pintor pintor;

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

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public Pintor getPintor() {
		return pintor;
	}

	public void setPintor(Pintor pintor) {
		this.pintor = pintor;
	}

	@Override
	public String toString() {
		return "Obra [id=" + id + ", nombre=" + nombre + ", estilo=" + estilo + ", precio=" + precio
				+ ", fechaDeCreacion=" + fechaDeCreacion + "]";
	}
	
	
	

}
