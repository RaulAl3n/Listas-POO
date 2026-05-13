package Ex4;

public class Retangulo {
    private float largura;
    private float altura;

    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }
    public float getAltura() {
        return altura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea() {
        return this.largura * this.altura;
    }
    public float calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}
