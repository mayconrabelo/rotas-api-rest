package br.com.descartes.rotas.controler;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.descartes.rotas.controler.dto.RotaDto;
import br.com.descartes.rotas.controler.form.AtualizacaoRotaForm;
import br.com.descartes.rotas.controler.form.RotaForm;
import br.com.descartes.rotas.modelo.Rota;
import br.com.descartes.rotas.modelo.StatusRota;
import br.com.descartes.rotas.repository.RotaRepository;


@RestController
@RequestMapping("/Route")
public class RotasController {
	
	@Autowired
	private RotaRepository rotaRepository;

	@GetMapping
	public List<RotaDto> lista(StatusRota status){
		if (status == null) {
			List<Rota> rotas = rotaRepository.findAll();
			return RotaDto.converter(rotas);
		}else {
			List<Rota> rotas = rotaRepository.findByStatus(status);
			return RotaDto.converter(rotas);
		}
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<RotaDto> cadastrar(@RequestBody @Valid RotaForm form, UriComponentsBuilder uriBuilder) {
		Rota rota = form.converter();
		
		rotaRepository.save(rota);
		
		URI uri = uriBuilder.path("/Route/{id}").buildAndExpand(rota.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new RotaDto(rota));
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<RotaDto>  buscar(@PathVariable Long id) {
		Optional<Rota> rota = rotaRepository.findById(id);
		if(rota.isPresent()) {
			return ResponseEntity.ok(new RotaDto(rota.get()));
		}
		return ResponseEntity.notFound().build();
		
	}
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<RotaDto> atualizar(@PathVariable Long id,@RequestBody @Valid AtualizacaoRotaForm form ){
		Optional<Rota> optional = rotaRepository.findById(id);
		if(optional.isPresent()) {
			Rota rota = form.atualizar(id,rotaRepository);
			return ResponseEntity.ok(new RotaDto(rota));
		}
		return ResponseEntity.notFound().build();
		
	}
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<RotaDto> remover(@PathVariable Long id){
		Optional<Rota> rota = rotaRepository.findById(id);
		if(rota.isPresent()) {
			rotaRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
		
	}
}
