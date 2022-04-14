import org.testng.annotations.Test;
public class class1 {
    @Test( priority=3)
    public void One() {
        System.out.println("ONE");
    }
    @Test(priority=2)
    public void Two() {
        System.out.println("TWO");
    }
    @Test(priority=2)
    public void three() {
        System.out.println("THREE");
    }

}
