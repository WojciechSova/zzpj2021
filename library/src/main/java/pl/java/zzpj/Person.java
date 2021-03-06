package pl.java.zzpj;

import lombok.Getter;
import lombok.Setter;

public class Person {
    @Getter
    @Setter
    private String name;

    public void hello() {
        System.out.println("Hello " + getName());
    }
}
