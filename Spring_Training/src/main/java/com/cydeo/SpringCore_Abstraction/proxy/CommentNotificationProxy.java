package com.cydeo.SpringCore_Abstraction.proxy;

import com.cydeo.SpringCore_Abstraction.model.Comment;

public interface CommentNotificationProxy {
    void sentComment(Comment comment);
}
