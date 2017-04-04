package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class ConsoleView {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO pDAO = new PacoteDAOImpl(em);
		List<Pacote> pacotes = pDAO.listar();
		
		for (Pacote p : pacotes) {
			System.out.println("ID:\t\t" + p.getId());
			System.out.println("Descricao:\t" + p.getDescricao());
			System.out.println();
		}
		
		List<Pacote> pacotesPorPreco = pDAO.buscarPorPreco(1, 1000);
		
		for (Pacote p : pacotesPorPreco) {
			System.out.println("descricao: " + p.getDescricao());
			System.out.println("preco: " + p.getPreco());
		}
		
		
	}

}
