package br.com.descartes.rotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descartes.rotas.modelo.Rota;
import br.com.descartes.rotas.modelo.StatusRota;

public interface RotaRepository extends JpaRepository<Rota, Long> {

	List<Rota> findByStatus(StatusRota status);

}
