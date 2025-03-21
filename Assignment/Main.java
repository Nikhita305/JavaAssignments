class Bakery{
public static void buy(String itemName, int quantity){
System.out.println("Buy iteam of quantity x:" +" "+ itemName+" "+quantity);
}
public static void open(boolean yesorno){
System.out.println("Open item:" + yesorno);
}
public static void close(boolean yesorno){
System.out.println("Buy iteam of quantity x: " + yesorno);
}
public static void owner(String name){
System.out.println("Owner name: " + name);
}
public static void cashier(String name){
System.out.println("Cashier name: " + name);
}
}

class Main{
public static void main(String[] args){
Bakery.buy("Milkybar",10);
Bakery.open(true);
Bakery.close(false);
Bakery.owner("Kamath");
Bakery.cashier("Prabhu");

}}