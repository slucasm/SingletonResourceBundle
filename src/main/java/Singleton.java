import java.util.HashMap;
import java.util.ResourceBundle;

public class Singleton {

    private static Singleton instance;

    private HashMap<String, ResourceBundle> lenguajes;

    private Singleton() {
        lenguajes = new HashMap<String, ResourceBundle>();
    }

    public static Singleton getInstance()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getString(String nombre, String key) {

        ResourceBundle r = lenguajes.get(nombre);
        if (r == null) {
            r = ResourceBundle.getBundle(nombre);
            lenguajes.put(nombre, r);
        }
        return r.getString(key);
    }
}




