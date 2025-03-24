package JavaAccessSpecifier.internal;

public class Store {
    public void AcessMall(){
        Mall mall = new Mall();
        System.out.println("Calling public in same package " + mall.name);
        mall.Open();

        System.out.println("Calling default in same package" + mall.Brand);
        mall.Stores();
    }
}
