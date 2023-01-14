package decorator;

import static java.lang.System.exit;
import java.util.Scanner;

public class Decorator {

    public static int menu(Scanner ler) {
        System.out.println("FAÇA SEU PEDIDO:");
        System.out.println("1 - Cafe Expresso");
        System.out.println("2 - Cafe Descadeinado");
        System.out.println("0- Sair");

        return ler.nextInt();
    }

    public static void acompanhamentos(Bebida bebida,String desc) {

        Scanner ler = new Scanner(System.in);

        int op;

        System.out.println("Digite o que deseja de acompanhamento: ");
        System.out.println("1 - Leite");
        System.out.println("2 - Chocolate");
        System.out.println("3 - Canela");
        System.out.println("4 - Sem acompanhamentos");

        op = ler.nextInt();

        if (op == 1) {
            bebida = new Leite(bebida);
            desc+=bebida.getDesc();
        } else if (op == 2) {
            bebida = new Chocolate(bebida);
            desc+=bebida.getDesc();
        } else if (op == 3) {
            bebida = new Canela(bebida);
            desc+=bebida.getDesc();
        } 
        
        System.out.println("Obrigado pelo pedido");
        System.out.println("Resumo do pedido: "+desc);
        System.out.println("Valor do pedido: "+bebida.custo());
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int op;
        String desc;

        do {
            op = menu(ler);

            switch (op) {
                case 0:
                    exit(0);

                case 1:
                    Bebida bebida = new CafeExpresso();
                    acompanhamentos(bebida,bebida.getDesc());
                    break;
                    
                case 2:
                    Bebida bebida2 = new CafeDescafeinado();
                    acompanhamentos(bebida2,bebida2.getDesc());
                    break;

            }

        } while (op != 0);

    }

}
