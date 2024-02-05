package Homework3;

public class Employee {

    public static void main(String[] args) {
        //4. Создать массив из 5 сотрудников.
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("giorgi shakarashvili","Test automation engineer","shaqarashvili25@gmail.com", 43543243,5000,28);
        employee[1] = new Employee("elene gorbachova","project manager", "elenea25@gmail.com",54354321,40000,55);
        employee[2] = new Employee("zaur maxachev","directro", "zaur43@gmail.com", 5432345,10000,44);
        employee[3] = new Employee("anastasia fedchak", "cyber security engineer ", "fedchak@gmail.com", 343234343,7000, 60);
        employee[4] = new Employee("natalia zhadunik", "IT recruter", "natalia23@gmail.com", 23456432,3000,25);
        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (Employee result : employee)
            if (result.takeAge()>40)
                System.out.println(result);

           }

    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    public String fullname;
    public String position;
    public String e_mail;
    public int mobile;
    public int salary;
    public int age;


    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String fullname, String position, String e_mail , int mobile, int salary , int age){
        this.fullname = fullname;
        this.position = position;
        this.e_mail = e_mail;
        this.mobile = mobile;
        this.salary = salary;
        this.age = age;

    }


    public int takeAge() {
        return age; }
    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    @Override
    public String toString(){
        return("fullname - "+fullname+ "-" + "position - "+position + "-" +"email - "+e_mail+ "-"+"mobile - "+mobile+ "-" +"salary - "+salary+ "-" +"age - "+age);
    }
}
