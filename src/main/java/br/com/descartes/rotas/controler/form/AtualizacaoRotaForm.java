package br.com.descartes.rotas.controler.form;

import java.util.ArrayList;
import java.util.List;

import br.com.descartes.rotas.modelo.Parada;
import br.com.descartes.rotas.modelo.Rota;
import br.com.descartes.rotas.modelo.StatusRota;
import br.com.descartes.rotas.repository.RotaRepository;

public class AtualizacaoRotaForm {
	
	private StatusRota status;
	
	private List<Parada> paradas = new ArrayList<>();
	
	public List<Parada> getParadas() {
		return paradas;
	}

	public void setParadas(List<Parada> paradas) {
		this.paradas = paradas;
	}

	public StatusRota getStatus() {
		return status;
	}

	public void setStatus(StatusRota status) {
		this.status = status;
	}

	public Rota converter() {
		return new Rota(paradas);
	}

	public Rota atualizar(Long id, RotaRepository rotaRepository) {
		Rota rota = rotaRepository.getOne(id);
		rota.setStatus(this.status);
		rota.setParadas(this.paradas);
		return rota;
	}
}
