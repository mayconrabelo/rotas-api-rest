package br.com.descartes.rotas.controler.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.descartes.rotas.modelo.Parada;
import br.com.descartes.rotas.modelo.Rota;
import br.com.descartes.rotas.modelo.StatusRota;

public class RotaDto {

	private Long id;
	private LocalDateTime data;
	private StatusRota status;
	private List<Parada> paradas = new ArrayList<>();
	
	public RotaDto(Rota rota) {
		this.id = rota.getId();
		this.data = rota.getData();
		this.status = rota.getStatus();
		this.paradas = rota.getParadas();
	}
	public Long getId() {
		return id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public StatusRota getStatus() {
		return status;
	}
	public List<Parada> getParadas() {
		return paradas;
	}
	public static List<RotaDto> converter(List<Rota> rotas) {
		
		return rotas.stream().map(RotaDto::new).collect(Collectors.toList());
	}
}
