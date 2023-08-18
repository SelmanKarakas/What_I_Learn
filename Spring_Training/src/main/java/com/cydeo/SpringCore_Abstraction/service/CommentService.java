package com.cydeo.SpringCore_Abstraction.service;

import com.cydeo.SpringCore_Abstraction.model.Comment;
import com.cydeo.SpringCore_Abstraction.proxy.CommentNotificationProxy;
import com.cydeo.SpringCore_Abstraction.repository.CommentRepository;

public class CommentService {

    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment){

        //save in the DB
        commentRepository.storeComment(comment);

        //send email
        commentNotificationProxy.sentComment(comment);
    }

}
