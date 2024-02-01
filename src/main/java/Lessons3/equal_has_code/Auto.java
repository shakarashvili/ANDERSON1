package Lessons3.equal_has_code;

import java.util.Objects;

public class Auto { // pirveli nabiji
    private  String name;
    private  int price;
    private boolean isNew;

    public Auto(String name, int price , boolean isNew){ //meroe nabiji
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    @Override   // meotxe nabiji
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(name, auto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

















