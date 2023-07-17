package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.ObraGris;
import com.example.demo.repository.modelo.Pintor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta_bancaria")
public class CuentaBancaria {
	
	@Id
	@GeneratedValue(generator = "seq_cuenta_bancaria", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cuenta_bancaria", sequenceName = "seq_cuenta_bancaria", allocationSize = 1)
	@Column(name = "cuen_id")
	private Integer id;
	
	@Column(name = "cuen_numero")
	private String numero;
	
	@Column(name = "cuen_saldo")
	private BigDecimal saldo;
	
	@Column(name = "cuen_tipo")
	private String tipo; //AHORRO  o CORRIENTE
	
	@OneToMany(mappedBy = "cuentaOrigen", cascade = CascadeType.ALL)
	private List<Transferencia> transferencias;
	
	//@OneToMany(mappedBy = "cuentaDestino", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//private List<Transferencia> transferencias2;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cuen_id_propietario")
	private Propietario propietario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}
	
	
	
	

}
