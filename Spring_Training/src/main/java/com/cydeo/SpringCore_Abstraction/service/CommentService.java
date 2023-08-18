package com.cydeo.SpringCore_Abstraction.service;

import com.cydeo.SpringCore_Abstraction.model.Comment;
import com.cydeo.SpringCore_Abstraction.proxy.CommentNotificationProxy;
import com.cydeo.SpringCore_Abstraction.repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){

        //save in the DataBase
        commentRepository.storeComment(comment);

        //send email
        commentNotificationProxy.sentComment(comment);
    }

}
