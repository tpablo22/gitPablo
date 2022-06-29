//import dominio;
package aplicacion;


public class Principal{
	public static void main(String args[]){
		
		int n = 2;
		
		System.out.println(numPrimo(n,2));
		System.out.println(inumPrim(n,2));


		
	}
	public static boolean numPrimo(int numero, int div){

		if(numero/2<div){
			return true;
		}else{
			if(numero%div == 0){
				return false;
			}
			else{
				return numPrimo(numero, div+1);
			}
		}

	}
	public static boolean inumPrim(int numero, int div){
		
		for(int i=2;i>=div;i++){
			if(numero<i){
				return true;
			}
		}
		}return true;

	}


}





