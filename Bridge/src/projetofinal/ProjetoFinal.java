package projetofinal;

import Interfaces.Midia;
import Midias.LivroConcreto;
import Midias.FilmeConcreto;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoFinal {

    public static int menu(Scanner ler) {

        int op;

        System.out.println("-----------DIGITE A OPCAO DE MIDIA DESEJADA----------\n");
        System.out.println("1 - LIVRO");
        System.out.println("2 - FILME");
        System.out.println("0 - SAIR");

        op = ler.nextInt();

        return op;
    }

    public static boolean buscar(ArrayList<Midia> catalog, int cod) {

        for (int i = 0; i < catalog.size(); i++) {

            if (catalog.get(i).getCod() == cod) {
                catalog.get(i).Imprimir();
                return true;
            }
        }
        return false;
    }

    public static void quantidade(ArrayList<Midia> catalog, int cod, int quant, int chave) {

        for (int i = 0; i < catalog.size(); i++) {

            if (catalog.get(i).getCod() == cod && chave == 1) {

                if (catalog.get(i).getQuantidade() < quant) {

                    System.out.println("\nNAO HA ESTOQUE DISPONIVEL");
                    System.out.println("Quantidade Atualizada: " + catalog.get(i).getQuantidade());
                    System.out.println("");

                } else {
                    catalog.get(i).setQuantidade(catalog.get(i).getQuantidade() - quant);
                    System.out.println("\nCOMPRA EFETUADA COM SUCESSO");
                    System.out.println("Quantidade Atualizada: " + catalog.get(i).getQuantidade());
                    System.out.println("");
                }
                return;
            }

            if (catalog.get(i).getCod() == cod && chave == 2) {

                catalog.get(i).setQuantidade(catalog.get(i).getQuantidade() + quant);
                System.out.println("\nQuantidade Atualizada: " + catalog.get(i).getQuantidade());
                System.out.println("");
                return;
            }
        }
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<Midia> CatalogoLivros = new ArrayList<>();
        ArrayList<Midia> CatalogoFilmes = new ArrayList<>();

        int op, quant, cod, flag = 0;
        String nome;
        boolean certo;

        Midia mid;

        try {

            do {
                op = menu(ler);

                switch (op) {

                    //OPÇOES PARA LIVROS
                    case 0:
                        System.out.println("\nOBRIGADO PELA VISITA\n");
                        break;

                    case 1:
                        System.out.println("\nO QUE DESEJA FAZER ?\n");
                        System.out.println("1 - Inserir Livro no catalogo");
                        System.out.println("2 - Ficha de livro especifico");
                        System.out.println("3 - Ver Catalogo Completo");
                        System.out.println("4 - Realizar compra/saida");
                        System.out.println("5 - Realizar entrada");
                        System.out.println("6 - Possiveis Duvidas");

                        op = ler.nextInt();

                        switch (op) {
                            case 1:

                                mid = new LivroConcreto();
                                certo = mid.cadastro(ler, CatalogoLivros);

                                if (certo == true) {
                                    System.out.println("\nCADASTRO EFETUADO COM SUCESSO\n");
                                    CatalogoLivros.add(mid);
                                }
                                break;

                            case 2:
                                System.out.println("Digite o codigo: ");
                                cod = ler.nextInt();
                                certo = buscar(CatalogoLivros, cod);

                                if (certo == false) {
                                    System.out.println("\nCADASTRO NAO ENCONTRADO\n");
                                }
                                break;

                            case 3:
                                System.out.println("\nCATALOGO LIVROS ATUALIZADO\n");
                                for (int i = 0; i < CatalogoLivros.size(); i++) {
                                    CatalogoLivros.get(i).Imprimir();
                                }
                                break;

                            case 4:
                                System.out.println("Digite o codigo do livro: ");
                                cod = ler.nextInt();
                                certo = buscar(CatalogoLivros, cod);

                                if (certo == true) {
                                    System.out.println("Quantas unidades deseja comprar: ");
                                    quant = ler.nextInt();
                                    quantidade(CatalogoLivros, cod, quant, 1);
                                } else {
                                    System.out.println("\nCADASTRO NAO ENCONTRADO\n");
                                }
                                break;

                            case 5:
                                System.out.println("Digite o codigo do livro: ");
                                cod = ler.nextInt();
                                certo = buscar(CatalogoLivros, cod);

                                if (certo == true) {
                                    System.out.println("Quantas unidades deseja adicionar ao estoque: ");
                                    quant = ler.nextInt();
                                    quantidade(CatalogoLivros, cod, quant, 2);
                                } else {
                                    System.out.println("\nCADASTRO NAO ENCONTRADO\n");
                                }
                                break;

                            case 6:
                                System.out.println("\nGeneros Possiveis:\n");
                                System.out.println("- Terror\n- Acao\n- Animacao\n- Comedia\n- Documentario\n- FiccaoCientifica\n- Romance");
                                System.out.println("\nPlataformas Possiveis:\n");
                                System.out.println("- AmazonPrime/Amazon\n- Scribd\n- Saraiva\n");

                                break;
                        }
                        break;

                    //OPCOES PARA FILMES
                    case 2:
                        System.out.println("\n1 - Inserir filme no catalogo");
                        System.out.println("2 - Ficha de filme especifico");
                        System.out.println("3 - Ver Catalogo");
                        System.out.println("4 - Retirar Filme do Catalogo");

                        op = ler.nextInt();

                        switch (op) {

                            case 1:
                                mid = new FilmeConcreto();
                                certo = mid.cadastro(ler, CatalogoFilmes);

                                if (certo == true) {
                                    System.out.println("\nCADASTRO EFETUADO COM SUCESSO\n");
                                    CatalogoFilmes.add(mid);
                                }
                                break;

                            case 2:
                                System.out.println("Digite o codigo: ");
                                cod = ler.nextInt();
                                certo = buscar(CatalogoFilmes, cod);

                                if (certo == false) {
                                    System.out.println("\nCADASTRO NAO ENCONTRADO\n");
                                }
                                break;

                            case 3:
                                System.out.println("\nCATALOGO FILMES ATUALIZADO\n");
                                for (int i = 0; i < CatalogoFilmes.size(); i++) {
                                    CatalogoFilmes.get(i).Imprimir();
                                }
                                break;

                            case 4:
                                flag = 0;
                                System.out.println("Digite o codigo do filme: ");
                                cod = ler.nextInt();

                                for (int i = 0; i < CatalogoFilmes.size(); i++) {

                                    if (CatalogoFilmes.get(i).getCod() == cod) {
                                        CatalogoFilmes.remove(i);
                                        flag = 1;
                                        System.out.println("\nEXCLUSAO EFETUADA\n");
                                        break;
                                    }
                                }
                                if (flag == 0) {
                                    System.out.println("\nCADASTRO NAO ENCONTRADO\n");
                                }
                                break;

                            case 5:

                                System.out.println("\nGeneros Possiveis:\n");
                                System.out.println("- Terror\n- Acao\n- Animacao\n- Comedia\n- Documentario\n- FiccaoCientifica\n- Romance");
                                System.out.println("\nPlataformas Possiveis:\n");
                                System.out.println("- AmazonPrime/Amazon\n- Netflix\n- Saraiva\n");

                            default:
                                break;
                        }
                        break;

                    default:
                        System.out.println("\nOPÇAO INVALIDA\n");
                        break;
                }

            } while (op != 0);

        } catch (Exception p) {
            System.out.println("\nALGO DEU ERRADO\n");
        }
    }

}
