//import dominio;
package aplicacion;


public class Principal{
	public static void main(String args[]){
		int x = 5;

		System.out.println(sumar(x));
		System.out.println(factorial(x));
			System.out.println(sumai(x));
	}
	public static int sumar(int n){
		int num;

		if(n == 0){
			return 0;
		}else{
			num = n+sumar(n-1);
		}
		return num;

	}



	public static int factorial(int n){
		int num1;

		if(n == 0){
			return 1;
		}else{
			num1 = n+factorial(n-1);
		}
		return num1;



	}
		public static int sumai(int n){

		int sumais=1;

		for(int i=1; i<=n;i++){

		sumais = sumais*i;
		}return sumais;
		}
}





