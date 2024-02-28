package com.telran.prof.course.prevlesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        //NotificationSmsService service = (NotificationSmsService) context.getBean("notificationSmsService");

        NotificationSmsService service = context.getBean("notificationSmsService", NotificationSmsService.class);
        service.notifyAlert();

        NotificationSmsService serviceTwo = context.getBean("notificationSmsService", NotificationSmsService.class);
        serviceTwo.notifyAlert();

        //  AlertService alertService = new AlertService(service);
        //  alertService.checkAlert(true);
    }
}

