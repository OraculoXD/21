import java.util.Random;

/**
 * Escreva uma descrição da classe Blackjack aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Blackjack
{
    public static void main(String[] args) {
        Random r;
        int c1, c2;
        
        r = new Random();
        
        c1 = 1 + r.nextInt(13);
        c2 = 1 + r.nextInt(13);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 + c2);
        
    }
}