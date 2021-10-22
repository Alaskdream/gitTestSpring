package UserBook;

import org.springframework.stereotype.Component;

@Component
public class Book {
    public void add(String name){
        System.out.println("add a book");
    }
}
