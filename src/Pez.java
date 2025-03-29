class Pez extends Animal implements Animal.Nadador {
    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void haceSonido() {
        System.out.println(nombreAnimal + " hace burbujas...");
    }

    @Override
    public void nadar() {
        System.out.println(nombreAnimal + " está nadando.");
    }
}