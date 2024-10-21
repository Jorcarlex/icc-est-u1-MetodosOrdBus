package controller;

import models.Person;
import view.View;

public class Controller {
    private View view; ////
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    private Person[] personas;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view; ////
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        System.out.println("Controller created");
    }

    public void start() {
        int option = 0;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    addPerson();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (option != 0);
    }

    public void inputPersons() {

        int numeroPersonas = view.inputInt("Ingrese el numero de personas");
        personas = new Person[numeroPersonas];

        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson();
        }
    }

    public void addPerson() {
        if (personas == null) {
            inputPersons();
        } else {
            int numeroPersonas = view.inputInt("Ingrese el numero de personas a adicionar: ");

            Person[] personasTotal = new Person[personas.length + numeroPersonas];

            for (int i = 0; i < personas.length; i++) {
                personasTotal[i] = personas[i];
            }

            for (int i = personas.length; i < personasTotal.length; i++) {
                personas[i] = view.inputPerson();
            }

            personas = personasTotal;
        }
    }
}
