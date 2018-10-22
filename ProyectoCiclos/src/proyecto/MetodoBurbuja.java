package proyecto;

public class MetodoBurbuja {

	
	public void MetodoBurbuja(int arreglo[]) {
		
		
		
		
		int aux;
		boolean cambiar = false;
		
		
		while(true) {
			cambiar = false;
			
			
			for(int i = 1;i < arreglo.length;i++) {
				
				
				if(arreglo[i] < arreglo[i-1]) {
					
					aux = arreglo[i];
					
					arreglo[i] = arreglo [i-1];
					
					arreglo[i-1]= aux;
					
					cambiar = true;
					
				}
					
				
			}
			if (cambiar == false)
				break;
		}
		
	}
	
}
