public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        Pez pez = new Pez("Nemo");
        Pajaro pajaro = new Pajaro("Piolín");

        perro.haceSonido();
        pez.haceSonido();
        pez.nadar();
        pajaro.haceSonido();
        pajaro.volar();
    }
    
}