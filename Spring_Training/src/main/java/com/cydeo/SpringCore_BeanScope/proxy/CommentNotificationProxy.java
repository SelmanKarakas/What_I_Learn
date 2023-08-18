package com.cydeo.SpringCore_BeanScope.proxy;

import com.cydeo.SpringCore_BeanScope.model.Comment;


public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
