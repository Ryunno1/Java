package prova;

import javax.swing.JOptionPane;

public class PareImpar {
	
		int limiteLinhas;
		int opcao;
		int r;
		
		void escolheTipoImpressao(){
			opcao =Integer.parseInt( JOptionPane.showInputDialog("\nEscolha uma opção de impressão: "
					+ "\n1: a partir de um número impar"
					+ "\n2: a partir de um número par"
					+ "\n3: todos os números"));
		
			
			
			limiteLinhas=Integer.parseInt(JOptionPane.showInputDialog("Escolha o limite de impressão de linhas"));
		
		}
		
		void imprimeTabela() {
			for(int i = 1; i <= this.limiteLinhas; i++) {
				for(int j = 1; j<=i; j++) {
					int mult = i*j;
					
					if(this.opcao == 1) {
						if(i%2 != 0) {
							System.out.print(" "+mult);
						}
					}
					if(this.opcao == 2) {
						if(i%2 == 0) {
							System.out.print(" "+mult);
						}
					}
					if(this.opcao == 3) {
						System.out.print(" "+mult);
					}
				}
				System.out.println("");
			}
		}
		
		public static void main(String[] args) {
			PareImpar pi = new PareImpar();
			
			pi.escolheTipoImpressao();
			pi.imprimeTabela();
			
		
		}
	

}
