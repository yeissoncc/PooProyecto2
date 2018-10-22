package proyecto;

import java.util.Arrays;

public class MetodoMezcla {
	
		
		public static void MetodoMezcla(int arreglo[]){
			if(arreglo.length<=1) return;
				int mitad= arreglo.length/2;
				int Izquierda[]= Arrays.copyOfRange(arreglo, 0, mitad);
				int Derecha[]= Arrays.copyOfRange(arreglo, mitad, arreglo.length);
			MetodoMezcla(Izquierda);
			MetodoMezcla(Derecha);       
			CombinarArreglo(arreglo, Izquierda, Derecha);
			
 }
		
		
 
 public static void CombinarArreglo(int arreglo[], int Izquierda[],int Derecha[]){
         int i=0;
         int j=0;
         for(int k=0; k < arreglo.length;k++){
                 if(i >= Izquierda.length){
                	 arreglo[k]=Derecha[j];
                         j++;
                         continue;
                 }
                 if(j>=Derecha.length){
                	 arreglo[k] = Izquierda[i];
                         i++;
                         continue;
                 }
                 if(Izquierda[i]<Derecha[j]){
                	 arreglo[k]=Izquierda[i];
                         i++;
                 }else{
                	 arreglo[k]=Derecha[j];
                         j++;
                         
                 }
                
         }
         
 	}

}
