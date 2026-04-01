class Student {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name;
    }
    }
    class encap{
        public static void main(String[] args){
        Student objectt = new Student();
        objectt.setName("Anisha Suman");
        System.out.println(objectt.getName());
        }
    }