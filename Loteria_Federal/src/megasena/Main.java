package megasena;

import java.util.Random; 

public class Main { 

    public static void main(String[] args) { 
        Random r = new Random(); // 
        int dezena [] = new int [6];
        int aux = 0;
        
        System.out.println("**************************");
        System.out.println ("Gerando Dezenas Sorteadas");
        for (int i = 0; i < dezena.length; i++)
               dezena [i] = r.nextInt(60) + 1;
             
        for (int i = 0; i < dezena.length - 1; i++) // Ordenando dezenas do array
            for (int j = i + 1; j < dezena.length; j++)
                if (dezena [i] > dezena [j]){
                    aux = dezena [i];
                    dezena [i] = dezena [j];
                    dezena [j] = aux;
                    
                }
        System.out.println("DEZENAS DA MEGA-SENA"); // Visualizando as dezenas geradas
        System.out.println("*********************");
        for (int x : dezena)
        System.out.printf("%02d ", x);   
                 
    }
    
}
