public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Max", 12345678);
        Pessoa pessoa2 = new Pessoa("Xam", 12345678);

        System.out.println(pessoa1.equals(pessoa2));
    }
}
