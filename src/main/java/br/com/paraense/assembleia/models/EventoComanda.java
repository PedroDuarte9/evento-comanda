package br.com.paraense.assembleia.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Integer numComanda;

	@Column(name = "DT_EVT")
	private LocalDate dataEvento;

	public EventoComanda() {
		super();
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

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Integer getNumComanda() {
		return numComanda;
	}

	public void setNumComanda(Integer numComanda) {
		this.numComanda = numComanda;
	}
	
	

}
