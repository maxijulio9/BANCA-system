package main.java.curso.usecase;

import main.java.curso.input.ICreateAccountCustomer;
import main.java.curso.modelo.a.AccountCustomer;

public class CreateNewAccountUseCase implements ICreateAccountCustomer {

    @Override
    public AccountCustomer createNewAccountCustomer(String name, String email, int age, double budget){

        if (name.isEmpty() || name.trim().isEmpty()) {
            throw new RuntimeException("El nombre no puede estar vacío");
            
        }
        if (!email.contains("@")) {
            throw new RuntimeException("El correo no es válido.");
            
        }
        if (age < 18) {
            throw new RuntimeException("Sos menor de edad");
        }
        if (budget < 1000) {
            throw new RuntimeException("El saldo no puede ser menor  a 1000 USDT");
        }

        return  AccountCustomer.getInstance(name, email, age, budget);

    }
    
}
