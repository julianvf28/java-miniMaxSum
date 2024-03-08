/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.julianvalencia.minimaxsum;
import java.util.*;
/**
 *
 * @author usuario1
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        List<Integer> insumo = new ArrayList<>();
        //Collections.addAll(insumo, 1, 2, 3, 4, 5);
        Collections.addAll(insumo, 256741038, 623958417, 467905213, 714532089, 938071625);
        
        miniMaxSum(insumo);
    }
    
    public static void miniMaxSum( List<Integer> arr ){
        long SumMin = 0;
        long SumMax = 0;
        int max = arr.size();
        
        Collections.sort(arr);
        System.out.print(arr);

        for (int i=0 ; i<max; i++ ) {

            if( i>0 ){
                SumMax += arr.get(i);
            }
            
            if( i<(max-1) ){
                SumMin += arr.get(i);
            }
        }

        System.out.println(SumMin +" "+SumMax);
    }
}
