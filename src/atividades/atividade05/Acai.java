package atividades.atividade05;

import atividades.atividade05.adicionais.Adicionais;

public class Acai {
	
	private StringBuilder pedido;
	private double valorTotal;
	
	public Acai(String nomeAcai) {
		pedido = new StringBuilder();
		pedido.append("Nome açai: ").append(nomeAcai).append("\n");
	}
	
	public void adicionarAdicionais(Adicionais adicionais) {
		pedido.append("\n\nNome adicional: ").append(adicionais.nome);
		pedido.append("\nValor do adicional: ").append(adicionais.valor);
		valorTotal += adicionais.valor;
	}
	
	public void visualizarPedido() {
		System.out.println(pedido.append("\nValor total: ").append(valorTotal).toString());
	}
	

}
