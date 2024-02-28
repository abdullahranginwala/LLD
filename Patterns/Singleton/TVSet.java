package Singleton;

public class TVSet {
    private static TVSet instance = null;

    private TVSet() {
        System.out.println("TV Set created");
    }

    public synchronized static TVSet getInstance() {
        if(instance == null) {
            synchronized(TVSet.class) {
                if(instance == null) {
                    instance = new TVSet();
                } else {
                    System.out.println("TV Set already exists");
                }
            }
        } else {
            System.out.println("TV Set already exists");
        }
        return instance;
    }
}