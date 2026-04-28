
import java.io.*;
import java.util.*;
import java.math.*;

public class ejercicioJ{
    static Scanner sc;
    static List<Integer> lista = new ArrayList<>();

    public static boolean solucion(List<Integer> pila){
        int n;
        if(!sc.hasNext()){
            int numSublistas = pila.size()/4;
            if (pila.size()%4!=0) numSublistas = numSublistas+1;
            List<Integer> lista = new ArrayList<>(pila.size());
            List<Integer> sublista = new ArrayList<>(4);
            List<Integer> sublistaPares = new ArrayList<>(4);
            List<Integer> sublistaImpares = new ArrayList<>(4);
            for(int i=0; i<numSublistas;i++){
                if (i != numSublistas-1){
                    sublista = pila.subList(4*i, 4*(i+1));
                    System.out.print(sublista);
                } else {
                    int num = lista.size()%4;
                    for(int j = 0; j<num; j++){
                        sublista.add(lista.get(i*4+j));
                        System.out.print(sublista);
                    }
                }
                for(int j=0; j<sublista.size(); j++){
                    if(sublista.get(j)%2==0){
                        sublistaPares.add(sublista.get(j));
                    } else {
                        sublistaImpares.add(sublista.get(j));
                    }
                }
                for (Integer numerito: sublistaPares) {
                    lista.add(numerito);
                }
                for (Integer numerito: sublistaImpares) {
                    lista.add(numerito);
                }
            }
            if (lista.isEmpty()){
                System.out.print("NOPROCESO");
            } else {
                Integer ultimo = lista.removeLast();
                for(Integer numerito: lista){
                    System.out.print(numerito + " ");
                }
                System.out.print(ultimo);
            }
            return false;
        } else {
            n = sc.nextInt();
            if (n>=0) {
                pila.add(n);
            } else {
                for(int i=0; i<Math.abs(n); i++){
                    pila.removeLast();
                }
            }
            return true;
        }
    }
    
    public static void main(String [] args)throws FileNotFoundException{
        sc=new Scanner(System.in);
        
        while(solucion(lista));

        sc.close();

    }
}
