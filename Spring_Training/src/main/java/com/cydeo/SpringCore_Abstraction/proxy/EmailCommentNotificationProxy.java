package com.cydeo.SpringCore_Abstraction.proxy;

import com.cydeo.SpringCore_Abstraction.model.Comment;

public class EmailCommentNotificationProxy implements com.cydeo.SpringCore_Abstraction.proxy.CommentNotificationProxy {

    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending notification for comment:" + comment.getText());
    }
}
