package prova;

import javax.swing.JOptionPane;

public class PareImpar {
	
		int limiteLinhas;
		int opcao;
		
		void escolheTipoImpressao(){
			opcao =Integer.parseInt( JOptionPane.showInputDialog("\nEscolha uma op��o de impress�o: "
					+ "\n1: a partir de um n�mero impar"
					+ "\n2: a partir de um n�mero par"
					+ "\n3: todos os n�meros"));
		
			
			
			limiteLinhas=Integer.parseInt(JOptionPane.showInputDialog("Escolha o limite de impress�o de linhas"));
		
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
