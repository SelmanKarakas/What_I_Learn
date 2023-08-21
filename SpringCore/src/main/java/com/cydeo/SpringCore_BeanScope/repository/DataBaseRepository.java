package com.cydeo.SpringCore_BeanScope.repository;


import com.cydeo.SpringCore_BeanScope.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DataBaseRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:" + comment.getText());
    }
}
