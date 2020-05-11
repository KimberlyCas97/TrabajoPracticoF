package app;

public class Hobbit extends Criatura implements ILlevaReliquia{

    //Constructor
    public Hobbit(String nombre, int salud, int stamina){
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