package coding.java.now.data;

public class EquelsMethod {

    private String name;
    private int price;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquelsMethod that = (EquelsMethod) o;

        if (price != that.price) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
