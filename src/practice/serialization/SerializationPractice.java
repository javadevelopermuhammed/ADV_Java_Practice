package practice.serialization;

import java.io.*;

// Task:Book tipinde nesneler üretip bu nesneleri
//books.txt dosyasına kaydedin ve sonra bu dosyadan
//nesneleri okuyun
public class SerializationPractice {
    public static void main(String[] args) {
        writeObjects();
        readObjects();

    }
    public static void writeObjects(){

        //Önce txt dosyasına kaydedilecek dosyaları oluştur
        Book book1 = new Book("Şeker Portakalı","Jose Mouro",1980);
        Book book2 = new Book("Dune","Frank Herbert",1965);
        Book book3 = new Book("Simyacı","Paulo Coelho",1988);

        try {
            FileOutputStream fos = new FileOutputStream("books.txt");
            ObjectOutputStream output = new ObjectOutputStream(fos);

            output.writeObject(book1);
            output.writeObject(book2);
            output.writeObject(book3);

            output.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readObjects(){

        try {
            FileInputStream fis = new FileInputStream("books.txt");

            ObjectInputStream input = new ObjectInputStream(fis);

            Book book1 = (Book)input.readObject();
            Book book2 = (Book)input.readObject();
            Book book3 = (Book)input.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

            input.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
