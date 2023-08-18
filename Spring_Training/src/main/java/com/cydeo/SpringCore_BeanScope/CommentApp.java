package com.cydeo.SpringCore_BeanScope;


import com.cydeo.SpringCore_BeanScope.config.CommentConfig;
import com.cydeo.SpringCore_BeanScope.model.Comment;
import com.cydeo.SpringCore_BeanScope.service.CommentService1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {

        Comment comment  = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");


        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);


        CommentService1 cs1 = context.getBean(CommentService1.class);
        CommentService1 cs2 = context.getBean(CommentService1.class);

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1==cs2);
















    }
}
