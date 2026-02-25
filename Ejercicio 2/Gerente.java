class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        double salarioTotal = salario + bono; 
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario base: $" + salario + " | Bono: $" + bono);
        System.out.println("Salario total: $" + salarioTotal);
    }
}
