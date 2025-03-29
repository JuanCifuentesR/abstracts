class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void haceSonido() {
        System.out.println(nombreAnimal + " dice: ¡Guau guau!");
    }


}

