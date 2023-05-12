package ejerciciosBucles;

/*
Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez
utiliza un contador sumando de 1 en 1
 */
public class ejercicio03bucles {
    public static void main(String[] args) {
        for (int i = 0 ; i <= 200 ; i++) {
            if (i % 2 == 0) {
                    System.out.println(i);
                    }
        }
    }
    
}
