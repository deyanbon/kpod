package com.dbon.pod.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class KPodAppListener implements ApplicationListener<ApplicationReadyEvent> {

    Logger logger = LoggerFactory.getLogger(KPodAppListener.class);

    @Value("${kapp.var1Name:}")
    String var1;

    @Value("${kapp.var2Name:}")
    String var2;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

        logger.info("KPod started with var1={} var2={}", var1, var2);

    }
}
