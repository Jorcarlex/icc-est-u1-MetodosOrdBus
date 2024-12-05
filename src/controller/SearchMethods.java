package controller;

import models.Person;

public class SearchMethods {
    public Person binarySearchAge(Person[] persons, int age) {
        int inicio = 0;
        int fin = persons.length - 1;

        while (inicio <= fin) {

            int medio = inicio + (fin - inicio) / 2; // Ecuacion para encontrar la mitad entera

            if (persons[medio].getAge() == age) {
                // ELEMENTO ENCONTRADO
                return persons[medio];
            }

            if (persons[medio].getAge() < age) {
                inicio = medio + 1; // BUscar en la mitad de la derecha
            } else {

                fin = medio - 1; // Buscar en la mitad de la izquierda
            }
        }

        return null;
    }

    public Person binarySearchName(Person[] persons, String Name) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getName().equals(Name)) {
                return persons[i];
            }
        }
        return null;
    }

    public boolean isSortedByAge(Person[] persons) {
        if (persons == null || persons.length == 0) {
            return true; // Consider an empty or null array as sorted
        }

        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].getAge() > persons[i + 1].getAge()) {
                return false;
            }
        }
        return true;
    }

    public boolean isSortedByName(Person[] persons) {
        if (persons == null || persons.length == 0) {
            return true; // Consider an empty or null array as sorted
        }

        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].getName().compareToIgnoreCase(persons[i + 1].getName()) > 0) {
                return false;
            }
        }
        return true;
    }
}
