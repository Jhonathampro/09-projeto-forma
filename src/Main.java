import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new cilindro(1, 1, 1,1 ));
        lista.add(new circulo(1, 1, 1));
        lista.add(new cilindro(2, 2, 2,2 ));

        for(Forma f : lista){
            System.out.println(f.getClass().getName());
            System.out.println(f);
            System.out.println("Área = " + f.calcularArea());

            if (f instanceof Volume){
                // aqui fiz uma conversão de forma (f) para cilindro
                // porque o calcular volume não está em forma,
                // está no cilindro
                System.out.println("Volume: " +  ((Volume) f).calcularVolume());
            }
            System.out.println("------------------------------------");

        }
    }


}