
package alturamedia;

import java.util.Scanner;

public class AlturaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner sc = new Scanner(System.in);
        int i, N;
        int contMas = 0, contMenos = 0;
        double promedio = 0;
        
        //Leer cantidad de personas
        do{
            System.out.print("Ingrese la cantidad de personas: ");
            N = sc.nextInt();
        }
        while(N <= 0);
        
        //Crear arreglo de tamaño N
        double[] alto = new double[N];
        
        //Leer alturas
        System.out.println("--------------------------------------");
        for (i = 0; i < N; i++) {
            System.out.print("persona " + (i+1) + " = ");
            alto[i] = sc.nextDouble();
            promedio = promedio + alto[i]; //sumar estatura leída para calcular el promedio
        }
        //Calcular el promedio
        promedio = promedio / N;
        
        //Recorrer arreglo para ver cuantos son más altos y cuantos más bajos que el promedio
        for (i = 0; i < alto.length; i++) {
            if (alto[i] > promedio){ //si estatura es mayor al promedio
                contMas++;
            } else if (alto[i] < promedio){ //si estatura es menor al promedio
                contMenos++;
            }
        }
        //Mostrar resultados
        System.out.println("--------------------------------------");
        System.out.println("Estatura promedio: " + promedio);
        System.out.println("Estatura superior al promedio: " + contMas);
        System.out.println("Estatura inferior al promedio: " + contMenos);
    }
    
}
