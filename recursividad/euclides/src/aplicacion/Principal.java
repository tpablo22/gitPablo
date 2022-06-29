//import dominio;
package aplicacion;


public class Principal{
	public static void main(String args[]){

		int x = 36;
		int y = 96;

		System.out.println(euclides(y,x));
		System.out.println(iteuclides(y,x));

	}


	public static int euclides(int un,int dos){

		

		if(dos == 0){
		return un;
		}
		else{
		return euclides(dos, un%dos);
		}

	}
	public static int iteuclides(int un,int dos){
		int temporal;

		while(dos != 0){

			temporal = dos;
			dos = un%dos;
			un = temporal;
		}
		return un;
	}
}
