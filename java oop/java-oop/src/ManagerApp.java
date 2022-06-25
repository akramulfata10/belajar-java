public class ManagerApp {
    public static void main(String[] args) {
      var manager1 = new Manager("fata");
      manager1.sayHello("budi");

      var vp = new VicePresident("joko");
      vp.sayHello("budi");


      System.out.println(manager1);
      System.out.println(manager1.toString());
      System.out.println(vp);
      System.out.println(vp.toString());
    }
}
