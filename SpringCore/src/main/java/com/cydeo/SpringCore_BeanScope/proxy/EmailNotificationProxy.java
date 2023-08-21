package com.cydeo.SpringCore_BeanScope.proxy;

import com.cydeo.SpringCore_BeanScope.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("EMAIL")
public class EmailNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment:" + comment.getText());
    }
}
