package prova;

import javax.swing.JOptionPane;

public class NumeroPrimo {
	
	Integer opc;
	


	
	
	void opcnumeros (){
		
		opc = Integer.parseInt(JOptionPane.showInputDialog("Digite qual impress�o de n�meros primos vc deseja \n 1 - Para imprimir os 50 primeiros n�meros primos de 1 a 100"
				+ "\n 2 - Para imprimir os 50 �ltimos n�meros primos de 1 a 100"
				+ "\n 3 - Para imprimir todos os n�meros primos at� 100 "));
		
		
	}
	
	void escolha (){
		
		opcnumeros();
		
		
		if (opc==3){
			String valores="";
			
			 for (int n=2; n<=100; n++) {
			      if (primo(n) == true)  
			   valores +=n+"\n";
			   
			                                   
			    }
			 JOptionPane.showMessageDialog(null,valores);  
			
			
		}
		else if (opc==1){
			String valores="";
			
			 for (int n=2; n<50; n++) {
			      if (primo(n) == true)  
			   valores +=n+"\n";
			   
			                                   
			    }
			 JOptionPane.showMessageDialog(null,valores);  
			
		
	}
		else if (opc==2){
			String valores="";
			
			 for (int n=51; n<=100; n++) {
			      if (primo(n) == true)  
			   valores +=n+"\n";
			   
			                                   
			    }
			 JOptionPane.showMessageDialog(null,valores);  
			
		
	}
	}
	
	static Boolean primo(int n) {
	   Boolean ehPrimo = true;
	    Integer i = 2;
	    while ((ehPrimo == true) && (i <= (n / 2))) {
	      if ((n % i) == 0)
	         ehPrimo = false; 
	      else i++;
	    }
	    return (ehPrimo); 
	  }
	 
		 // fim do corpo da classe "Modular"
	 

	public static void main(String[] args) {
		
		NumeroPrimo np = new NumeroPrimo();
		
		np.escolha();
	}

}
