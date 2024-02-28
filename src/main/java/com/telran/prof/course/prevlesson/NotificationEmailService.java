package com.telran.prof.course.prevlesson;

public class NotificationEmailService implements NotificationService {
@Override
    public  void notifyAlert() {
        System.out.println("I am notification from notification sms service");
    }
}
