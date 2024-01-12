package singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Si ves dos valores iguales => singleton se reutiliza" + "\n" +
                "Si ves dos valores diferentes => singleton se crea 2 veces" + "\n\n" +
                "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.getValue()); //FOO
        System.out.println(anotherSingleton.getValue()); //FOO
    }
}
