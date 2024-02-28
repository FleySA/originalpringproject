package com.telran.prof.course.prevlesson;

import com.telran.prof.course.prevlesson.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class AlertService {

   private NotificationService service ;

    public AlertService(NotificationService service) {
        this.service = service;
    }
    public void checkAlert(boolean hasAlert) {
        if (hasAlert) {
            service.notifyAlert();
        }

    }

}
