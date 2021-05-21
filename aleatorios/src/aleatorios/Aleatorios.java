package aleatorios;

import java.util.ArrayList;
import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
		
		ArrayList numeros = new ArrayList();
		
		while(numeros.size()<6){
			int random = new Random().nextInt(60) + 1;
			if(!numeros.contains(random)) {
				numeros.add(random);
			}
		}
		
		System.out.println("Numeros sorteados: "+numeros);
		// TODO Auto-generated method stub

	}

}
