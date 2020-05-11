package app;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    public List<Arma> armas = new ArrayList<>();
    
    public List<Arma> getArmas(){
        return armas;
    }
    public void setArmas(List<Arma> armas){
        this.armas = armas;
    }




   //Constructores
    public Personaje(String nombre, int salud, int stamina){
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }

   
   //ATRIBUTOS : getter y setter 
    private String nombre;
    public String getNombre(){
        return nombre;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    private int salud; 
    public int getSalud(){
        return salud;
    }
    
    public void setSalud(int salud){
        this.salud = salud;
    }

    private int stamina;
	
    public int getStamina(){
        return stamina;
    }

    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    //Metodos
    public boolean estaVivo(){
        return true;
    }

    public void atacar(Personaje personaje, Arma arma){

    }

    
    

}