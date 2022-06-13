package Class;

public class Games {
    int ID_Jogo;
    String nomeJogo;
    String genero;

    public Games() {
        
    }

    public Games(int ID_Jogo, String nomeJogo, String genero) {
        this.ID_Jogo = ID_Jogo;
        this.nomeJogo = nomeJogo;
        this.genero = genero;
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
    
    
}

