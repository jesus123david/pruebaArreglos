package arreglosAyB;
import java.util.Scanner;
public class arreglosAyB_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner codigo = new Scanner (System.in);
		
		        System.out.print("Ingrese el tamaño de los arreglos: ");
		        int n = codigo.nextInt();

		        int[] A = new int[n];
		        int[] B = new int[n];
		        System.out.println("Ingrese los elementos del arreglo A:");
		        for (int i = 0; i < n; i++) {
		            A[i] = codigo.nextInt();
		        }
		        System.out.println("Ingrese los elementos del arreglo B:");
		        for (int i = 0; i < n; i++) {
		            B[i] = codigo.nextInt();
		        }

		        int productoPuntos = 0;
		        for (int i = 0; i < n; i++) {
		            productoPuntos += A[i] * B[i];
		        }
		        System.out.println("El producto de puntos es: " + productoPuntos);

		        int productoA = 1;
		        int productoB = 1;
		        double modA = 0;
		        double modB = 0;
		        for (int i = 0; i < n; i++) {
		            productoA *= A[i];
		            productoB *= B[i];
		            modA += Math.pow(A[i], 2);
		            modB += Math.pow(B[i], 2);
		        }
		        modA = Math.sqrt(modA);
		        modB = Math.sqrt(modB);
		        double z = (productoA * productoB) / (modA * modB);
		        System.out.println("La expresión Z es: " + z);
		        
	  }
	}


