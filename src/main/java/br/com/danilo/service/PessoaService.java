package br.com.danilo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.danilo.entity.Pessoa;
import br.com.danilo.repository.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository repository;
	
	public Pessoa cadastrar(Pessoa pessoa) {
		return repository.save(pessoa);
	}
	
	public List<Pessoa> listar(){
		return repository.findAll();
	}
	
	public Optional<Pessoa> buscar(Integer id) {
		return repository.findById(id);
	}
	
	public Pessoa atualizar(Pessoa pessoa) {
		return repository.save(pessoa);
	}
	
	public void deletar(Integer id) {
		repository.deleteById(id);
	}
	
}
