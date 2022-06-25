package coding.java.now.data;

public class Company {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public class Employee1 {
        private String name;

        //akses method yang ada di inner class nya


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompany(){
            return Company.this.getName();
            //panggil field yang ada di inner class nya
        }
    }
}

