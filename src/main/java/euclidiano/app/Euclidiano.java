package euclidiano.app;

public class Euclidiano {
	
	public static void main(String[] args) {
		
		int[] numeros = {2,5,6,12,15,45,66,99,101};
		int buscar = 6;	
		int primero = 0;
		int ultimo = numeros.length - 1;
		
		while(primero <= ultimo) {
			int media = calculaMedia(primero, ultimo );
			System.out.println("la media: "+ media + "numero en media "+ numeros[media]);
			if(numeros[media] == buscar) {
				System.out.println("el numero: "+ buscar + " esta en la posicion: "+ media);
			}
			if(numeros[media] > buscar) {
				ultimo = media - 1;
			}else {
				primero = media + 1;
			}
			
		}
	}
	
	public static int calculaMedia(int primero, int ultimo) {
		return primero + (ultimo - primero)/2;
	}

}
