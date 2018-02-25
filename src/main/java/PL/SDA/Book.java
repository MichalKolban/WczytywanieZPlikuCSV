package PL.SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Book {

    public static void main(String[] args) throws IOException{

        File file = new File("C:\\Users\\Michał\\IdeaProjects\\ksiazka\\src\\main\\resources\\books.csv");

        List<Booklist> books = new ArrayList<Booklist>();

        LineIterator fileContents = FileUtils.lineIterator(file, "UTF-8");

        fileContents.next();  //nie wczytuje piperwszej lini z pliku (id,cat,name,price,inStock,author_t,series_t,sequence_i,genre_s)

        while(fileContents.hasNext()){

            String[] line = fileContents.nextLine().split(",");

            books.add(new Booklist(line[2],Float.valueOf(line[3]),Boolean.valueOf(line[4]),line[5]));

        }
        for (Booklist booklist : books){

            System.out.println(booklist);
        }
    }
}
