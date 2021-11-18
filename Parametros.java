/**
 *clase que diferencia los parametros 
 *por valor y por referencia
 *@author Horacio Mares
 *version 1.0
 */
public class Parametros{
    /**
     *metodo main de la la clase parametros
     *@param args
     */
    public static void main(String[] args){
	//iniciamos con la declaracion del "valor"
	int valor = 20;
	//arregolo de la posicion del parametro
	int[] x = new int[2];
	for (int i=0; i < x.length; i++){
	    x[i]= i;
	}
	//decimos en que lugar (en mi caso 1) va a estar el valor
	x[1]= 20;
	//imprimimos por parametro de calor
	System.out.println("parametro por valor: " + valor);
	//imprimimos por parametros de referencia
	System.out.println("parametro por referencia: " + x[x.length - 1]);

	//para alterar el metodo main solo debemos multiplicar, sumar, restar o algo por el estilo
	valor = valor * 30;
	System.out.println("el valor alterando el main: " + valor);
    }
}
