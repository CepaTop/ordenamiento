import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ordenamiento {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("Cuantos numeros desea ingresar: ");
        int n= sc.nextInt();
        
        int arr[] = new int[n];
        
       for (int i = 0; i < n; i++) {
            arr[i] = ra.nextInt();
        }
        System.out.println("Arreglo generado: " + Arrays.toString(arr));

        ordenar(arr);

        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
    }
    
    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j < v.length ; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}