import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        SalaAttesa salaAttesa = new SalaAttesa();
        int v = 0;
        Animale[] lista = new Animale[10];
        for (int i = 0; i < 10; i++) {
            v = r.nextInt(2);
            if (v == 0) {
                lista[i] = (new Animale("Cane", "Cane-" + i,salaAttesa));
            } else {
                lista[i] = (new Animale("Gatto", "Gatto-" + i,salaAttesa));
            }
        }
        for (int i = 0; i < 10; i++) {
            lista[i].start();
        }
    }
}
