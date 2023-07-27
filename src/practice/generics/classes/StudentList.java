package practice.generics.classes;

/*
---Generic Type---
Java 5 ile geldi
Farklı data type lerini aynı yapıda kullanabiliyoruz
Type Safety sağlar
CTE verir
 */

//  Task 1:Java dersi için öğrencileri, isim, vize notu ve final notu ile birlikte listeleyen bir program yazınız
//  Task 2.Kütüphane için öğrencileri isim, okul no ve mail adresi ile birlikte listeleyen bir program yazınız
public class StudentList {
    public static void main(String[] args) {

        System.out.println("******Java Dersi Vize ve Final notları******");
        listGrade();
        System.out.println();
        System.out.println("******Kütüphane Üye Listesi******");
        listLibraryMembers();

    }
    //Öğrencilerin notlarını listeleyen bir method
    public static void listGrade(){
        Students<String,Double,Double> std1 = new Students<>("Joe",75.8,90.0);
        Students<String,Double,Double> std2 = new Students<>("Jack",65.8,80.0);
        Students<String,Double,Double> std3 = new Students<>("Avarel",45.2,60.0);

        System.out.printf("%-11s || %.2f || %.2f \n",std1.getS(),std1.getE(),std1.getV());
        System.out.printf("%-11s || %.2f || %.2f \n",std2.getS(),std2.getE(),std2.getV());
        System.out.printf("%-11s || %.2f || %.2f \n",std3.getS(),std3.getE(),std3.getV());
    }

    //Kütüphane üye listesini yazdıran bir method
    public static void listLibraryMembers(){
        Students<String,Integer,String> mbr1 = new Students<>("William",500,"william@gmail.com");
        Students<String,Integer,String> mbr2 = new Students<>("Red Kit",400,"redkit@gmail.com");
        Students<String,Integer,String> mbr3 = new Students<>("Rin Tin Tin",300,"rintintin@gmail.com");

        System.out.printf("%-11s || %-4d || %-20s \n",mbr1.getS(),mbr1.getE(),mbr1.getV());
        System.out.printf("%-11s || %-4d || %-20s \n",mbr2.getS(),mbr2.getE(),mbr2.getV());
        System.out.printf("%-11s || %-4d || %-20s \n",mbr3.getS(),mbr3.getE(),mbr3.getV());
    }

}
