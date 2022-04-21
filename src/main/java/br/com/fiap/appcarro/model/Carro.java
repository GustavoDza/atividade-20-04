package br.com.fiap.appcarro.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(nullable = false)
	private String marca; 
	private String modelo; 
	private BigDecimal valor;
	private Integer potenciaCavalaria;
	private String cor;
	private Integer ano;
	
	public Carro() {
		
	}

	public Carro(Long id, String marca, String modelo, BigDecimal valor, Integer potenciaCavalaria, String cor, Integer ano) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.potenciaCavalaria = potenciaCavalaria;
		this.cor = cor;
		this.ano = ano;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getPotenciaCavalaria() {
		return potenciaCavalaria;
	}

	public void setPotenciaCavalaria(Integer potenciaCavalaria) {
		this.potenciaCavalaria = potenciaCavalaria;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
}
