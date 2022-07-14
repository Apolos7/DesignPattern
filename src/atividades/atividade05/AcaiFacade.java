package atividades.atividade05;

import atividades.atividade05.adicionais.Amendoim;
import atividades.atividade05.adicionais.Banana;
import atividades.atividade05.adicionais.Castanha;
import atividades.atividade05.adicionais.Kiwi;
import atividades.atividade05.adicionais.LeiteCondensado;
import atividades.atividade05.adicionais.Morango;
import atividades.atividade05.adicionais.Ninho;

public class AcaiFacade {
	
	public void getAcaiBomba() {
		Acai acai = new Acai("Açai Bomba");
		acai.adicionarAdicionais(new Amendoim());
		acai.adicionarAdicionais(new LeiteCondensado());
		acai.visualizarPedido();
	}
	
	public void getAcaiSergipano() {
		Acai acai = new Acai("Açai Sergipano");
		acai.adicionarAdicionais(new Banana());
		acai.adicionarAdicionais(new Amendoim());
		acai.adicionarAdicionais(new Morango());
		acai.visualizarPedido();
	}
	
	public void getAcaiBaiano() {
		Acai acai = new Acai("Açai Baiano");
		acai.adicionarAdicionais(new Ninho());
		acai.adicionarAdicionais(new Kiwi());
		acai.adicionarAdicionais(new Castanha());
		acai.adicionarAdicionais(new LeiteCondensado());
		acai.visualizarPedido();
	}
	
	public void getAcaiParaense() {
		Acai acai = new Acai("Açai Paraense");
		acai.adicionarAdicionais(new Castanha());
		acai.visualizarPedido();
	}


}
