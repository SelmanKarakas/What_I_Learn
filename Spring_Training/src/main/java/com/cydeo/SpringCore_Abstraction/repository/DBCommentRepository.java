package com.cydeo.SpringCore_Abstraction.repository;

import com.cydeo.SpringCore_Abstraction.model.Comment;

public class DBCommentRepository implements com.cydeo.SpringCore_Abstraction.repository.CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:" + comment.getText());
    }
}
