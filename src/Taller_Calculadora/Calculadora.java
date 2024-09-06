package Taller_Calculadora;

//Clase principal
public class Calculadora {
    //Metodo main
    public static void main(String[] args) {

     // Se instancia el objeto "resultado" a la clase "Numeros"
     Numeros resultado = new Numeros();

        //Llama dentro del switch el objeto "resultado" -PUNTO- "operacion" propiedades del objeto dentro de la clase numeros
        switch (resultado.operacion){
            case 1:
                System.out.println(resultado.numeroA + " + " + resultado.numeroB + " = " + (resultado.numeroA+resultado.numeroB));
                break;
            case 2:
                System.out.println(resultado.numeroA + " - " + resultado.numeroB + " = " + (resultado.numeroA-resultado.numeroB));
                break;
            case 3:
                System.out.println(resultado.numeroA + " x " + resultado.numeroB + " = " + (resultado.numeroA*resultado.numeroB));
                break;
            case 4:
                System.out.println(resultado.numeroA + " / " + resultado.numeroB + " = " + (resultado.numeroA/resultado.numeroB));
                break;

        }
    }
}
