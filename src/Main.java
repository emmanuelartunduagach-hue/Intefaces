//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Figura f1 = new Figura.Cuadrado(4);

            Figura f2 = new Circulo(3);

            System.out.println("Área cuadrado: " + f1.calcularArea());
            System.out.println("Área círculo: " + f2.calcularArea());

    }
}