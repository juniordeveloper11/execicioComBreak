package estruturaDeRepeticaoBreak;


public class execicioBreak {
	public static void main(String[] args) {
		
		double valorTotal = 30000;
		for (int parcela = 1 ; parcela < valorTotal; parcela++) {
			double valorParcela = valorTotal/parcela;
			if(valorParcela >= 1000){
				System.out.println("parcela"+ parcela+"R$"+valorParcela);
			}else {
				break;
			}
				System.out.println("fora do if,Mas dentro do for"+parcela );
				
				
			}
			
			
		}
	}


