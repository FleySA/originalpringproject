package com.telran.prof.course.prevlesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class AlertServiceApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       //  NotificationSmsService service = context.getBean("notificationSmsService", NotificationSmsService.class);
       // AlertService alertService = new AlertService(service);
        System.out.println( Arrays.toString(context.getBeanDefinitionNames()));

        AlertService alertService = context.getBean("alertService", AlertService.class);
        alertService.checkAlert(true);
    }
}
