package UserBook;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookProxy {

    @Before(value = "execution(* UserBook.Book.add(..))")
    public  void before(){
        System.out.println("before add excute");
    }

}
