// en la clase topping agregue 2 metodos
//el topping para seleccionar el nombre de la pizza
// y el agregar para decirle que tome los ingredientes
//dados por el usuario y lo imprima en la consola
class Topping {
    private String nombre;

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        pizza.getIngredientes().add(nombre);
        System.out.println("Topping " + nombre + " agregado a la pizza " + pizza.getNombre());
    }
}