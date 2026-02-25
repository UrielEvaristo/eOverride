class Perro extends Animal {
    String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        // Acceder directamente a nombre y edad
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años, Raza: " + raza);
        System.out.println("Sonido:guauuuuu");
    }
}