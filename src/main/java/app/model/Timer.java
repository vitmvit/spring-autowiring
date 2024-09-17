package app.model;

import lombok.Getter;

@Getter
public class Timer {

    private final Long nanoTime = System.nanoTime();
}