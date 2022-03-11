public class Fabricante implements Cloneable {
    private String marca;
    private String pais;

    public Fabricante(String marca, String pais){
        super();
        this.marca = marca;
        this.pais = pais;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Fabricante{" +
                "marca='" + marca + '\'' +
                ", pais='" + pais +"'" +
                '}';
    }
}
