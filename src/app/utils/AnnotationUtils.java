package app.utils;

import app.interfaces.Author;
import app.interfaces.MethodInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class AnnotationUtils {
    public static void getAnnot(AnnotatedElement element) throws NoSuchMethodException {
        Annotation[] annotations = element.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof MethodInfo info) {
                System.out.println("Method name: " + info.methodName());
                System.out.println("Return type: " + info.returnType());
                System.out.println("Description: " + info.description());

            }
            if (annotation instanceof Author author) {
                System.out.println("Author: " + author.name() + " " + author.secondName());
            }
        }
    }
}
