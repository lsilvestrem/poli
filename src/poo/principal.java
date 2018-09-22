
package poo;
public class principal {


    public static void main(String[] args) {
        figura misFiguras [] = new figura [5];
        
        misFiguras[0] = new figura("Figuras Planas","Colores Primarios");
        misFiguras[1] = new circulo(2.5f,"CIRCULO","AZUL");//polimorfismo porque se instancea con un hijo de FIGURA 
        misFiguras[2] = new rectangulo(4,"RECTANGULO","AMARILLO");//poliformismo
        misFiguras[3] = new triangulo(3,"TRIANGULO","ROJO");//poliformismo
        misFiguras[4] = new rectanguloredondo("Redondeadas",4,"RECTANGULO REDONDO","AMARILLO");//poliformismo
       
        for (figura Figuras: misFiguras){
            System.out.println(Figuras.MostrarDatos());
            System.out.println("");
        }
    }
    
}

