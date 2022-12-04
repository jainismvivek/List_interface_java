package org.example;

import java.util.ArrayList;
import java.util.List;

public class data {

    public List<Main> getBook(){
        List<Main>books =new ArrayList<>();
        books.add(new Main(101,"core java",300));
        books.add(new Main(102,"Algebra",600));
        books.add(new Main(103,"Mathmetics",400));
        books.add(new Main(104,"DBMS",800));
        books.add(new Main(105,"python",200));
        return books;


    }

}
