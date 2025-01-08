package app.interfaces;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Author {
    String name() default "Viacheslav";
    String secondName() default "Esipov";
}
