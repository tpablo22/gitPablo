//import dominio;
package aplicacion;


public class Principal{
	public static void main(String args[]){

		ICalculadora calculadora=(n1, n2)->{
			double resultado = n1 + n2;
			System.out.println("la suma es: "+resultado);
		};
		ICalculadora calculadora1=(n1, n2)->{
			double resultado = n1-n2;
			System.out.println("la resta es: "+resultado);;
		};
		ICalculadora factorial=(n1,n2)->{
			double factori =  1;
			for(double i = 1;i<=n1;i++){
				factori = n1*i;
			}
			System.out.println("el facotrial de "+n1+" es: "+factori);
		};

		calculadora.operacion(23, 45);
		calculadora1.operacion(33, 21);
		factorial.operacion(4, 3333);



		
	}
	public interface ICalculadora{
		void operacion(double a,double b);
	}


}





