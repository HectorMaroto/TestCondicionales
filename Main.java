import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int respuesta;
		
		//Declaramos las variables sumaTotal como double, ya que si al final el usuario debe hacer los tres test, 
		//el programa hara una media de los resultados de los 3 test y puede dar un resultado decimal
		
		double sumaTotal1=0; 
		
		double sumaTotal2=0; 
		
		double sumaTotal3=0;   
		
		double media;
		
		int i=0;
		
		System.out.println("Empieza el test: ");
		
		do{ 
			
			if(i==1) {
				
				System.out.println("Usuario tu primera puntuacion es inferior al 80%, deberas hacer 2 veces mas el test. ");
				
				System.out.println("Segundo test: ");
				
			}
			
			if(i==2) {
				
				System.out.println("Tercer test: ");
				
			}
			
			System.out.println("Te gustan las computadoras. Si(1) no(0)");  //Empieza el test
			                                                                   
			respuesta=sc.nextInt();                                //Si la respuesta es distinta de 1 o 0 simplemente contara como fallo y no se sumará
			
			if(respuesta==1) {    //Si la respuesta es 1 se ira sumando en las variables sumaTotal
				
				if(i==0) {
					
					sumaTotal1+=respuesta;
					
				}
				
				if(i==1) {
					
					sumaTotal2+=respuesta;
		
				}
				
				if(i==2) {
					
					sumaTotal3+=respuesta;
					
				}
				
			}else if(respuesta==0) {                               //si la respuesta es cero el programa no sumara nada
				
				System.out.print("");  
			}
			
			System.out.println("Disfrutas con la resolucion de problemas. Si(1) No(0)");
			
			respuesta=sc.nextInt();
			
				if(respuesta==1) {  
					
					if(i==0) {
						
						sumaTotal1+=respuesta;
						
					}
					
					if(i==1) {
						
						sumaTotal2+=respuesta;
						
					}
					
					if(i==2) {
						
						sumaTotal3+=respuesta;
						
					}
					
				}else if(respuesta==0) {
					
					System.out.print("");
				}
	
				System.out.println("Quieres trabajar en equipo. Si(1) No(0)");
				
				respuesta=sc.nextInt();
				
				if(respuesta==1) {  
					
					if(i==0) {
						
						sumaTotal1+=respuesta;
						
					}
					
					if(i==1) {
						
						sumaTotal2+=respuesta;
					
					}
					
					if(i==2) {
						
						sumaTotal3+=respuesta;
						
					}
					
				}else if(respuesta==0) {
						
					System.out.print("");
				}
	
				System.out.println("Te agrada aprender por descubrimiento o prefieres que te indiquen las cosas paso a paso. Si(1) No(0)");
				
				respuesta=sc.nextInt();
				
				if(respuesta==1) {  
					
					if(i==0) {
						
						sumaTotal1+=respuesta;
						
					}
					
					if(i==1) {
						
						sumaTotal2+=respuesta;
					
					}
					
					if(i==2) {
						
						sumaTotal3+=respuesta;
						
					}
					
				}else if(respuesta==0) {
					
					System.out.print("");
				}
				
				System.out.println("Eres creativo. Si(1) No(0)");
				
				respuesta=sc.nextInt();
				
				if(respuesta==1) {  
					
					if(i==0) {
						
						sumaTotal1+=respuesta;
						
					}
					
					if(i==1) {
						
						sumaTotal2+=respuesta;
			
					}
					
					if(i==2) {
						
						sumaTotal3+=respuesta;
						
					}
					
				}else if(respuesta==0) {
					
					System.out.print("");
				}
				
				System.out.println("Eres resolutivo. Si(1) No(0)");
				
				respuesta=sc.nextInt();
				
				if(respuesta==1) {  
					
					if(i==0) {
						
						sumaTotal1+=respuesta;
						
					}
					
					if(i==1) {
						
						sumaTotal2+=respuesta;
					
					}
					
					if(i==2) {
						
						sumaTotal3+=respuesta;
						
					}
					
				}else if(respuesta==0) {
					
					System.out.print("");
				}
		
				System.out.println("Te rindes al primer intento Si(0) No(1)");
				
				respuesta=sc.nextInt();
				
				if(respuesta==1) {  
					
					if(i==0) {
						
						sumaTotal1+=respuesta;
						
					}
					
					if(i==1) {
						
						sumaTotal2+=respuesta;

					}
					
					if(i==2) {
						
						sumaTotal3+=respuesta;
						
					}
					
				}else if(respuesta==0) {
					
					System.out.print("");
				}
				
				System.out.println("Estas dispuesto a tener que actualizar tu conocimiento a lo largo de tu vida Si(1) No(0)");
				
				respuesta=sc.nextInt();
				
				if(respuesta==1) {  
					
					if(i==0) {
						
						sumaTotal1+=respuesta;
						
					}
					
					if(i==1) {
						
						sumaTotal2+=respuesta;
					
					}
					
					if(i==2) {
						
						sumaTotal3+=respuesta;
						
					}
					
				}else if(respuesta==0) {
					
					System.out.print("");
				}
				
				i++;
				
		}while(i<=2 && sumaTotal1<7);   // Para que el resultado supere el 80%, se debe obtener una puntuacion de 7 u 8, ya que el 80% de 8 es 6.4
		
		//En caso de que el usuario obtenga un resultado inferior al 80%, debera hacerlo dos veces mas y se hallara una media de las tres notas
		
		System.out.println("La puntuacion del primer test: "+sumaTotal1+"/8");
		
		if(sumaTotal1<7) {
		
			System.out.println("La puntuacion del segundo test es: "+sumaTotal2+"/8");
			
			System.out.println("La puntuacion del tercer test es: "+sumaTotal3+"/8");
		
		}
		
		media=(sumaTotal1+sumaTotal2+sumaTotal3)/3;  //Hallamos la puntuacion media de los tres test
		
		if(sumaTotal1==7 || sumaTotal1==8) {
			
			System.out.println("Enhorabuena, seras un gran programador"); //Si la puntuacion es supera el 80% se termina el programa y se felicita al usuario. No hacen falta mas test
			
		}
		
		if(sumaTotal1<7) {

				System.out.printf("La puntuacion media de de los tres test es: "+"%.2f ",+media);
				
				System.out.println(" ");
				
				// Si la media es inferior al 50% (4 en este caso) se imprimira un mensaje para que el usuario se lo comente a su profesor
				
				// Si es mayor, el programa terminara y se le dara la enhorabuena
				
				if(media<4) {  
					
					System.out.println("Por favor usuario habla con tu profesor, creo que no te gusta la programacion");
					
				}else {
					
					System.out.println("Enhorabuena!!!. El programa ha finalizado");
				}
				
		}	
			
	}

}


