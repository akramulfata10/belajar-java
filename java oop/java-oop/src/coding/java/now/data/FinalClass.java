package coding.java.now.data;

public class FinalClass {
    String name;
    String password;
}

class Facebook extends FinalClass{
    //final method
   void methodFinal(String username, String password){
        this.name = name;
        this.password = password;
    }
}

class FakeFacebook extends Facebook{ // error class fakefacebook nya karena class final tidak bisa di enxtends lagi
    void methodFinal(String name, String password) { //erorr method final
        //error karena method yang ada di class parent itu kata kunci nya final tidak bisa dirubah lagi
        //super(name,password); //erorr method final
    }
}


