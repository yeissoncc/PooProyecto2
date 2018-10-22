package proyecto;


import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int numero,tamano,LimiteSuperior;
		long Tinicio, Tfin;
		double tiempo;
		
		System.out.println("ingrese el tamano del aleatorio: ");
		tamano = teclado.nextInt();
		System.out.println("ingrese el taman del limite superior: ");
		LimiteSuperior = teclado.nextInt();
		int arreglo[] = new int[tamano];
		for(int i = 0;i < tamano; i++) {
			
			numero = (int) (Math.random() * LimiteSuperior)+0;
			arreglo[i] = numero;
			System.out.println(arreglo[i]);
			
			
		}
		
        
        
        
		
        
        while (!salir) {
 
            System.out.println(" tamaño de lista creada");
            System.out.println("1. Metodo Borbuja ");
            System.out.println("2. metodo Insercion");
            System.out.println("3. metodo QuickSort");
            System.out.println("4. metodo HealSort");
            System.out.println("5. metodo Mezcla");
            System.out.println("6. metodo CountingSort ");
            System.out.println("7. metodo RadixSort");
            System.out.println("8. crear arreglo ramdon");
            System.out.println("0. Salir");
            
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();
 
                switch (opcion) {
                    case 1:
                    	
                        System.out.println("lista ordenada : Burbuja");
                        
                        
                		
                		MetodoBurbuja o = new MetodoBurbuja();
                		Tinicio = System.nanoTime();
                		o.MetodoBurbuja(arreglo);
                		Tfin = System.nanoTime();
                	    tiempo = (double)(Tfin - Tinicio) * 1.0e-9;
                		
                		for(int i = 0; i < arreglo.length;i++) {
                			
                			System.out.println(arreglo[i]);
                		}
                		System.out.println("el tiempo de respuesta es de : "+tiempo);
                		
                		
                        break;
                    case 2:
                    	
                    	
                        System.out.println("lista ordenada : Insercion");
                        
                        MetodoInsercion n = new  MetodoInsercion();
                         Tinicio = System.nanoTime();
                         n. MetodoInsercion(arreglo);
                         Tfin = System.nanoTime();
                	     tiempo = (double)(Tfin - Tinicio) * 1.0e-9;
                        
                        for(int i = 0; i < arreglo.length;i++) {
                        	System.out.println(arreglo[i]);
                        	
                        }
                        System.out.println("el tiempo de respuesta es de : "+tiempo);	
                			
                        

                        break;
                    case 3:
                        System.out.println("lista ordenada : Quicksort ");
                        MetodoQuickSort q = new  MetodoQuickSort();
                        Tinicio = System.nanoTime();
                        q.MetodoQuickSort(arreglo);
                        Tfin = System.nanoTime();
                        tiempo = (double)(Tfin - Tinicio) * 1.0e-9;

                        for(int i = 0; i < arreglo.length;i++) {
                        	System.out.println(arreglo[i]);
                        	
                        }
                        System.out.println("el tiempo de respuesta es de : "+tiempo);
                
                        break;
                    case 4:
                    	
                    	System.out.println("lista ordenada : Healsort");
                    	
                    	MetodoHealSort h = new  MetodoHealSort();
                    	Tinicio = System.nanoTime();
                        h.MetodoHealSort(arreglo);
                        Tfin = System.nanoTime();
                        tiempo = (double)(Tfin - Tinicio) * 1.0e-9;

                        for(int i = 0; i < arreglo.length;i++) {
                        	System.out.println(arreglo[i]);
                        	
                        }
                        System.out.println("el tiempo de respuesta es de : "+tiempo);
     
                        break;
                    case 5:
                    	
                    	System.out.println("lista ordenada : Mezcla");
                    	MetodoMezcla m = new  MetodoMezcla();
                    	Tinicio = System.nanoTime();
                        m.MetodoMezcla(arreglo);
                        Tfin = System.nanoTime();
                        tiempo = (double)(Tfin - Tinicio) * 1.0e-9;
                        for(int i = 0; i < arreglo.length;i++) {
                        	System.out.println(arreglo[i]);
                        
                        	
                        }
                        System.out.println("el tiempo de respuesta es de : "+tiempo);
                    	
                    	break;
                    	
                    case 6:
                    	
                    	
                    	System.out.println("lista ordenada : CountingSort");
                    	MetodoCountingSort c = new  MetodoCountingSort();
                    	Tinicio = System.nanoTime();
                        c.MetodoCountingSort(arreglo);
                        Tfin = System.nanoTime();
                        tiempo = (double)(Tfin - Tinicio) * 1.0e-9;
                        for(int i = 0; i < arreglo.length;i++) {
                        	System.out.println(arreglo[i]);
                        	
                        }
                        System.out.println("el tiempo de respuesta es de : "+tiempo);
                    	break;
                    case 7:
                    	
                    	System.out.println("lista ordenada : RadixSort");
                    	MetodoRadixSort r = new  MetodoRadixSort();
                    	Tinicio = System.nanoTime();
                        r.MetodoRadixSort(arreglo);
                        Tfin = System.nanoTime();
                        tiempo = (double)(Tfin - Tinicio) * 1.0e-9;
                        for(int i = 0; i < arreglo.length;i++) {
                        	System.out.println(arreglo[i]);
                        	
                        }
                        System.out.println("el tiempo de respuesta es de : "+tiempo);
                    	
                    	break;
                    case 8:
                    	System.out.println("ingrese el tamano del aleatorio: ");
                		tamano = teclado.nextInt();
                		System.out.println("ingrese el taman del limite superior: ");
                		LimiteSuperior = teclado.nextInt();
                		arreglo = new int[tamano];
                		for(int i = 0;i < tamano; i++) {
                			
                			numero = (int) (Math.random() * LimiteSuperior)+0;
                			arreglo[i] = numero;
                			System.out.println(arreglo[i]);
                			
                			
                		}
                    	
                    	
                    	break;
                    case 0:
                        salir = true;
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Solo números entre 0 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                teclado.next();
            }
        }

	}
}
