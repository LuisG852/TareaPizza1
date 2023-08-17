// en la clase pizza italiana se hereda a la clase padre "Pizza"
//agregando la propiedad adicional
class PizzaItaliana extends Pizza {
    private String salsa;
    private int tiempoEnHorno;
    //el constructor Pizzaitaliana con el que se inicializan los objetos
    //y establecer sus valores
    public PizzaItaliana(String nombre, double precio, String salsa, int tiempoEnHorno) {
        super(nombre, precio);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public int getTiempoEnHorno() {
        return tiempoEnHorno;
    }

    public void setTiempoEnHorno(int tiempoEnHorno) {
        this.tiempoEnHorno = tiempoEnHorno;
    }
   //el metodo preparar que indica cuando se agrega y hornea la pizza
    //y tambien indica cuando la pizza ya esta lista
    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando salsa " + salsa + " y horneando por " + tiempoEnHorno + " minutos.");
        System.out.println("La pizza  está lista para ser servida.");
    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa;
    }
}