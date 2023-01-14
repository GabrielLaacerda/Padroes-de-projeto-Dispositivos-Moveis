package observer;

public class Observer {

    public static void main(String[] args) {

        Acao GodOfWar = new AcaoConcreto();
        Investidor Gabriel = new InvestidorConcreto();
        GodOfWar.anexar(Gabriel);
       // GodOfWar.setPreco(100);

    }
}
