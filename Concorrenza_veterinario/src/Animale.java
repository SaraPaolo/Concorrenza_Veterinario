public class Animale extends Thread {

    private String type;
    private String nome;

    private SalaAttesa salaAttesa;

    public Animale(String type, String nome, SalaAttesa salaAttesa) {
        this.type = type;
        this.nome = nome;
        this.salaAttesa = salaAttesa;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (salaAttesa.enterRoom(this) == true) {
                    attesa();
                    salaAttesa.exitRoom(this);
                }
            }

        } catch (InterruptedException e) {
            System.err.println("Errore ingresso sala d'attesa");
        }
    }

    public void attesa() throws InterruptedException {
        int tempo = ((int) (Math.random() * 1000) + 1);
        Thread.sleep(tempo);
        System.out.println(getNome() + " è in attesa nella stanza per " + tempo + "ms");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
