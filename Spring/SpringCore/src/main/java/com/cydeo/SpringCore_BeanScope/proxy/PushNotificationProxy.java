package com.cydeo.SpringCore_BeanScope.proxy;


import com.cydeo.SpringCore_BeanScope.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class PushNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment:" + comment.getText());
    }
}
