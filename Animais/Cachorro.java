package Animais;

public  class Cachorro extends Canideo {

    String ruido;
   
    public Cachorro  (){
        super();
        this.ruido="latido";
    }
    
    public String fazerRuido(){
        return ruido;
    }
  //  public String andarMuito(){
   //     return "Vagando por aí";
  //  }
}
