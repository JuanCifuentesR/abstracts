class Pajaro extends Animal implements Animal.Volador {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void haceSonido() {
        System.out.println(nombreAnimal + " dice: ¡Pío pío!");
    }

    @Override
    public void volar() {
        System.out.println(nombreAnimal + " está volando.");
    }
}