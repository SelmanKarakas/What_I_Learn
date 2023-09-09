package com.cydeo.SpringCore_Abstraction.repository;

import com.cydeo.SpringCore_Abstraction.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
