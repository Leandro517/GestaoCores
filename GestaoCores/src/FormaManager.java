import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas = new ArrayList<>();
    private CorFactory corFactory = new CorFactory();

    public void addForma(String nomeCor, String posicao, int tamanho) {
        Cor cor = corFactory.getCor(nomeCor);
        Forma forma = new Forma(cor, posicao, tamanho);
        formas.add(forma);
    }

    public void apresentar() {
        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}
