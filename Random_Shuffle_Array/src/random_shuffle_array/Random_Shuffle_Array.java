
package random_shuffle_array;
/*
                    PROBLEM 
VERİLEN BİR DİZİNİN ELEMANLARINI RASTGELE KARIŞTIR.
TEK İNDİSLİ ELEMANLAR TEK İNDİSLERDE ÇİFT İNDİSLİ ELEMANLAR ÇİFT İNDİSLERDE KARIŞMIŞ OLMALI

                    ÇÖZÜM

RANDOM ÇİFT SAYI ÜRET 
ÜRETİLEN RANDOM SAYIYI LİSTEYE EKLE
EĞER ÜRETİLEN RANDOM ÇİFT SAYI DAHA ÖNCE ÜRETİLDİYSE FARKLI OLUNCAYA KADAR YENİ ÇİFT SAYI ÜRET
O ANKİ ORJİNAL DİZİDEKİ ÇİFT İNDİSTEKİ SAYIYI AL YENİ DİZİDE, RANDOM ÜRETİLEN ÇİFT İNDİSİN YERİNE KOY
BUNLARIN AYNISINI TEK SAYILAR İÇİN DE UYGULA 

*/

/**
 *
 * @author tunahan burak dirlik
 */
import java.util.ArrayList;
import java.util.Random;
public class Random_Shuffle_Array {


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
    
    
    public static int []  randshuffle(int arr[], int n){
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

    return shuffled;
    }
    
    
    public static boolean verify (int shuffled[]){
        System.out.println();
        boolean flag = true;
        for (int i =0; i< shuffled.length; i++){
        
         int x = shuffled[i];
            if (i %2 == 0){
                if (! (x %2 == 0)){
                    System.out.println(i + " CAN NOT PASSED");
                    flag = false;
                }
            }
            if (i %2 == 1){
                if (!(x %2 == 1)){
                    System.out.println(i + "CAN NOT PASSED");
                flag = false;
                }
            }
        }
        
        if (flag == false ){
            System.out.println("Shuffling failed");
        }
        if (flag == true ){
            System.out.println("Shuffling successfull");
        }
        
        return flag;
    }
    
  
    public static void main(String[] args) {
        
        int [] arr = {0,1,2,3,4,5,6,7,8,9,18};    
        int n = arr.length;
        int shuffled [] = randshuffle(arr, n);
        verify(shuffled);
        
    }
}