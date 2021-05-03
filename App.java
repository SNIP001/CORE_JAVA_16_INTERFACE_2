package $16_interface;

public class App implements Circle,CircleTwo{
    public static void main(String[] args) {
        App a = new App();
        a.calculateArea(25);
    }
    @Override
    public void calculateArea(int a) {
      //  pi=3.15f;     ->   we cannot assign value to the interface variables because it is final
        System.out.println(CircleTwo.pii);
        
    }

    @Override
    public void calculateArea() {
         System.out.println(Circle.pii);
    }
    
}
