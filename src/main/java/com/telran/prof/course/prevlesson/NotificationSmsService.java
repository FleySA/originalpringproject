package com.telran.prof.course.prevlesson;

import com.telran.prof.course.prevlesson.NotificationService;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class NotificationSmsService implements NotificationService {
    private String serviceId;
    public NotificationSmsService() {
        serviceId = UUID.randomUUID().toString();
    }
    @Override
    public  void notifyAlert() {
        System.out.println("I am notification from notification sms service with UUID :" + " " + serviceId);
    }
}
