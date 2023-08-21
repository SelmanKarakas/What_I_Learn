package com.cydeo.cydeo.proxy;

import com.cydeo.cydeo.model.Comment;


public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
