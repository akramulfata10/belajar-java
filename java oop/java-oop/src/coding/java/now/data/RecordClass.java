package coding.java.now.data;
//memili contraktor default
public record RecordClass(String username,String Password) {

    //menambah contraktor di record class
    public RecordClass{
        System.out.println("ini Adalah constraktor buat sendiri");
    }
    //menambah contraktor di record class overloading
    public RecordClass(String username){
        this(username,"");
    }

    public RecordClass(){
        this("","");
    }
}
