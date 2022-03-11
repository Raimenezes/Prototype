public class Carro implements Cloneable {
    private Fabricante fabricante;
    private String modelo;
    private int ano;

    public Carro(Fabricante fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public Carro clone() throws CloneNotSupportedException {
        Carro carroClone = (Carro) super.clone();
        carroClone.fabricante = (Fabricante) carroClone.fabricante.clone();
        return carroClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante=" + fabricante +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano ;
    }
}
