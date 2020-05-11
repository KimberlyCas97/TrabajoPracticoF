package app;

public class Humano extends Personaje implements ILlevaReliquia{

    //Constructor
    
    public Humano(String nombre, int salud, int stamina){
        
        super(nombre, salud, stamina);
        Reliquia reliquia = null;
        this.reliquia = reliquia;
    }

    //Atributos
    private Reliquia reliquia;
    @Override
    public Reliquia getReliquia(){
        return reliquia;
    }


    @Override
    public void setReliquia(Reliquia reliquia){
        this.reliquia = reliquia;
    }

   
    
}