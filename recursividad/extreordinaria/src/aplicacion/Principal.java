//import dominio;
package aplicacion;


public class Principal{
	public static void main(String args[]){
		int a= 96;
		int b= 36;

		System.out.println(iterativo(a,b));
		System.out.println(recursivo(a,b));

		lambda operacion=(x , y)->{
			int qw;
			

			while(y != 0){
				qw=y;
				y=x%y;
				x=qw;

				}
			System.out.println(x);
			

		};

		operacion.expresion(96,36);

		
	}
	public static int iterativo(int m,int n){

		int valor;

		while(n != 0){
			 valor = n;
			 n = m%n;
			 m = valor;
		}return m;

	}
	public static int recursivo(int m,int n){
	int resto;	
		if(n == 0){
			return m;
		}else{
			resto = recursivo(n, m%n);
		}return resto;
			
	
	}
	public interface lambda{
		void expresion(int m, int n);
	}
	

}





