package com.cydeo.cydeo.repository;


import com.cydeo.cydeo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
