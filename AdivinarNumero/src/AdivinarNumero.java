import java.util.Scanner;

public class AdivinarNumero {
	public static void main(String[] args) {
	      int intentos = 10;
	      int numSecreto = (int) (Math.random() *100 + 1);
	      int num_ingresado;
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.print("�Acierta el n�mero aleatorio! Introduzca un n�mero: ");
	      num_ingresado = sc.nextInt();
	      
	      while(num_ingresado > 100 || num_ingresado < 1) {
	    	  System.out.print("�El rango de n�meros es de 1 a 100! ");
	    	  num_ingresado = sc.nextInt();
	      }
	      
	      while(numSecreto != num_ingresado && intentos > 1) {
		      if(num_ingresado < numSecreto)
		      {
		    	  System.out.print("Muy bajo,");
		      }
		      else if(num_ingresado > numSecreto)
		      {
		    	  System.out.print("Muy alto,");
		      }
		      intentos--;
		      if(intentos > 1) {
		    	  System.out.print(" te quedan " + (intentos) + " intentos: ");
		      }
		      else {
		    	  System.out.print(" �ltimo intento... no te pongas nervioso: ");
		      }
		      num_ingresado = sc.nextInt();
		      while(num_ingresado > 100 || num_ingresado < 1) {
		    	  System.out.print("�El rango de n�meros es de 1 a 100! ");
		    	  num_ingresado = sc.nextInt();
		      }
	      }
	      if(numSecreto == num_ingresado) {
	    	  System.out.print("�Lo lograste! en" + (11-intentos) + " intentos.");
	      }
	      else {
	    	  System.out.print("El n�mero era " + numSecreto + ". No has acertado...");
	      }
	      sc.close();
	   }
}
