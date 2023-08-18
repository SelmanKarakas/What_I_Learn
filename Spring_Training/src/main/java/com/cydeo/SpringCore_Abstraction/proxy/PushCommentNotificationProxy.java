package com.cydeo.SpringCore_Abstraction.proxy;

import com.cydeo.SpringCore_Abstraction.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class PushCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending push notification for comment... " + comment.getText());
    }
}
