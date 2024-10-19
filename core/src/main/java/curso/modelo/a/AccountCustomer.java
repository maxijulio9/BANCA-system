package main.java.curso.modelo.a;



public class AccountCustomer{

    private String name;
    private String email;
    private int age;
    private double budget;

    private AccountCustomer(String name, String email, int age, double budget){
        this.name = name;
        this.age =    age;
        this.email= email;
        this.budget = budget;

    }

    public static AccountCustomer getInstance(String name, String email, int age, double budget){

        return new AccountCustomer(name, email, age, budget);
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    

}