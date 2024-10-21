package view;

//import controller.SearchMethods;
//import controller.SortingMethods;
import controller.*;

public class App {
    public static void main(String[] args) {
        //CREAR VISTA
        View vista = new View();

        //Craer las clases con los metodosde ordenamiento y busca
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        //Crear el cotrolador
        Controller controller = new Controller(vista, sortingMethods, searchMethods);

        //Iniciar la aplicacion
    }
}
