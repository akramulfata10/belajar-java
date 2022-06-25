package coding.java.now.data;

public class Category {
    private String id;
    private boolean expression;
    /**
     * dengan menggunakan teknik encapkulasi maka field yang ada di parent tidak bisa dirubah sembaranggan
     * tapi field yang ada di parent class harus Access Modifier private
     */
    public String getId() {
        return id;
    }

    //setter kondisi
    public void setId(String id) {
        if(id != null){
            this.id = id;
        }
    }

    public boolean isExpression() {
        return expression;
    }

    public void setExpression(boolean expression) {
        this.expression = expression;
    }
}
