package proyecto;

public class MetodoInsercion {
	
	
	public void MetodoInsercion(int arreglo[]) {
		
		
		
		int aux;
		int cont1, cont2;
		
		for(cont1 = 1; cont1 < arreglo.length; cont1++) {
			
			
			aux = arreglo[cont1];
			 cont2 = cont1-1;
			 while ((cont2 >= 0) && (aux < arreglo[cont2])) {
				 
				 arreglo[cont2+1] = arreglo[cont2];
				 cont2 --;
				 
			 }
			 arreglo[cont2 + 1] = aux;
			 
			 
		}
		
	}
	
}
