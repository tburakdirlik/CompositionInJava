
package random_shuffe_array;

import java.util.ArrayList;
import java.util.Random;
public class Random_Shuffe_Array {


    public static int randevennumber(int n){
        // random çift indis üretir
        Random rand = new Random();
        int evennumber = rand.nextInt(n);
        while(!(evennumber % 2==0)){
            evennumber = rand.nextInt(n);
        }
        return evennumber;
    }
    
    
    public static int randoddnumber(int n){
        // random tek indis üretir
        Random rand = new Random();
        int oddnumber = rand.nextInt(n);
        while((oddnumber % 2==0)){
            oddnumber = rand.nextInt(n);
        }
        return oddnumber;
    }
    
    
    public static int  randshuffle(int arr[], int n){
    int [] shuffled = new int [n];
    ArrayList list = new ArrayList ();
    
    
    for (int i=0;i< n; i++){
        int temporary = arr [i];
        
        if (i % 2 ==0){
            int x = randevennumber(n);
            while (list.contains(x)){
                x = randevennumber(n);
            }
            list.add(x);
            
            shuffled[x] = temporary;
        }
        
        if (i % 2== 1){
            int y = randoddnumber(n);
            while (list.contains(y)){
                y = randoddnumber(n);
            }
            list.add(y);
            shuffled [y] = temporary;
        }
    }
    
    //-----------------------------------------------------
    for (int i=0; i< n; i++){
        System.out.println(i+ "th element " +shuffled[i]);
    }
    //-----------------------------------------------------
    return 0;
    }
    
    public static void main(String[] args) {
        
    //random çift sayı üret
    //üretilen random sayıyı listeye ekle
    //eğer üretilen random çift sayı daha önce üretildiyse farklı olasıya kadar yeni random çift sayı üret
    // o anki çift indisteki sayıyı al random üretilen çift indisin yerine koy
    //bunların aynısını tek sayılar için de uygula 
        
        int [] arr = {0,1,2,3,4,5,6,7,8,9,10,11};    
        int n = arr.length;
        randshuffle(arr, n);
    }
}
