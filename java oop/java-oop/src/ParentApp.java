public class ParentApp {
    public static void main(String[] args) {
        Chile chile = new Chile();
        chile.name = "akramul fata";
        chile.variabelHidding();
        System.out.println(chile.name);
        Parent parent = (Parent) chile;
        parent.variabelHidding();
        System.out.println(parent.name);
    }
}
