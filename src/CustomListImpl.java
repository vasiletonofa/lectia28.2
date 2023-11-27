import java.util.ArrayList;
import java.util.List;

public class CustomListImpl<T> implements CustomList<T> { // CustomList<String>, CustomList<Integer>, -> T = String

    List<T> array = new ArrayList<>();

    int counter = 0;

    public void add(T object) {
        array.add(object);
        counter++;
    }

    public void get(int index) {
        array.get(index);
        counter++;
    }

    @Override
    public String toString() {

        String value = "";
        for (T object : array) {
            value += object + ", ";
        }
        return value;
    }
}


