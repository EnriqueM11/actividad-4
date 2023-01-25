package actividad3;

import java.util.Scanner;

public class menu {

		public int medida; 
		public String res;
	public static void main(String[] args) {
		
		String op1 = "1";
		String op2 = "2";
		
		System.out.println("Para calcular cuadrado escriba: 1");
		System.out.println("Para calcular circulo escriba: 2");
		Scanner scan = new Scanner(System.in);
		String inline = scan.nextLine();
		
		if (op1.contains(inline)) {
			
			System.out.println("Ingrese la medida del lado");
			Scanner scan_1 = new Scanner(System.in);
			String numero = scan.nextLine();
			
			
			String valor = numero;
			int medida = Integer.parseInt(valor);
			
			cuadrado c = new cuadrado(medida);
			
			System.out.println("La longitud del lado es " + c.numero);
			System.out.println("");
			
			System.out.println("Para calcular diagonal escriba: 1");
			System.out.println("Para calcular perimetro escriba: 2");
			System.out.println("Para calcular area escriba: 3");
			
			String diagonal = "1";
			String perimetro = "2";
			String area = "3";
			
			Scanner scan_2 = new Scanner(System.in);
			String valor_1 = scan.nextLine();
			
			if (diagonal.contains(valor_1)) {
			
			System.out.println("La longitud de la diagonal es " + c.diagonal());
			
			} else { if(perimetro.contains(valor_1)) {
				
				System.out.println("El perimetro es " + c.perimetro());
				
			} else { if(area.contains(valor_1)) {
				
				System.out.println("El area del cuadrado es " + c.area());
			
				}
			}	
		}
			
	} else {
			
			if(op2.contains(inline)) {
			
			System.out.println("Ingrese la medida del radio");
			Scanner scan_3 = new Scanner(System.in);
			String numero_1 = scan.nextLine();
			
			
			String valor_3 = numero_1;
			int medida_1 = Integer.parseInt(valor_3);
			
			Circulo circulo_1 = new Circulo(medida_1);
			
			System.out.println("La longitud del radio es " + circulo_1.id);
			System.out.println("");
			
			System.out.println("Para calcular circunferencia escriba: 1");
			System.out.println("Para calcular area escriba: 2");
			
			String circunferencia = "1";
			String area = "2";
			
			Scanner scan_circulo2 = new Scanner(System.in);
			String circulo_line_1 = scan.nextLine();
			
			if (circunferencia.contains(circulo_line_1)) {
			
			System.out.println("La circunferencia del circulo es " + circulo_1.circunferencia());
			
			} else { if(area.contains(circulo_line_1)) {
				
				System.out.println("El area del circulo es " + circulo_1.area());
				
				} 
			}	
		}

			}
		}	
	}