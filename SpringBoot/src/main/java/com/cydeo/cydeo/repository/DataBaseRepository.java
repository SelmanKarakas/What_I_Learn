package com.cydeo.cydeo.repository;

import com.cydeo.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DataBaseRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:" + comment.getText());
    }
}
