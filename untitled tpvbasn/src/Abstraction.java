//abstract class and abstract method declaration;
abstract class ab{
    abstract void print();
}
class access extends ab{
    @Override
    void print() {
            System.out.println("I'm from class ab ");
    }

}
public class Abstraction {

    public static void main(String[] args) {
        access b=new access();
        b.print();

    }
}
