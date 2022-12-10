public class Main{
    public static void main(String[] args) {
        Son son = new Son(22);
        son.carrer();

        Daughter daughter = new Daughter(28);
        daughter.carrer();

        Parent.hello();
        son.normal();
    }
}