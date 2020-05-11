package app;

import java.util.ArrayList;
import java.util.List;

public class Arma {

    public List<Arma> armas = new ArrayList<Arma>();
 
    
    
    
    //Constructor
    public Arma(String nombre, int danio, int stamina){
        this.nombre = nombre;
        this.danio = danio;
        this.stamina = stamina;
    }

    //Atributos
    private String nombre;
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    private int danio;
    public int getDanio(){
        return danio;
    }

    public void setDanio(int danio){
        this.danio = danio;
    }


    private int stamina;
    public int getStamina(){
        return stamina;
    }

    public void setStamina(int stamina){
        this.stamina = stamina; 
    }

}