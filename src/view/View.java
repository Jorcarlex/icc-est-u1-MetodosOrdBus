package view;

import java.util.Scanner;
import controller.*;
import models.*;

public class View {

    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Ingresar personas: ");

        System.out.println("2. salir");
        return scanner.nextInt();
    }

    public Person inputPerson() {
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

    public String inputName() {
        System.out.println("Ingrese el nombre: ");
        return scanner.next();
    }

    public int inputAge() {
        System.out.println("Ingrese la edad: ");
        return scanner.nextInt();
    }

    public int inputInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }
}