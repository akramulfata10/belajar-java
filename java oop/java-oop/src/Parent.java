class Parent {

    String name;

    void variabelHidding(){
        System.out.println("Do it in Parent");
    }
}

class Chile extends Parent{

    void variabelHidding() {
        System.out.println("Do it in chile");
        System.out.println("Parent Name is " + super.name);
    }
}
