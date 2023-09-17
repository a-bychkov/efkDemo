package ru.fruits.efkDemo;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Log4j2
public class Logger {
    @Scheduled(fixedRate = 5000)
    public void log(){
        log.info("Event logged in {}", LocalDateTime.now());
    }
}
