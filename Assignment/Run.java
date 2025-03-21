class DeliveryGuy{
public static void acept(String item){
System.out.println("Acept item: "+ item);
}
}

class Station{
public static void send(String item){
System.out.println("Send item: " + item);
DeliveryGuy.acept(item);
}
}

class Courier{
public static void pickup(String item){
System.out.println("Pickup item: " + item);
Station.send(item);
}
}

class Run{
public static void main(String[] args){
String item = "Pizza";
Courier.pickup(item);
}
}