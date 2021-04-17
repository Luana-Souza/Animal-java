package Animais;

public class main {
    public static void main(String[] args) {
        Animal a = new Gato();
        a.setComida("filé");
        System.out.println(a.getClass().getName());
        System.out.println(a.fazerRuido());
        System.out.println(a.comer());
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Felideo);
        System.out.println(a instanceof Canideo);
        System.out.println(a instanceof Gato);
        System.out.println(a instanceof Lobo);
    }
}
