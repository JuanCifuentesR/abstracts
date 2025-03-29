abstract class Animal {
    protected String nombreAnimal;

    public Animal() {
    }

    public Animal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombreAnimal='" + nombreAnimal + '\'' +
                '}';
    }

    public abstract void haceSonido();

    interface Volador {
        void volar();
    }

    interface Nadador {
        void nadar();
    }


}
