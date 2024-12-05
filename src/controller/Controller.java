package controller;

import models.Person;
import view.View;

public class Controller {
    private View view; ////
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private Person[] persons;
    
        public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
            this.view = view; ////
            this.sortingMethods = sortingMethods;
            this.searchMethods = searchMethods;
            this.persons= new Person[0];
        System.out.println("Controlador Creado");
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
                    sortPersons();
                    break;
                case 3:
                    searchPerson();
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (option != 0);
    }

    public void inputPersons() {
        Person person = view.inputPerson();
        addPerson(person);
    }

    public void addPerson(Person person) {
        Person[] newPersons = new Person[persons.length+1];
        System.out.println("Persona Agregada");
        System.arraycopy(persons, 0, newPersons, 0, persons.length);
        newPersons[persons.length] = person;
        persons= newPersons;
    }
    public void sortPersons() {
        int metodo = view.selectSortingMethod();
        switch (metodo) {
            case 1:
            sortingMethods.sortByNameBuble(persons);
            break;
            case 2:
            sortingMethods.sortByNameSelection(persons);
            break;
            case 3:
            sortingMethods.sortByAgeInsertion(persons);
            break;
            case 4:
            sortingMethods.sortByNameInsertion(persons);
            break;
        }
        view.displayPersons(persons); 
    }

    public void searchPerson(){
        int criterion = view.selectSearchCriterion();
        Person result = null;
        if (criterion == 1) {
            if (!searchMethods.isSortedByName(persons)) {
                System.out.println("List is not sorted by name.");
                return;
            }
            String name = view.inputName();
            result = searchMethods.binarySearchName(persons, name);
        } else if (criterion == 2) {
            if (!searchMethods.isSortedByName(persons)) {
                System.out.println("List is not sorted by age.");
                return;
            }
            int age = view.InputAge();
            result = searchMethods.binarySearchAge(persons, age);
        }
        view.displaySearchResult(result);
    }
}
