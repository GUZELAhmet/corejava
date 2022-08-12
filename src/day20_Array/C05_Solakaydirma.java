package day20_Array;

import java.util.Arrays;

public class C05_Solakaydirma {
    public static void main(String[] args) {
     int sayilr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,};
     int temp=sayilr[0];
     for (int i=0; i<sayilr.length-1; i++){
         sayilr[i]=sayilr[i+1];

     }
        sayilr[sayilr.length-1]=temp;
        System.out.println(Arrays.toString(sayilr));


    temp=sayilr[sayilr.length-1];
    for(int i=sayilr.length-1; i>0; i--){
        sayilr[i]=sayilr[i-1];


    }
    sayilr[0]=temp;
        System.out.println(Arrays.toString(sayilr));

    }
}
