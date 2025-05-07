public abstract class Forma {
    private int cordx;
    private int cordy;
    private double raio;

    public Forma(int cordx, int cordy, double raio) {
        this.cordx = cordx;
        this.cordy = cordy;
        this.raio = raio;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        String aux = "";
        aux += "Cordenada x: " + cordx + "\n";
        aux += "Cordenada y: " + cordy + "\n";
        aux += "Raio : " + raio + "\n";
        return aux;
    }

    public int getCordx() {
        return cordx;
    }

    public void setCordx(int cordx) {
        this.cordx = cordx;
    }

    public int getCordy() {
        return cordy;
    }

    public void setCordy(int cordy) {
        this.cordy = cordy;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }



}
