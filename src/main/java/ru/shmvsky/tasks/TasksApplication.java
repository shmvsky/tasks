package ru.shmvsky.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import ru.shmvsky.dbaudit.employee.AuditorAwareImpl;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class TasksApplication {

    @Bean
    public AuditorAware<String> auditorAware(){
        return new AuditorAwareImpl();
    }

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

}
