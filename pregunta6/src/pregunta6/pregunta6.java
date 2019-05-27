package pregunta6;
import java.util.Scanner;
public class pregunta6 {
    private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingresar tamaño del vector");
		teclado=new Scanner(System.in);
		int n=teclado.nextInt();
		int vector[]=new int[n];
		int pro=0, max=0;
		
		System.out.println("Ingresar los numeros del vector");
		for(int i=0; i<vector.length;i++){
			vector[i]=teclado.nextInt();
		}
		for (int j=0;j<vector.length-3;j++){
			pro=vector[j]*vector[j+1]*vector[j+2]*vector[j+3];
			if (pro>max){
				max=pro;
			}
		}
		for (int j=0;j<vector.length;j++){
			if(vector[j]*vector[j+1]*vector[j+2]*vector[j+3]==max){
				System.out.println("El mayor producto es: "+max);
				System.out.println(vector[j]+" "+vector[j+1]+" "+vector[j+2]+" "+vector[j+3]);
			}
		}

	}

}


	
