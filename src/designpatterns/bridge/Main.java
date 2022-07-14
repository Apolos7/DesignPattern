package designpatterns.bridge;

public class Main {

	public static void main(String[] args) {
		JanelaAbstrata janela = new JanelaAviso(new JanelaWindows());
		janela.desenhar();
		
		System.out.println();
		
		janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();
		
		System.out.println();
		
		janela = new JanelaAviso(new JanelaLinux());
		janela.desenhar();
		
		System.out.println();
		
		janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();

	}

}
