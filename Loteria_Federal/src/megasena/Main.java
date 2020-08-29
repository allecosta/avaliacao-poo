package megasena; // Pacote do Projeto

import java.util.Random; // Importação da classe Random

public class Main { // Classe principal do programa

    public static void main(String[] args) { // Método principal do programa
        Random r = new Random(); // Instância do objeto usando o construtor padrão
        int dezena [] = new int [6];
        int aux = 0;
        
        System.out.println("**************************");
        System.out.println ("Gerando Dezenas Sorteadas");
        for (int i = 0; i < dezena.length; i++)
               dezena [i] = r.nextInt(60) + 1;
             
        for (int i = 0; i < dezena.length - 1; i++) // Ordenando dezenas do array
            for (int j = i + 1; j < dezena.length; j++)
                if (dezena [i] > dezena [j]){
                    
                }
        System.out.println("DEZENAS DA MEGA-SENA"); // Visualizando as dezenas geradas
        System.out.println("*********************");
        for (int x : dezena)
        System.out.printf("%02d ", x);   
                 
    }
    
}
