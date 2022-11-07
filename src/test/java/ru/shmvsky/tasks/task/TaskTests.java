package ru.shmvsky.tasks.task;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class TaskTests {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    public void saveTask() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("d-MMM-yyyy, HH:mm:ss aaa");

        String title = "Купить морковку";
        String description = "ОБЯЗАТЕЛЬНО!!";
        Date dueDate = dateFormat.parse("8-Nov-2022, 13:00:00 PM");

        Task task = Task.builder()
                .title(title)
                .description(description)
                .dueDate(dueDate)
                .build();

        Task savedTask = taskRepository.save(task);

        Assertions.assertEquals(1L, savedTask.getId());
        Assertions.assertEquals(title, savedTask.getTitle());
        Assertions.assertEquals(description, savedTask.getDescription());
        Assertions.assertEquals(dueDate, savedTask.getDueDate());

    }

}
