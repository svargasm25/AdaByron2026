package H;
import java.io.*;
import java.util.*;
import java.math.*;

public class ejercicioH{
    static Scanner sc;
    static int num;
    static int numCasos;
    static int capMax;
    static String flujo;

    public static void solucion(int capMax, String flujo){
        //operaciones
        int aforo=0;
        int i=0;
        while(capMax>=aforo && aforo>=0 && i<flujo.length()){
            if(flujo.charAt(i)=='E'){
                aforo++;
            }else{
                aforo--;
            }
            i++;
        }
        if (aforo==0){
            System.out.println("VALIDO");
        }else{
            System.out.println("INVALIDO");
        }
    }
    
    public static void main(String [] args)throws FileNotFoundException{
        sc=new Scanner(System.in);
        numCasos=sc.nextInt();

       for(int i=0; i<numCasos; i++){
            capMax=sc.nextInt();
            flujo=sc.next();
            solucion(capMax, flujo);
       }

        sc.close();
    }
}