package imparpar;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner ns = new Scanner(System.in);
        jogo j1 = new jogo();

        j1.introdução();

        j1.escolhaParOuImpar();

        j1.estruturaJogo();

    }
}
