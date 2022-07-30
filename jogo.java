package imparpar;
import java.util.Scanner;
import java.util.Random;

public class jogo {

    Scanner ns = new Scanner(System.in);
    Random nr = new Random();

    int num, par, impar, adversario, result, jog, numjog, aux;
    String nomeJog, nomeAdv;
    boolean x=true;
    boolean y;

    public void introdução(){
        System.out.println("=========================================================\n");
        System.out.println("Seja bem vindo ao melhor código de par ou ímpar do mundo!\n");
        System.out.println("=========================================================\n");
    }

    public void escolhaParOuImpar(){
        System.out.println("Digite seu nome: ");
        nomeJog = ns.next();
        System.out.println("Digite o nome do adversario");
        nomeAdv = ns.next();

        System.out.println("Digite: \n[1] ímpar \n[2] par");
        num = ns.nextInt();

        if(num==2){
            jog = 2;
            System.out.println("Jogador "+nomeJog+", você é par");
            System.out.println("Seu adversário "+nomeAdv+" será ímpar");
        }else if(num==1){
            jog = 1;
            System.out.println("Jogador "+nomeJog+", você é ímpar");
            System.out.println("Seu adversário "+nomeAdv+" será par");
        }else{
            System.out.println("Número inválido \nPreste mais atenção");
        }
        }

    public void estruturaJogo(){
        while(x==true){
            System.out.println("Jogador "+nomeJog+ ", digite o número que você irá jogar: \n");
            numjog = ns.nextInt();
            adversario = nr.nextInt(10);
            result = numjog + adversario;
            
            if(result%2==0){
                y = false;
            }else{
                y = true;
            }

            if(jog == 2 && y == false){
                System.out.println("Você jogou: "+numjog);
                System.out.println("Seu adversário "+nomeAdv+" jogou: "+adversario);
                System.out.println("O resultado foi: "+result);
                System.out.println("=========================================================\n");
                System.out.println("Parabéns "+nomeJog+" você ganhou de "+nomeAdv+"!!!");
                System.out.println("=========================================================\n");
            }else if(jog == 1 && y == true){
                System.out.println("Você jogou: "+numjog);
                System.out.println("Seu adversário jogou: "+adversario);
                System.out.println("O resultado foi: "+result);
                System.out.println("=========================================================\n");
                System.out.println("Parabéns "+nomeJog+" você ganhou de "+nomeAdv+"!!!");
                System.out.println("=========================================================\n");
            }else{
                System.out.println("Você jogou: "+numjog);
                System.out.println("Seu adversário jogou: "+adversario);
                System.out.println("O resultado foi: "+result);
                System.out.println(nomeJog + " infelizmente você perdeu para "+nomeAdv);
            }

            System.out.println("Deseja jogar de novo "+nomeJog+"? \n[1] sim \n[2] nao");
            aux = ns.nextInt();
            if(aux==1){
                x=true;
            }else if(aux==2){
                x=false;
            }else{
                System.out.println("Número inválido / Mais atenção");
            }
        }
        }
    }

    



