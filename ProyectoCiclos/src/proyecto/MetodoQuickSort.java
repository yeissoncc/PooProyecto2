package proyecto;

public class MetodoQuickSort {
	
	
	public  void  MetodoQuickSort(int arreglo[]) {
		
		
		arreglo = MetodoQuickSort1(arreglo);
		
		
	}
	public int[] MetodoQuickSort1(int numeros[]) {
		
		
		return MetodoQuickSort2(numeros,0,numeros.length-1);
		
	}
	public int[] MetodoQuickSort2(int numeros[], int Izquierdo, int Derecho) {
		
		if(Izquierdo >= Derecho)
			
			return numeros;
		
		int i = Izquierdo, d = Derecho;
		
		if (Izquierdo != Derecho ) {
			
			int pivote;
			int aux;
			pivote = Izquierdo;
			while (Izquierdo != Derecho) { 
				
				while (numeros[Derecho] >= numeros[pivote] && Izquierdo < Derecho)
					Derecho --;
				while (numeros[Izquierdo] < numeros[pivote] && Izquierdo < Derecho)
					Izquierdo++;
				
				if(Derecho != Izquierdo) {
					
					aux = numeros[Derecho];
					numeros[Derecho] = numeros[Izquierdo];
					numeros[Izquierdo] = aux;
					}
				}
				if(Izquierdo == Derecho) {
					
					
					MetodoQuickSort2(numeros,i, Izquierdo);
					MetodoQuickSort2(numeros,Izquierdo+1,d);
				}	
					
			}else
				return numeros;
			
			return numeros;

	}
}
