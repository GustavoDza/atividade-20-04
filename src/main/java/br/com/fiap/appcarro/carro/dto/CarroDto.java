package br.com.fiap.appcarro.carro.dto;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CarroDto {
	
	@NotBlank
	@NotNull
	private String marca; 
	
	@NotBlank
	@NotNull
	private String modelo; 
	
	@NotNull
	@DecimalMin(value="0.0")
	private BigDecimal valor;
	
	private Integer potenciaCavalaria;
	
	private String cor;
	
	@NotBlank
	@NotNull
	private Integer ano;

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
