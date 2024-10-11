public class Main {
    public static void main(String[] args) {
        FormaManager forma = new FormaManager();

        forma.addForma("Vermelho", "0,0", 10);
        forma.addForma("Verde", "1,1", 20);
        forma.addForma("Vermelho", "2,2", 15);

        forma.apresentar();
    }
}
