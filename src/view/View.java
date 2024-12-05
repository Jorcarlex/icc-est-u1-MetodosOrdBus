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
        System.out.println("1. Ingresar Persona");
        System.out.println("2. Ordenar Personas");
        System.out.println("3. Buscar Personas");
        System.out.println("4. Salir del Programa");
        System.out.println("Selecciona una opcion");
        return scanner.nextInt();
    }

    public int inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    
        }
    
        public Person inputPerson(){
            System.out.println("Ingrese Nombre");
            String name = scanner.next();
            System.out.println("Ingrese Edad");
            int age = scanner.nextInt();
            return new Person(name, age);
        }

    public int inputAge() {
        System.out.println("Ingrese la edad: ");
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int selectSortingMethod() {
        System.out.println("Ingrese el metodo de ordenamiento");
        System.out.println("1. Ordenar por Nombre con Burbuja");
        System.out.println("2. Ordenar por Nombre con Selección (Desc)");
        System.out.println("3. Ordenar por Edad con Inserción");
        System.out.println("4. Ordenar por Nombre con Inserción");
        return scanner.nextInt();
    }

    public int selectSearchCriterion() {
        System.out.println("Ingrese el criterio de busqueda");
        System.out.println("1. Buscar por Nombre");
        System.out.println("2. Buscar por Edad");
        return scanner.nextInt();
    }

    // CHAT
    public void displayPersons(Person[] persons) {
        if (persons == null || persons.length == 0) {
            System.out.println("No hay personas para mostrar.");
            return;
        }

        System.out.println("Lista de personas:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    // CHAT
    public void displaySearchResult(Person person) {
        if (person == null) {
            System.out.println("Persona no encontrada.");
        } else {
            System.out.println("Persona encontrada:");
            System.out.println(person);
        }
    }

    public int InputAge() {
        System.out.println("Ingrese la edad");
        return scanner.nextInt();

    }

    public String inputName() {
        System.out.println("Ingrese el nombre: ");
        return scanner.next();
    }
}
