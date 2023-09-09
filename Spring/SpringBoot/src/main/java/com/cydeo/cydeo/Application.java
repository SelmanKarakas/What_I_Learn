package com.cydeo.cydeo;

import com.cydeo.cydeo.model.Comment;
import com.cydeo.cydeo.service.CommentService1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Selman");
        comment.setText("1017");


        ApplicationContext container = SpringApplication.run(Application.class, args);

        CommentService1 commentService1 = container.getBean(CommentService1.class);
        commentService1.publishComment(comment);

        commentService1.printConfigData();
        commentService1.printDbConfigData();
    }

}
