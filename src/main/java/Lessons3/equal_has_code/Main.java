package Lessons3.equal_has_code;

import java.io.ObjectStreamClass;
import java.util.Objects;

public class Main {
    public static void main(String[] args) { //mesame nabiji
        Auto renault = new Auto("renault" , 100000, true);
        Auto renault2 = new Auto("renault" , 100000, true);
        System.out.println(renault.equals(renault2));
        System.out.println(renault.hashCode());
        System.out.println(renault2.hashCode());
        System.out.println(renault);
        System.out.println(renault2);

    }

}



























