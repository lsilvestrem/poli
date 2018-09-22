
package poo;
public class rectanguloredondo extends rectangulo{
    private String FormaEsquinas;

    public rectanguloredondo(String FormaEsquinas, int esquinas, String TipoFigura, String color) {
        super(esquinas, TipoFigura, color);
        this.FormaEsquinas = FormaEsquinas;
    }

    public String getFormaEsquinas() {
        return FormaEsquinas;
    }
    @Override
    public String MostrarDatos(){
        return "Tipo de Figura: "+ TipoFigura + "\nColor de la Figura: "+color+
                "\nSus esquinas son: "+esquinas+"\nsus esquinas son: "+ FormaEsquinas;
    }
}

