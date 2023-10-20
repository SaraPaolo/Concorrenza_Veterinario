import java.util.ArrayList;

public class SalaAttesa {
    private int capienza = 4;
    private int numCani = 0;
    private ArrayList<Animale> lista = new ArrayList<>();

    public synchronized boolean enterRoom(Animale a) throws InterruptedException {
        boolean check = true, check1 = true, check2 = false;
        if (lista.isEmpty() == true) {
            if (a.getType().equals("Cane")) {
                numCani++;
            }
            lista.add(a);
            check2 = true;
            System.out.println("Animale ENTRATO: " + a.getNome());
        } else {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getType().equals("Cane")) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if ((check == true) && (a.getType().equals("Cane")) && (numCani < capienza)) {
                numCani++;
                lista.add(a);
                check2 = true;
                System.out.println("Animale ENTRATO: " + a.getNome());
            } else {
                wait();

            }
        }
        return check2;
    }


    public synchronized void exitRoom(Animale a) {
        lista.remove(a);
        if (a.getType().equals("Cane")) {
            numCani--;
        }
        System.out.println("ANimale USCITO: " + a.getNome());
        notify();
    }
}
