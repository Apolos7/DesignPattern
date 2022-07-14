package designpatterns.bridge;

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Di�logo");
		desenharBotao("sim");
		desenharBotao("n�o");
		desenharBotao("cancelar");
	}

}
