package app.model;

import app.model.parent.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Override
    public String toString() {
        return "Im a Dog";
    }
}