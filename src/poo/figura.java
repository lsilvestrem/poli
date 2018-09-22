
package poo;

public class figura {
    protected String TipoFigura;
    protected String color;

    public figura(String TipoFigura, String color) {
        this.TipoFigura = TipoFigura;
        this.color = color;
    }

    public String getTipoFigura() {
        return TipoFigura;
    }

    public String getColor() {
        return color;
    }
    public String MostrarDatos(){
        return "Tipo de Figura: "+ TipoFigura + "\nColores de mis Figuras: "+color;
    }
}


