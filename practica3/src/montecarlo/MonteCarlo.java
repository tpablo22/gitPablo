package montecarlo;

import java.util.stream.Stream;
import java.util.Random;

public class MonteCarlo {

	public static double hallarPuntosCirculo(long puntoTotales){
		return Stream.generate(() ->Math.pow(Math.random(),2)+Math.pow(Math.random(),2)).limit(puntoTotales).filter(x -> x<1).count();
	}

	public static double calcularNumeroPi(long puntosTotales){
		double pi;
		return pi = 4.00 *((double)hallarPuntosCirculo(puntosTotales)/puntosTotales);
	}
}


