public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
        System.out.println(saludo.generarSaludo("Mundo"));
        System.out.println("Version 1.1");
    }
}