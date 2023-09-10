public class Factory_Main {
    public static void main(String[] args) {
        MG_Factory mg=new MG_Factory();
        Student s1=mg.get_eat("man");
        s1.eat();
        Student s2=mg.get_eat("girl");
        s2.eat();
    }
}
