package controller;

import models.Person;

public class SortingMethods {


    public void sortByNameBuble(Person[] personas) {

        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getName().compareTo(personas[j + 1].getName()) > 0) {
                    Person temp = personas[j];
                    // personas[i] = personas[j+1];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    public void sortByNameSelection(Person[] personas) {

        int n = personas.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (personas[j].getName().compareTo(personas[min_idx].getName()) < 0) {
                    min_idx = j;
                }
            }

            Person temp = personas[min_idx];
            personas[min_idx] = personas[i];
            personas[i] = temp;
        }
    }

    public void sortByAgeInsertion(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getAge() > key.getAge()) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
            personas[j + 1] = key;
        }
    }

    public void sortByNameInsertion(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getName().compareTo(key.getName()) > 0) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
            personas[j + 1] = key;
        }
    }
}
