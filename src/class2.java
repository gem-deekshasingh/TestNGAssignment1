import org.testng.annotations.*;
public class class2 {
    @Test(groups= {"one"})
    public void A(){
        System.out.println("A");
    }
    @Test(groups = {"Regression"})
    public void B() {
        System.out.println("B");
    }
    @Test(groups= {"one","Regression"})
    public void C() {
        System.out.println("C");
    }
    @Test()
    public void D(){
        System.out.println("D");
    }
    @Test()
    public void E(){
        System.out.println("E");
    }

}
