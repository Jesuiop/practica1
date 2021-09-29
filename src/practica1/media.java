package practica1;

public class media {
	public static void main(String[] args) {

int numero1 = (int) (Math.random()*10);
int numero2 = (int) (Math.random()*10);
int numero3 = (int) (Math.random()*10);
int resultado;
 resultado= (numero1 + numero2 + numero3)/3;
System.out.println("Los numeros son "  + numero1 + " " + numero2 + " " + numero3 + " Y su media es " + resultado);
}
	
}
