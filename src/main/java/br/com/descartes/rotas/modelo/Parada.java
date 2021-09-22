package br.com.descartes.rotas.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Parada {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String endereço;
	@NotNull 
	private Double latitude;
	@NotNull
	private Double longitude;
	@Enumerated(EnumType.STRING)
	private StatusParada statusParada = StatusParada.NOT_ANSWER;
	private Long deliveryRadius;
	
	public Parada() {
		
	}
	
	public Parada(String descricao, String endereço, Double latitude, Double longitude, Long deliveryRadius) {
		this.descricao = descricao;
		this.endereço = endereço;
		this.latitude = latitude;
		this.longitude = longitude;
		this.deliveryRadius = deliveryRadius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parada other = (Parada) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public StatusParada getStatusParada() {
		return statusParada;
	}
	public void setStatusParada(StatusParada statusParada) {
		this.statusParada = statusParada;
	}
	public Long getDeliveryRadius() {
		return deliveryRadius;
	}
	public void setDeliveryRadius(Long deliveryRadius) {
		this.deliveryRadius = deliveryRadius;
	}
	
	

}
