import java.util.Scanner;
 
public class menu {
 
     
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       int opcion;
       String numero;
       int opcion2;
       int diagonal;
            
           System.out.println("1. Escribe 1 si quieres calcular el cuadrado");
           System.out.println("2. Escribe 2 si quieres calcular el circulo");
            
           System.out.println("Escribe una de las opciones");
           opcion = scan.nextInt();
           
           if (opcion==1) {
        	   System.out.println("Cuanto mide el lado de tu cuadrado?");
        	   Scanner scan_1 = new Scanner(System.in);
        	   numero= scan_1.nextLine();
        	   String res = numero;
   			   int medida = Integer.parseInt(res);
   			   cuadrado c = new cuadrado(medida);
   			   System.out.println("La longitud del lado es " + c.numero);
        		   System.out.println("1. Escribe 1 si quieres calcular la diagonal");
        		   System.out.println("2. Escribe 2 si quieres calcular el perimetro");
        		   System.out.println("3. Escribe 3 si quieres calcular el area");
        		   opcion2= scan.nextInt();
        		   if (opcion2==1) {
        			 System.out.println(c.diagonal());
        		   }
        		   if (opcion2==2) {
        			   System.out.println(c.perimetro());
        		   }
        		   if (opcion2==3) {
        			   System.out.println(c.area());
        		   }
        			   
        	   } 
           else if(opcion==2) {
        	   System.out.println("Cuanto mide el radio?");
        	   Scanner scan_1 = new Scanner(System.in);
        	   numero= scan_1.nextLine();
        	   String res = numero;
   			   int medida = Integer.parseInt(res);
   			   Circulo cir = new Circulo(medida);
   			   System.out.println("La longitud del radio es " + cir.id);
        		   System.out.println("1. Escribe 1 si quieres calcular la circunferencia");
        		   System.out.println("2. Escribe 2 si quieres calcular el area");
        		   opcion2= scan.nextInt();

        		   if (opcion2==1) {
        			   System.out.println(cir.circunferencia());
        		   }
        		   if (opcion2==2) {
        			   System.out.println(cir.area());
        		   }        	   
           }
           }
}


           
            
       
     