package prova;

import javax.swing.JOptionPane;

public class Jokenpo {
	
	String jogador1;
	String jogador2;
	Integer qtdDePartidas;
        Integer opc;
        Integer qtdVitoriasJogador1 = 0;
	Integer qtdVitoriasJogador2 = 0;
	
     Jokenpo(){
		
		
		this.jogador1="";
		this.jogador2="";
		telaDeBoasVindas();
		}
	Jokenpo(String jogador1, String jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		telaDeBoasVindas();
	}
	
	
     void telaDeBoasVindas(){
		
		if(jogador1==""){
			
			jogador1=JOptionPane.showInputDialog("digite o nome do 1 jogador");
			}
		if(jogador2==""){
			
			jogador2=JOptionPane.showInputDialog("digite o nome do 2 jogador");
			}
		
		JOptionPane.showMessageDialog(null, "**** Bem vindos "+jogador1+ " e "+jogador2+ " ao jogo de jokenpo");
		 escolheQuantidadePartidas();
		
	}
	void  escolheQuantidadePartidas(){
		
	opc=Integer.parseInt(JOptionPane.showInputDialog("Escolha a qtd de partidas que deseja jogar\n 1 - para jogar 5 partidas;\n 2 - para jogar 7 partidas\n 3 -para jogar 9 partidas;"));
		switch (opc) {
		case 1:
			qtdDePartidas = 5;
			break;
		case 2:
			qtdDePartidas = 7;
			break;
		case 3:
			qtdDePartidas = 9;
			break;

		default:
			JOptionPane.showMessageDialog(null, "Não existe essa opção de qtdDePartidas");
			break;
		}
		
	}
	
	void jogar (){
		
		Integer numeroPartida = 1;
		Integer qtdVitoriasJogador1 = 0;
		Integer qtdVitoriasJogador2 = 0;
		
		if(qtdDePartidas!=5 && qtdDePartidas!=7 && qtdDePartidas!=9){
			
			JOptionPane.showMessageDialog(null, "valor inválido");
		}
		else {
		while (numeroPartida<=qtdDePartidas) {
			if (qtdVitoriasJogador1>(qtdDePartidas/2) || (qtdVitoriasJogador2>(qtdDePartidas/2))) {
				if(qtdVitoriasJogador1>qtdVitoriasJogador2)
					JOptionPane.showMessageDialog(null, "Não tem como mais o jogador 2 ganhar");
				
			else
				JOptionPane.showMessageDialog(null, "Não tem como mais o jogador 1 ganhar");
			}
			Integer vencedor = 0;
			JOptionPane.showMessageDialog(null,"\nPartida "+numeroPartida+"/"+qtdDePartidas+"\n 1 - Pedra \n 2 - Papel \n 3 - Tesoura");
			
			Integer jogada1=Integer.parseInt(JOptionPane.showInputDialog("\nJogador 1, qual a sua jogada?"));
			Integer jogada2=Integer.parseInt(JOptionPane.showInputDialog("\nJogador 2, qual a sua jogada?"));
			
			vencedor = validarJogadas(jogada1, jogada2);

			if(vencedor == 1) {
				this.qtdVitoriasJogador1++;
				JOptionPane.showMessageDialog(null,"\nJogador 1 venceu a partida");
			}
			else if(vencedor == 2) {
				this.qtdVitoriasJogador2++;
				JOptionPane.showMessageDialog(null,"\nJogador 2 venceu a partida");
			}
			else if(vencedor == 3) {
				JOptionPane.showMessageDialog(null,"\nPartida empatada");
			}
			numeroPartida++;
			
		}
		}
	}
	 Integer validarJogadas(Integer jogador1, Integer jogador2) {
		 if((jogador1 == 1 && jogador2 == 3) || (jogador1 == 2 && jogador2 == 1) || (jogador1 == 3 && jogador2 == 2))
				return 1;
			
			else if((jogador2 == 1 && jogador1 == 3) || (jogador2 == 2 && jogador1 == 1) || (jogador2 == 3 && jogador1 == 2))
				return 2;

			else if((jogador1 == 1 && jogador2 == 1) || (jogador1 == 2 && jogador2 == 2) || (jogador1 == 3 && jogador2 == 3))
				return 3;
			else
				return 0;
	}
		void placarFinal() {
			if(this.qtdVitoriasJogador1 == this.qtdVitoriasJogador2) {
				JOptionPane.showMessageDialog(null,"\n\nJogo deu empate");
			}
			else if(this.qtdVitoriasJogador1 > this.qtdVitoriasJogador2) {
				JOptionPane.showMessageDialog(null,"\nJogador "+ this.jogador1 +" venceu");
			}
			else {
				JOptionPane.showMessageDialog(null,"\nJogador "+ this.jogador2 +" venceu");
			}
			
			JOptionPane.showMessageDialog(null,"Vitórias do jogador 1: "+this.qtdVitoriasJogador1);
			JOptionPane.showMessageDialog(null,"Vitórias do jogador 2: "+this.qtdVitoriasJogador2);
		}
		public static void main(String[] args) {
			Jokenpo jokenpo = new Jokenpo();
			jokenpo.jogar();
			jokenpo.placarFinal();
		}
}
