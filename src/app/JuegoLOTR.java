package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoLOTR {
    public static Scanner Teclado = new Scanner(System.in);

    public List<Personaje> personajes = new ArrayList<Personaje>();
    public  Personaje personajefinal = null;


       public void inicializarCatalogo(){
           agregarAngbor();
           agregarDervorin();
           agregarHirluin();
           agregarRadagast();
           agregarAlatar();
           agregarPallando();
           agregarFrodo();
           agregarTom();
           agregarTedArenas();
           agregarLegolas();
           agregarGildor();
           agregarGaladriel();
           agregarMuzgash();
           agregarUfthak();
           agregarSnaga();
           agregarGoblin();
           agregarThorin();
           agregarGimli();
           agregarDurin();
           agregarOloghai();
           agregarTrollDeMontaña();
           agregarTrollDePiedra();

       }
       public Personaje buscarPersonaje(String nombre){
            for(Personaje p : this.personajes){
                if(p.getNombre().equalsIgnoreCase(nombre)){
                return p;
            }
        }
            return null;
       }


       
       
        /////////////////////////PERSONAJES///////////////////////////////////////////////////////
        ///HUMANOS

        public void agregarAngbor(){
            ChalecoMithril chalecoMithril = new ChalecoMithril("ChalecoMithril", 0.25, 0.1);
            Humano angbor = new Humano("Angbor", 100, 100);
            ((ILlevaReliquia) angbor).setReliquia(chalecoMithril);
           // System.out.println("la reqliquia que lleva" + angbor.getReliquia().getFactorDeAtaque());
            this.personajes.add(angbor);
            HachaDoble hachaDoble = new HachaDoble("Hacha doble", 15, 15);
            angbor.armas.add(hachaDoble);
            Anduril anduril = new Anduril("Anduril", 20, 55);
            ((IEsMagico) anduril).setEnergiaMagica(40);
            angbor.armas.add(anduril);
            Sting sting = new Sting("Sting", 25, 55);
            ((IEsMagico) sting ).setEnergiaMagica(15);
            angbor.armas.add(sting);


        }

        public void agregarDervorin(){
            ChalecoMithril chalecoMithril = new ChalecoMithril("ChalecoMithril", 0.2, 0.15);
            Humano dervorin = new Humano("Dervorin", 100, 100);
            ((ILlevaReliquia) dervorin).setReliquia(chalecoMithril);
            this.personajes.add(dervorin);
            HachaDoble hachaDoble = new HachaDoble("Hacha doble", 20, 50);
            dervorin.armas.add(hachaDoble);
            Anduril anduril = new Anduril("Anduril", 25, 40);
            ((IEsMagico)anduril).setEnergiaMagica(10);
            dervorin.armas.add(anduril);
            Sting sting = new Sting("Sting", 20, 30);
            ((IEsMagico) sting).setEnergiaMagica(15);
            dervorin.armas.add(sting);
            
        }

        public void agregarHirluin(){
            ChalecoMithril chalecoMithril = new ChalecoMithril("ChalecoMithril", 0.1, 0.2);
            
            Humano hirluin = new Humano("Hirluin", 100, 100);
            ((ILlevaReliquia) hirluin).setReliquia(chalecoMithril);
            this.personajes.add(hirluin);
            HachaDoble hachaDoble = new HachaDoble("Hacha doble", 25, 35);
            hirluin.armas.add(hachaDoble);
            Anduril anduril = new Anduril("Anduril", 20, 45);
            ((IEsMagico)anduril).setEnergiaMagica(20);
            hirluin.armas.add(anduril);
            Sting sting = new Sting("Sting", 15,40);
            ((IEsMagico)sting).setEnergiaMagica(15);
            hirluin.armas.add(sting);
        }
        /////////////////////WIZARD////
        
        public void agregarRadagast(){
            FrascoGaladriel frascoGaladriel = new FrascoGaladriel("FrascoGaladriel", 0.25, 0.4);
            ((IEsMagico)frascoGaladriel).setEnergiaMagica(25);
            Wizard radagast = new Wizard("Radagast", 100, 100);
            ((IHaceMagia)radagast).setEnergiaMagica(100);
            ((ILlevaReliquia)radagast).setReliquia(frascoGaladriel);
            this.personajes.add(radagast);
            Baculo baculo = new Baculo("Baculo", 15, 40);
            ((IEsMagico)baculo).setEnergiaMagica(30);
            radagast.armas.add(baculo);
            Anduril anduril = new Anduril("Anduril", 10, 45);
            ((IEsMagico)anduril).setEnergiaMagica(20);
            radagast.armas.add(anduril);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 20, 30);
            radagast.armas.add(arcoYFlecha);

        }

        public void agregarAlatar(){
            ChalecoMithril chalecoMithril = new ChalecoMithril("ChalecoMithril", 0.3, 0.2);
          
            Wizard alatar = new Wizard("Alatar", 100, 100);
            ((IHaceMagia)alatar).setEnergiaMagica(100);
            ((ILlevaReliquia)alatar).setReliquia(chalecoMithril);
            this.personajes.add(alatar);
            Baculo baculo = new Baculo("Baculo", 10, 45);
            ((IEsMagico)baculo).setEnergiaMagica(30);
            alatar.armas.add(baculo);
            Sting sting = new Sting("Sting", 10, 35);
            ((IEsMagico)sting).setEnergiaMagica(20);
            alatar.armas.add(sting);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 15, 30);
            alatar.armas.add(hachaDoble);
        }

        public void agregarPallando(){
            ChalecoMithril chalecoMithril = new ChalecoMithril("ChalecoMithril", 0.25, 0.2);

            Wizard pallando = new Wizard("Pallando", 100, 100);
            ((IHaceMagia)pallando).setEnergiaMagica(100);
            ((ILlevaReliquia)pallando).setReliquia(chalecoMithril);
            this.personajes.add(pallando);
            Anduril anduril = new Anduril("Anduril", 10, 35);
            ((IEsMagico)anduril).setEnergiaMagica(20);
            pallando.armas.add(anduril);
            Sting sting = new Sting("Sting", 10, 40);
            ((IEsMagico)sting).setEnergiaMagica(20);
            pallando.armas.add(sting);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 10, 35);
            pallando.armas.add(hachaDoble);
        }

        /////// HOBBIT

        public void agregarFrodo(){
            AnilloSauron anilloSauron = new AnilloSauron("AnilloSauron", 0.5, 0.4);
            ((IEsMagico)anilloSauron).setEnergiaMagica(40);
            Hobbit frodo = new Hobbit("Frodo", 100, 100);
            ((ILlevaReliquia)frodo).setReliquia(anilloSauron);
            this.personajes.add(frodo);
            Sting sting = new Sting("Sting", 15, 40);
            ((IEsMagico)sting).setEnergiaMagica(15);
            frodo.armas.add(sting);
            Baculo baculo = new Baculo("Baculo", 10, 45);
            ((IEsMagico)baculo).setEnergiaMagica(25);
            frodo.armas.add(baculo);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 20, 35);
            frodo.armas.add(hachaDoble);

        }

        public void agregarTom(){
            FrascoGaladriel frascoGaladriel = new FrascoGaladriel("FrascoGaladriel", 0.4, 0.3);
            ((IEsMagico)frascoGaladriel).setEnergiaMagica(20);
            Hobbit tom = new Hobbit("tom", 100, 100);
            ((ILlevaReliquia)tom).setReliquia(frascoGaladriel);
            this.personajes.add(tom);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 20, 35);
            tom.armas.add(arcoYFlecha);
            Baculo baculo = new Baculo("Baculo", 15, 45);
            ((IEsMagico)baculo).setEnergiaMagica(25);
            tom.armas.add(baculo);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 15, 30);
            tom.armas.add(hachaDoble);
            
        }

        public void agregarTedArenas(){
            ChalecoMithril chalecoMithril = new ChalecoMithril("ChalecoMithril", 0.2, 0.3);
            Hobbit tedArenas = new Hobbit("TedArenas", 100, 100);
            ((ILlevaReliquia)tedArenas).setReliquia(chalecoMithril);
            this.personajes.add(tedArenas);
            Sting sting = new Sting("Sting", 20, 35);
            ((IEsMagico)sting).setEnergiaMagica(15);
            tedArenas.armas.add(sting);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 15, 30);
            tedArenas.armas.add(arcoYFlecha);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 20, 25);
            tedArenas.armas.add(hachaDoble);
            
        }
        ////////////////////////////ELFO

        public void agregarLegolas(){
            AnilloNarya anilloNarya = new AnilloNarya("AnilloNarya", 0.4, 0.4);
            ((IEsMagico)anilloNarya).setEnergiaMagica(10);
            Elfo legolas = new Elfo("Legolas", 100, 100);
            ((ILlevaReliquia)legolas).setReliquia(anilloNarya);
            ((IHaceMagia)legolas).setEnergiaMagica(100);
            this.personajes.add(legolas);
            Anduril anduril = new Anduril("Anduril", 15, 30);
            ((IEsMagico)anduril).setEnergiaMagica(10);
            legolas.armas.add(anduril);
            Sting sting = new Sting("Sting", 10, 35);
            ((IEsMagico)sting).setEnergiaMagica(20);
            legolas.armas.add(sting);
            Baculo baculo = new Baculo("Baculo", 15, 45);
            ((IEsMagico)baculo).setEnergiaMagica(20);
            legolas.armas.add(baculo);
        
        }

        public void agregarGildor(){
            AnilloNenya anilloNenya = new AnilloNenya("AnilloNenya", 0.3, 0.3);
            ((IEsMagico)anilloNenya).setEnergiaMagica(20);
            Elfo gildor = new Elfo("Gildor", 100, 100);
            ((IHaceMagia)gildor).setEnergiaMagica(100);

            ((ILlevaReliquia)gildor).setReliquia(anilloNenya);
            this.personajes.add(gildor);
            Anduril anduril = new Anduril("Anduril", 15, 45);
            ((IEsMagico)anduril).setEnergiaMagica(10);
            gildor.armas.add(anduril);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 15, 35);
            gildor.armas.add(arcoYFlecha);
            Baculo baculo = new Baculo("Baculo", 15, 30);
            ((IEsMagico)baculo).setEnergiaMagica(20);
            gildor.armas.add(baculo);
        
        }

        public void agregarGaladriel(){
            AnilloVilya anilloVilya = new AnilloVilya("AnilloVilya", 0.3, 0.25);
            ((IEsMagico)anilloVilya).setEnergiaMagica(10);
            Elfo galadriel = new Elfo("Galadriel", 100, 100);
            ((ILlevaReliquia)galadriel).setReliquia(anilloVilya);
            ((IHaceMagia)galadriel).setEnergiaMagica(100);
            this.personajes.add(galadriel);
            Anduril anduril = new Anduril("Anduril", 20, 35);
            ((IEsMagico)anduril).setEnergiaMagica(20);
            galadriel.armas.add(anduril);
            Sting sting = new Sting("Sting", 15, 40);
            ((IEsMagico)sting).setEnergiaMagica(20);
            galadriel.armas.add(sting);
            Baculo baculo = new Baculo("Baculo", 20, 45);
            ((IEsMagico)baculo).setEnergiaMagica(20);
            galadriel.armas.add(baculo);
        
        }

        public void agregarMuzgash(){
            Orco muzgash = new Orco("Muzgash", 100, 100);
            this.personajes.add(muzgash);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 20, 35);
            muzgash.armas.add(hachaDoble);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 15, 40);
            muzgash.armas.add(arcoYFlecha);
            Sting sting = new Sting("Sting", 10, 45);
            ((IEsMagico)sting).setEnergiaMagica(20);
            muzgash.armas.add(sting);

        }

        public void agregarUfthak(){
            Orco ufthak = new Orco("Ufthak", 100, 100);
            this.personajes.add(ufthak);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 20, 40);
            ufthak.armas.add(hachaDoble);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 25, 30);
            ufthak.armas.add(arcoYFlecha);
            Sting sting = new Sting("Sting", 10, 45);
            ((IEsMagico)sting).setEnergiaMagica(25);
            ufthak.armas.add(sting);
            
        }

        public void agregarSnaga(){
            Orco snaga = new Orco("Snaga", 100, 100);
            this.personajes.add(snaga);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 25, 35);
            snaga.armas.add(hachaDoble);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 25, 40);
            snaga.armas.add(arcoYFlecha);
            Sting sting = new Sting("Sting", 20, 45);
            ((IEsMagico)sting).setEnergiaMagica(20);
            snaga.armas.add(sting);

        
        }

        public void agregarGoblin(){
            Goblin goblin = new Goblin("Goblin", 100, 100);
            this.personajes.add(goblin);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 25, 30);
            goblin.armas.add(hachaDoble);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 15, 35);
            goblin.armas.add(arcoYFlecha);
            Sting sting = new Sting("Sting", 25, 40);
            ((IEsMagico)sting).setEnergiaMagica(25);
            goblin.armas.add(sting);
        }
        //////ENANO

        public void agregarThorin(){
            Enano thorin = new Enano("Thorin", 100, 100);
            this.personajes.add(thorin);
            Sting sting = new Sting("Sting", 20, 45);
            ((IEsMagico)sting).setEnergiaMagica(20);
            thorin.armas.add(sting);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 15, 35);
            thorin.armas.add(arcoYFlecha);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 20, 40);
            thorin.armas.add(hachaDoble);

        }

        public void agregarGimli(){
            Enano gimli = new Enano("Gimli", 100, 100);
            this.personajes.add(gimli);
            Anduril anduril = new Anduril("Anduril", 20, 45);
            ((IEsMagico)anduril).setEnergiaMagica(15);
            gimli.armas.add(anduril);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 10, 35);
            gimli.armas.add(arcoYFlecha);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 25, 40);
            gimli.armas.add(hachaDoble);

        }


        public void agregarDurin(){
            Enano durin = new Enano("Durin", 100, 100);
            this.personajes.add(durin);
            Sting sting = new Sting("Sting", 15, 45);
            ((IEsMagico)sting).setEnergiaMagica(15);
            durin.armas.add(sting);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 25, 35);
            durin.armas.add(arcoYFlecha);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 25, 40);
            durin.armas.add(hachaDoble);

        }
        
        //// Troll/////////////////////////////////////////////////////////////
        public void agregarOloghai(){
            Troll ologhai = new Troll("Ologhai", 100, 100);
            this.personajes.add(ologhai);
            Baculo baculo = new Baculo("Baculo", 25, 45);
            ((IEsMagico)baculo).setEnergiaMagica(10);
            ologhai.armas.add(baculo);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 15, 35);
            ologhai.armas.add(arcoYFlecha);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 20, 30);
            ologhai.armas.add(hachaDoble);

        }

        public void agregarTrollDePiedra(){
            Troll trollDePiedra = new Troll("TrollDePiedra", 100, 100);
            this.personajes.add(trollDePiedra);
            Baculo baculo = new Baculo("Baculo", 20, 30);
            ((IEsMagico)baculo).setEnergiaMagica(15);
            trollDePiedra.armas.add(baculo);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 25, 30);
            trollDePiedra.armas.add(arcoYFlecha);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 20, 35);
            trollDePiedra.armas.add(hachaDoble);
            
        }

        public void agregarTrollDeMontaña(){
            Troll trollDeMontaña = new Troll("TrollDeMontaña", 100, 100);
            this.personajes.add(trollDeMontaña);
            Baculo baculo = new Baculo("Baculo", 20, 25);
            ((IEsMagico)baculo).setEnergiaMagica(10);
            trollDeMontaña.armas.add(baculo);
            ArcoYFlecha arcoYFlecha = new ArcoYFlecha("ArcoYFlecha", 20, 35);
            trollDeMontaña.armas.add(arcoYFlecha);
            HachaDoble hachaDoble = new HachaDoble("HachaDoble", 25, 35);
            trollDeMontaña.armas.add(hachaDoble);
            
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////
public void elegirPersonaje(){
    System.out.println("Elija el personaje para comenzar la batalla");
    System.out.println("1: HUMANO");
    System.out.println("2: HOBBIT");
    System.out.println("3: ELFO");
    System.out.println("4: ORCO");
    System.out.println("5: TROLL");
    System.out.println("6: ENANO");

}
//////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
 public Personaje luchador(){
    int opcion;
    opcion = Teclado.nextInt();
    switch(opcion){
        case 1:
          personajefinal = resolvercaso1();
        break;

        case 2:
          personajefinal = resolvercaso2() ;
          
        break;

        case 3:
           personajefinal = resolvercaso3();
        break;

        case 4: 
           personajefinal = resolvercaso4();
        break;

        case 5: 
           personajefinal = resolvercaso5();
        break;

        case 6: 
           personajefinal = resolvercaso6();
        break;   
     }
    return personajefinal;
 }

//////////////////////////////////////////////////////////////////////////////////////////////////
public void caso1(){
    System.out.println("Ha elegido un Humanoide");
    System.out.println("Elija entre un Humano o un Wizard");
    System.out.println("1: Humano");
    System.out.println("2: Wizard");

    
}
////////////////////////////////////////////////////////////////////////////////////////////////////
public Personaje eleccionpersonajeHumano(){
    System.out.println("Elija un humano");
    System.out.println("1: Angbor");
    System.out.println("2: Dervorin");
    System.out.println("3: Hirluin");
    
    Personaje luchador = null;
    int op2;
    op2 = Teclado.nextInt();
    switch(op2){
           case 1: 

              System.out.println("Angbor: preparado para luchar");
              luchador = buscarPersonaje("Angbor");
              luchador.getArmas();
              System.out.println("Armas del luchador");

              for(int i = 0; i < luchador.getArmas().size(); i++){
                  
                  System.out.println("Opcion de arma: " +i+ ":" + luchador.getArmas().get(i).getNombre());
                 // System.out.println("Opcion de arma: " +i+ ":" + l;
              }
             
        
           break;

           case 2: 
              System.out.println("Dervorin: preparado para luchar");
              luchador = buscarPersonaje("Dervorin");
              luchador.getArmas();

              for(int i=0; i < luchador.getArmas().size(); i++){
                  System.out.println(luchador.getArmas().get(i).getNombre());
              }
           break;

           case 3: 
              System.out.println("Hirluin: preparado para luchar");
              luchador = buscarPersonaje("Hirluin");
              luchador.getArmas();

              for(int i=0; i < luchador.getArmas().size(); i++){
                System.out.println(luchador.getArmas().get(i).getNombre());

              }
           
           break;

           default:
              System.out.println("Opcion inválido");
           break;
           
        }
        return luchador;
    



}
////////////////////////////////////////////////////////////////////////////////////////////////
public Personaje resolvercaso1(){
caso1();
int op1;
Personaje perso = null;
op1 = Teclado.nextInt();
   switch(op1)
   {
 
   case 1:
      perso = eleccionpersonajeHumano();

     break;

    case 2:
      perso = casob();

     break; 
   }
   
   return perso;

}

////////////////////////////////////////////////////////////////////////////////////////////////
public Personaje casob(){
    System.out.println("Elija un Wizard");
                System.out.println("1: Radagast");
                System.out.println("2: Alatar");
                System.out.println("3: Pallando");

                Personaje luchador = null;

                int op3;
                op3 = Teclado.nextInt();
                
                switch (op3){
                    case 1: 
                       System.out.println("Radagast listo para luchar");
                       luchador = buscarPersonaje("Radagast");
                       luchador.getArmas();
                       System.out.println("Armas del luchador");
         
                       for(int i=0; i < luchador.getArmas().size(); i++){
                         System.out.println(luchador.getArmas().get(i).getNombre());
         
                       }
                       

                    break; 
                    
                    case 2:
                       System.out.println("Alatar listo para luchar");
                       luchador = buscarPersonaje("Alatar");
                       luchador.getArmas();
                       System.out.println("Armas del luchador");
         
                       for(int i=0; i < luchador.getArmas().size(); i++){
                         System.out.println(luchador.getArmas().get(i).getNombre());
         
                       }
                       
                    break;

                    case 3:
                       System.out.println("Pallando listo para luchar");
                       luchador = buscarPersonaje("Pallando");
                       luchador.getArmas();
                       System.out.println("Armas del luchador");
         
                       for(int i=0; i < luchador.getArmas().size(); i++){
                         System.out.println(luchador.getArmas().get(i).getNombre());
         
                       }
                       
                    break; 

                    default:
                       System.out.println("Opcion invalida");
                    break;
                } 
                return luchador;
       }   
////////////////////////////////////////////////////////////////////////////////////////////////////////
public Personaje resolvercaso2(){
    System.out.println("Ha elegido un hobbit, elija un luchador");
            System.out.println("1: Frodo");
            System.out.println("2: Tom");
            System.out.println("3: TedArenas");

            Personaje luchador = null;

            int op4;
            op4 = Teclado.nextInt();
            switch (op4){
                case 1: 
                    System.out.println("Frodo listo para luchar");
                    luchador = buscarPersonaje("Frodo");
                    luchador.getArmas();
                    System.out.println("Armas del luchador");
      
                    for(int i=0; i < luchador.getArmas().size(); i++){
                      System.out.println(luchador.getArmas().get(i).getNombre());
      
                    }
                    
                break;

                case 2:
                    System.out.println("Tom listo para luchar");
                    luchador = buscarPersonaje("Tom");
                    luchador.getArmas();
                    System.out.println("Armas del luchador");
      
                    for(int i=0; i < luchador.getArmas().size(); i++){
                      System.out.println(luchador.getArmas().get(i).getNombre());
      
                    }
                    
                break;

                case 3:
                    System.out.println("TedArenas listo para luchar");
                    luchador = buscarPersonaje("TedArenas");
                    luchador.getArmas();
                    System.out.println("Armas del luchador");
      
                    for(int i=0; i < luchador.getArmas().size(); i++){
                      System.out.println(luchador.getArmas().get(i).getNombre());
      
                    }
                    
                break;

                default: 
                    System.out.println("Opcion invalida");
                break;
            }
            return luchador;

}

///////////////////////////////////////////////////////////////////////////////////////////////
public Personaje resolvercaso3(){
    System.out.println("Ha elegido un Elfo, eliga su luchador");
           System.out.println("1: Legolas");
           System.out.println("2: Gildor");
           System.out.println("3: Galadriel");

           Personaje luchador= null;

           int op5;
           op5 = Teclado.nextInt();

           switch (op5){
               case 1: 
                  System.out.println("Legolas listo para luchar ");
                  luchador = buscarPersonaje("Legolas");
                  luchador.getArmas();
                  System.out.println("Armas del luchador");
    
                  for(int i=0; i < luchador.getArmas().size(); i++){
                    System.out.println(luchador.getArmas().get(i).getNombre());
    
                  }
                  
               break;

               case 2: 
                  System.out.println("Gildor listo para luchar");
                  luchador = buscarPersonaje("Gildor");
                  luchador.getArmas();
                  System.out.println("Armas del luchador");
    
                  for(int i=0; i < luchador.getArmas().size(); i++){
                    System.out.println(luchador.getArmas().get(i).getNombre());
    
                  }
                  
               break;

               case 3: 
                  System.out.println("Galadriel listo para luchar");
                  luchador = buscarPersonaje("Galadriel");
                  luchador.getArmas();
                  System.out.println("Armas del luchador");
    
                  for(int i=0; i < luchador.getArmas().size(); i++){
                    System.out.println(luchador.getArmas().get(i).getNombre());
    
                  }
                  
               break;

               default: 
                   System.out.println("Opcion invalida");
           }
           return luchador;
}

/////////////////////////////////////////////////////////////////////////////////////////////

       public Personaje resolvercaso4(){ 
       System.out.println("Ha elegido a un Orco, elija a su luchador");
       System.out.println("1: Muzgash");
       System.out.println("2: Ufthak");
       System.out.println("3: Snaga");
       System.out.println("4: Goblin");

       Personaje luchador = null;

       int op6;
       op6 = Teclado.nextInt();
       switch (op6){
           case 1: 
              System.out.println("Muzgash listo para luchar");
              luchador = buscarPersonaje("Muzgash");
              luchador.getArmas();
              System.out.println("Armas del luchador");

              for(int i=0; i < luchador.getArmas().size(); i++){
                System.out.println(luchador.getArmas().get(i).getNombre());

              }
              
           break; 

           case 2: 
              System.out.println("Ufthak listo para luchar");
              luchador = buscarPersonaje("Ufthak");
              luchador.getArmas();
              System.out.println("Armas del luchador");

              for(int i=0; i < luchador.getArmas().size(); i++){
                System.out.println(luchador.getArmas().get(i).getNombre());

              }
              
           break; 

           case 3: 
              System.out.println("Snaga listo para luchar");
              luchador = buscarPersonaje("Snaga");
              luchador.getArmas();
              System.out.println("Armas del luchador");

              for(int i=0; i < luchador.getArmas().size(); i++){
                System.out.println(luchador.getArmas().get(i).getNombre());

              }
              
           break;

           case 4: 
              System.out.println("Goblin listo para luchar");
              luchador = buscarPersonaje("Goblin");
              luchador.getArmas();
              System.out.println("Armas del luchador");

              for(int i=0; i < luchador.getArmas().size(); i++){
                System.out.println(luchador.getArmas().get(i).getNombre());

              }
              
           break; 

           default: 
               System.out.println("Opcion invalida");
           break;


       }
       return luchador;
    }
       //////////////////////////////////////////////////////

       public Personaje resolvercaso5(){
        System.out.println("Ha elegido a un Troll, elija a su luchador");
        System.out.println("1: Olog-hai");
        System.out.println("2: Troll de piedra");
        System.out.println("3: Troll de las montañas");
        
        Personaje luchador = null;
        int op7;
        op7 = Teclado.nextInt();
        switch (op7){
            case 1: 
               System.out.println("Olog-hai listo para luchar");
               
               luchador = buscarPersonaje("Ologhai");
               luchador.getArmas();
               System.out.println("Armas del luchador");
 
               for(int i=0; i < luchador.getArmas().size(); i++){
                 System.out.println(luchador.getArmas().get(i).getNombre());
 
               }
               
            break; 

            case 2: 
               System.out.println("Troll de piedra listo para luchar");
               luchador = buscarPersonaje("TrollDePiedra");
               luchador.getArmas();
               System.out.println("Armas del luchador");
 
               for(int i=0; i < luchador.getArmas().size(); i++){
                 System.out.println(luchador.getArmas().get(i).getNombre());
 
               }
               
            break; 

            case 3: 
               System.out.println("Troll de las montañas listo para luchar");
               luchador = buscarPersonaje("TrollDeMontaña");
               luchador.getArmas();
               System.out.println("Armas del luchador");
 
               for(int i=0; i < luchador.getArmas().size(); i++){
                 System.out.println(luchador.getArmas().get(i).getNombre());
 
               }
               
            break;

            default: 
               System.out.println("Opcion invalido");
            break; 

        }
        return luchador;
       }
/////////////////////////////////////////////////////////////////////////////////////////////
public Personaje resolvercaso6(){
    System.out.println("Ha elegido a un Enano, elija a su luchador");
        System.out.println("1: Thorin");
        System.out.println("2: Gimli");
        System.out.println("3: Durin");

        Personaje luchador = null;
        

        int op8;
        op8 = Teclado.nextInt();
        switch (op8){
            case 1: 
               System.out.println("Thorin listo para luchar");
               luchador = buscarPersonaje("Thorin");
               luchador.getArmas();
               System.out.println("Armas del luchador");
 
               for(int i=0; i < luchador.getArmas().size(); i++){
                 System.out.println(luchador.getArmas().get(i).getNombre());
 
               }
            break; 

            case 2: 
               System.out.println("Gimli de piedra listo para luchar");
               luchador = buscarPersonaje("Gimli");
               luchador.getArmas();
               System.out.println("Armas del luchador");
 
               for(int i=0; i < luchador.getArmas().size(); i++){
                 System.out.println(luchador.getArmas().get(i).getNombre());
 
               }
            break; 

            case 3: 
               System.out.println("Durin de las montañas listo para luchar");
               luchador = buscarPersonaje("Durin");
               luchador.getArmas();
               System.out.println("Armas del luchador");
 
               for(int i=0; i < luchador.getArmas().size(); i++){
                 System.out.println(luchador.getArmas().get(i).getNombre());
 
               }
            break;

            default: 
               System.out.println("Opcion invalido");
            break; 

        }
        return luchador;
        
}


       public List<Personaje> enviar(){
           List<Personaje> personajesenviar = personajes;
           return personajesenviar;

       }

       

       public double resolverSalud(Personaje player1, Personaje player2, int ar, double saludP2){
       int danioArma;
       danioArma = player1.getArmas().get(ar).getDanio();
       double fAtaque;
       fAtaque = ((ILlevaReliquia)player1).getReliquia().getFactorDeAtaque();
       
       double danioCausado = danioArma + (saludP2 * fAtaque);
    
       
       return danioCausado;
       }
       ///////////////////////////////////////////////

       public int resolverEMagica(Personaje player1, Personaje player2, int ar){
        
       int energiaPlayer1 = ((IHaceMagia)player1).getEnergiaMagica();
       int energiaArma = ((IEsMagico)player1.getArmas().get(ar)).getEnergiaMagica();
       energiaPlayer1 = energiaPlayer1 - energiaArma;
       if (player2 instanceof IHaceMagia){
           int energiaPlayer2 = ((IHaceMagia)player2).getEnergiaMagica();
           energiaPlayer2 = energiaPlayer2 - energiaArma;
           }
           return energiaPlayer1;
       }
       ////////////////////////////////////////////////////////////////////////////

        public int resolverStamina(Personaje player1, Personaje player2, int ar){
            int staminaPlayer2 = player2.getStamina(); 
            int staminaArma = player1.getArmas().get(ar).getStamina();

            staminaPlayer2 = staminaPlayer2 - staminaArma;
           
            return staminaPlayer2;
            
        }

      
        public double resolverSalud2(Personaje player1, Personaje player2, int ar, double saludP1){
        int danioArma;
        danioArma = player2.getArmas().get(ar).getDanio();
        double fAtaque;
        fAtaque = ((ILlevaReliquia)player2).getReliquia().getFactorDeAtaque();
        
        double danioCausado = danioArma + (saludP1 * fAtaque);
     
        
        return danioCausado;
        }

        public int resolverEMagica2(Personaje player1, Personaje player2, int ar){
        
            int energiaPlayer2 = ((IHaceMagia)player1).getEnergiaMagica();
            int energiaArma = ((IEsMagico)player2.getArmas().get(ar)).getEnergiaMagica();
            energiaPlayer2 = energiaPlayer2 - energiaArma;
            if (player1 instanceof IHaceMagia){
                int energiaPlayer1 = ((IHaceMagia)player2).getEnergiaMagica();
                energiaPlayer1 = energiaPlayer1 - energiaArma;
                }
            return energiaPlayer2;
            }


            public int resolverStamina2(Personaje player1, Personaje player2, int ar){
                int staminaPlayer1 = player2.getStamina(); 
                int staminaArma = player2.getArmas().get(ar).getStamina();
    
                staminaPlayer1 = staminaPlayer1 - staminaArma;
               
                return staminaPlayer1;
                
            }


       
       
      


        







        
        

















        




















    

      
}