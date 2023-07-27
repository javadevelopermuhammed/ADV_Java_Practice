package practice.generics.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GenericMethods {
    public static void main(String[] args) {
        String [] stdList = {"Rafael","Donatello","Leonardo","MichelAngelo"};
        Double [] pointList = {75.5,80.0,90.75,78.5};
        Character [] gradeList = {'A','C','D','B'};

        //1.Tüm listeleri yazdır
        printList(stdList);
        printList(pointList);
        printList(gradeList);
        //2.Öğrencileri isimlerine göre sıralayınız
        sortByInc(stdList);
        sortByInc(pointList);
        sortByInc(gradeList);
        //3.Öğrenci notlarını sıralayınız

        //4.Öğrenci harf notlarını sıralayınız

    }

        //Diziyi yazdıran bir method yazınız
    public static <T> void printList(T[] arr){
        for (T t:arr) {
            System.out.print(t+" ");
        }
        System.out.println();
    }
        // Diziyi artan sıralayan bir method yazınız
    public static <T> void sortByInc(T[] arr){
        Arrays.stream(arr).sorted().forEach(t-> System.out.print(t.toString()+" "));
        System.out.println();
    }

}
