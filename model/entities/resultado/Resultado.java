package model.entities.resultado;

public class Resultado {

    private String text;
    private int valorMinimo;
    private int valorMaximo;

    public Resultado(String text, int valorMinimo, int valorMaximo) {
        this.text = text;
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
    }

    public String getTexto() {
        return text;
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }
}
