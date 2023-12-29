package DesignPattern.c22中介者模式;

import java.time.LocalDateTime;

/**
 * 简单的聊天室类
 * 中介者类
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(LocalDateTime.now().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
