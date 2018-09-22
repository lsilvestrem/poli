
package poo;


public class rectangulo extends figura{
    protected int esquinas;

    public rectangulo(int esquinas, String TipoFigura, String color) {
        super(TipoFigura, color);
        this.esquinas = esquinas;
    }

    public int getEsquinas() {
        return esquinas;
    }
    @Override
    public String MostrarDatos(){
        return "Tipo de Figura: "+TipoFigura+"\nSu color es: "+color+"\nSus Esquinas son: "+ esquinas;
    }
}