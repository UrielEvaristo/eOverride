class Motocicleta extends Vehiculo {
    int cilindrada;

    public Motocicleta(String marca, String modelo, int velocidadMaxima, int cilindrada) {
        super(marca, modelo, velocidadMaxima); // Llama al constructor del padre
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + 
                           ", Vel. Máxima: " + velocidadMaxima + " km/h" +
                           ", Cilindrada: " + cilindrada + "cc");
    }
}
