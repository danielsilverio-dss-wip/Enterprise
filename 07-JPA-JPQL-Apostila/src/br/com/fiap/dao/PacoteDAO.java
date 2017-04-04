package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{
	
	List<Pacote> listar();

	List<Pacote> buscarPorPreco(float minimo, float maximo);
	
	List<Pacote> buscaPorTransporte(Transporte t);
}
