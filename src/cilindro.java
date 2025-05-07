public class cilindro extends Forma implements Volume {

    private double altura;

    public cilindro(int cordx, int cordy, double raio, double altura) {
        super(cordx, cordy, raio);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Altura " + altura + "\n";
        return aux;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return 2;
    }
}
