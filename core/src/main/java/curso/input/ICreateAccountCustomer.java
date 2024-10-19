
package main.java.curso.input;

import main.java.curso.modelo.a.AccountCustomer;

public interface ICreateAccountCustomer {
    AccountCustomer createNewAccountCustomer(String name,  String email, int age, double budget) throws RuntimeException;

    
}