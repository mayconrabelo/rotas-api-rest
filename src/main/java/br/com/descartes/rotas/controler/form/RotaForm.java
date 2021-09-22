package br.com.descartes.rotas.controler.form;

import java.util.ArrayList;
import java.util.List;

import br.com.descartes.rotas.modelo.Parada;
import br.com.descartes.rotas.modelo.Rota;

public class RotaForm {
	
	
	private List<Parada> paradas = new ArrayList<>();
	
	public List<Parada> getParadas() {
		return paradas;
	}

	public void setParadas(List<Parada> paradas) {
		this.paradas = paradas;
	}

	public Rota converter() {
		return new Rota(paradas);
	}

}
