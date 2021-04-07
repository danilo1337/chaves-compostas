package br.com.danilo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilo.entity.Pessoa;
import br.com.danilo.service.PessoaService;

@RestController
@RequestMapping("pessoas")
public class PessoaResources {
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public List<Pessoa> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
		return service.cadastrar(pessoa);
	}
	
}
