package proyecto;

public class MetodoCountingSort {
	
	
	static void MetodoCountingSort(int arreglo[]){
		
		
		final int numeros = arreglo.length;
	    final int[] temporal = new int[numeros];
	    for (int i = 0; i < numeros; i++) {
	        int count = 0;
	        for (int j = 0; j < numeros; j++) {
	            if (arreglo[j] < arreglo[i]) {
	                count++;
	            } else if (arreglo[i] == arreglo[j] && j < i) {
	                count++;
	            }
	        }
	        temporal[count] = arreglo[i];
	    }
	    System.arraycopy(temporal, 0, arreglo, 0, numeros);
	    
	    
	}
	
	
}