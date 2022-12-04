package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.Comparator;

public class BookService {
    public List<Main> getBookinSort(){
        List<Main>books= new data().getBook();
        Collections.sort(books, new MyComparator());

        return books;
    }

    public static void main(String[] args) {
        BookService obj = new BookService();
        System.out.println(obj.getBookinSort());

    }

}
class MyComparator implements Comparator<Main> {

    @Override
    public int compare(Main o1, Main o2) {

        return o1.getName().compareTo(o2.getName());
    }
}