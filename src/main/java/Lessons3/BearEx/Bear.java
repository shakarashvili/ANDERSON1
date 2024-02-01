package Lessons3.BearEx;

public class Bear {
    private String name;
    private  int age;
    private  boolean inMale;
public String getName(){
    return  name;
}
public void setAge(int age){
    this.age = age;
}

    public Bear(int age) {
        this.age = age;
    }

    public Bear(String name, boolean inMale) {
        this.name = name;
        this.inMale = inMale;
    }
    public void voice(){
        System.out.println("RRRRRRRRR!!!");
    }
public void getInfo(){
    System.out.println(name + " " + age + " " + inMale);//ეს მონაცემები პრივატული იყო მარა გამოვიტანეთ პაბლიკში და აქედან წავიღებთ სხვა კლასში

}

 /*   public String toString(){
    if(name.equals(null)){

        return "\" i can this\" ";
    } else {
        String male;
        if(inMale == true){
            male = "boy";
        } else {
            male = "girl";
    }
    return "name" + name + '\'' + "age " + age + " inmale" + male;
    } */

    public Bear makebabyBear(Bear bear2, String possibleName , boolean inMale){
    if(this.inMale == bear2.inMale) {
        return new Bear(null, inMale);
    } else {
        Bear newBear = new Bear(possibleName, inMale);
        newBear.setAge(1);
        return newBear;
    }

}
}


































