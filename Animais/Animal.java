package Animais;
public abstract class  Animal {
    String cor;
    String comida;
    
    public Animal(){
        this.cor=cor;
        this.comida=comida;

    }
    public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
    }
    public String getComida() {
		return comida;
	}
    public abstract String fazerRuido();
    
   
	public void setComida(String comida) {
		this.comida = comida;
	}
    public String comer(){
       return "comendo "+comida+" ";
    }
}