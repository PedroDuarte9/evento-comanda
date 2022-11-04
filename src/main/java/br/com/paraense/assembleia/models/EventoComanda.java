package br.com.paraense.assembleia.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EVT_COMANDA")
public class EventoComanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NM_SOCIO")
	private String nameSocio;
	
	@Column(name = "NR_PULSE")
	private Integer numPulseira;

	@Column(name = "DT_EVT")
	private LocalDate dataEvento = LocalDate.now();
	
	@ManyToOne
	private Categoria categoriaSocio;
	
	

	public EventoComanda() {
		
	}
	
	public EventoComanda(String nameSocio, Integer numPulseira, Categoria categoriaSocio) {
		
		this.nameSocio = nameSocio;
		this.numPulseira = numPulseira;
		this.categoriaSocio = categoriaSocio;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameSocio() {
		return nameSocio;
	}

	public void setNameSocio(String nameSocio) {
		this.nameSocio = nameSocio;
	}
		
	public Integer getNumPulseira() {
		return numPulseira;
	}

	public void setNumComanda(Integer numPulseira) {
		this.numPulseira = numPulseira;
	}
	

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Categoria getCategoriaSocio() {
		return categoriaSocio;
	}

	public void setCategoriaSocio(Categoria categoriaSocio) {
		this.categoriaSocio = categoriaSocio;
	}
	
	
	
	

}
