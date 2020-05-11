package app;

import java.util.Scanner;

public class Elfo extends Criatura implements ILlevaReliquia, IHaceMagia {
    public static Scanner Teclado = new Scanner(System.in);
    

    //Constructores
    public Elfo(String nombre, int salud, int stamina){
        super(nombre, salud, stamina);
        int energiaMagica = 0;
        Reliquia reliquia = null;
        this.energiaMagica = energiaMagica;
        this.reliquia = reliquia;
    }

    //Atributos
    private int energiaMagica;
    public int getEnergiaMagica(){
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica){
        this.energiaMagica = energiaMagica;
    }

    private Reliquia reliquia;
    @Override
    public Reliquia getReliquia(){
        return reliquia;
    }

    @Override
    public void setReliquia(Reliquia reliquia){
        this.reliquia = reliquia;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico(int energiaPlayer1, int sP1) {
        if ((energiaPlayer1 >= 20) && (sP1 < 10)) {
        return true;
        }
        return false;
    }
    @Override
    public boolean puedoEjecutarAtaqueEpico2(int energiaPlayer2, int sP2) {
        if ((energiaPlayer2 >= 20) && (sP2 < 10)) {
        return true;
        }
        return false;
    }

    @Override
    public void ataqueEpico(Personaje player1, Arma arma, double saludP2, int sP1) {
        System.out.println("Elija el arma  con la que morirá epicamente");
        int ar = Teclado.nextInt();
        arma = player1.getArmas().get(ar);
        System.out.println("Ha elegido el arma: " +player1.getArmas().get(ar).getNombre());
        int danioArma = player1.getArmas().get(ar).getDanio();
        double fAtaque;
        fAtaque = ((ILlevaReliquia)player1).getReliquia().getFactorDeAtaque();
        
        double danioCausado = (danioArma + (saludP2 * fAtaque) +30);
        System.out.println("El daño causado es:   " +danioCausado );
        sP1 = sP1 * 0;
        System.out.println("Se ha drenado toda su estamina, Ud ha muerto");
        
        return;

    }

    @Override
    public void ataqueEpico2(Personaje player2, Arma arma, double saludP1, int sP2) {
        System.out.println("Elija el arma  con la que morirá epicamente");
        int arr = Teclado.nextInt();
        arma = player2.getArmas().get(arr);
        System.out.println("Ha elegido el arma: " +player2.getArmas().get(arr).getNombre());
        int danioArma = player2.getArmas().get(arr).getDanio();
        double fAtaque;
        fAtaque = ((ILlevaReliquia)player2).getReliquia().getFactorDeAtaque();
        
        double danioCausado = (danioArma + (saludP1 * fAtaque) +30);
        System.out.println("El daño causado es:   " +danioCausado );
        sP2 = sP2 * 0;
        System.out.println("Se ha drenado toda su estamina, Ud ha muerto");
        
        return;

    }



    
}