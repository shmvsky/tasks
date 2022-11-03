package ru.shmvsky.tasks;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

//Кто внес изменения
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("shmvsky");
    }
}
