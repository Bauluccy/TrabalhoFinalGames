package Class;

public class Jogos {
    int ID_Jogo;
    String nomeJogo;
    String genero;
    double valor;

    public Jogos() {
    }

    public Jogos(int ID_Jogo, String nomeJogo, String genero, double valor) {
        this.ID_Jogo = ID_Jogo;
        this.nomeJogo = nomeJogo;
        this.genero = genero;
        this.valor = valor;
    }

    public int getID_Jogo() {
        return ID_Jogo;
    }

    public void setID_Jogo(int ID_Jogo) {
        this.ID_Jogo = ID_Jogo;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}