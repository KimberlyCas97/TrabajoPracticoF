package app;

public interface IHaceMagia {
    int getEnergiaMagica();
    void setEnergiaMagica(int energiaMagica);
    boolean puedoEjecutarAtaqueEpico(int energiaPlayer1, int stamina1);
    boolean puedoEjecutarAtaqueEpico2(int energiaPlayer2, int stamina2);
    void ataqueEpico(Personaje player1, Arma arma, double saludP2, int stamina1);
    void ataqueEpico2(Personaje player2, Arma arma, double saludP1, int stamina2);
    
    
}