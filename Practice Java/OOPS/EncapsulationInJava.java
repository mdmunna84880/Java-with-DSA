package OOPS;

public class EncapsulationInJava {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setId(798987);
        e1.getId();

        e1.setName("Md Munna");
        e1.getName();
    }
}


class Employee {
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }

    public void getId(){
        System.out.println("This is your id "+ this.id);
    }

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println("This is your name "+this.name);
    }
    
}