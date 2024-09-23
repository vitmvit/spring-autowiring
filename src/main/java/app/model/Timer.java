package app.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Timer {

    private final Long nanoTime = System.nanoTime();
}