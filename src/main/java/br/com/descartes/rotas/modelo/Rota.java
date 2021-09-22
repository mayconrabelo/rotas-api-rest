package br.com.descartes.rotas.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rota {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime data = LocalDateTime.now();
	@Enumerated(EnumType.STRING)
	private StatusRota status = StatusRota.NOT_STARTED;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Parada> paradas = new ArrayList<>();
	
	public Rota() {
		
	}
	
	public Rota(List<Parada> paradas) {
		this.paradas = paradas;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public StatusRota getStatus() {
		return status;
	}
	public void setStatus(StatusRota status) {
		this.status = status;
	}
	public List<Parada> getParadas() {
		return paradas;
	}
	public void setParadas(List<Parada> paradas) {
		this.paradas = paradas;
	}
	
}
