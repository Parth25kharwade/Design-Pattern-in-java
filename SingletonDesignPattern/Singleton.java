package SingletonDesignPattern;

public class Singleton {
    private String name;
    private int age;
    private static Singleton singleton;
    private Singleton(){
        this.name="Parth";
        this.age=20;
    }

    public static Singleton getSingleton() {
        if(singleton==null){
            return new Singleton();
        }
        return singleton;
    }





    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", singleton=" + singleton +
                '}';
    }
}
