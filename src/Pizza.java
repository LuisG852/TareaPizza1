import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//clase pizza con sus variables
public class Pizza {
    private String nombre;
    private double precio;
    private List<String> ingredientes;
    //constructor Pizza
    public Pizza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList<>();
    }
    //metodo preparar y tostring ej1
    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista para ser servida.");
    }
    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", y su precio es: " + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la pizza : ");
        String nombrePizza = scanner.nextLine();

        System.out.print("Ingrese el precio de la pizza : ");
        double precioPizza = scanner.nextDouble();

        System.out.print("Ingrese el topping de la pizza : ");
        String toppingPizza = scanner.next();

        PizzaItaliana miPizza = new PizzaItaliana(nombrePizza, precioPizza, "tomate", 20);
        System.out.println(miPizza.toString());

        Topping topping = new Topping(toppingPizza);
        topping.agregar(miPizza);

        System.out.println("Toppings de la pizza : " + miPizza.getIngredientes());
        System.out.println("Tiempo en horno: " + miPizza.getTiempoEnHorno() + " minutos.");
        miPizza.preparar();
    }

}