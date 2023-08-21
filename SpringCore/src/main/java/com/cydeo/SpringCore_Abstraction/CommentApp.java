package com.cydeo.SpringCore_Abstraction;

import com.cydeo.SpringCore_Abstraction.config.CommentConfig;
import com.cydeo.SpringCore_Abstraction.model.Comment;
import com.cydeo.SpringCore_Abstraction.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Selman");
        comment.setText("1017");

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
