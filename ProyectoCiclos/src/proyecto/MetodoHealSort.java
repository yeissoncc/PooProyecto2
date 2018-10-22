package proyecto;

public class MetodoHealSort {
	
	
	 public  void MetodoHealSort(int arreglo[]) {
		 
	        final int numeros = arreglo.length;
	        for(int nodo = numeros/2; nodo>=0; nodo--) 
	        	hacerMonticulo(arreglo, nodo, numeros-1);
	        for(int nodo = numeros-1; nodo>=0; nodo--) {
	            int tmp = arreglo[0];
	            arreglo[0]    = arreglo[nodo];
	            arreglo[nodo] = tmp;
	            hacerMonticulo(arreglo, 0, nodo-1);
	        }
	        
	        
	    }
	 
	    public  void hacerMonticulo(int arreglo[], int nodo, int fin) {
	        int izquierdo = 2*nodo+1;
	        int derecho = izquierdo +1;
	        int may;
	        if(izquierdo >fin) return;
	        if(derecho>fin) may=izquierdo ;
	        else may= arreglo[izquierdo ]>arreglo[derecho]?izquierdo :derecho;
	        if(arreglo[nodo] < arreglo[may]) {
	            int tmp = arreglo[nodo];
	            arreglo[nodo] = arreglo[may];
	            arreglo[may]  = tmp;
	            hacerMonticulo(arreglo, may, fin);
	        }
	        
	    }
	    
	
	

}
