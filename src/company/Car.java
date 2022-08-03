package company;

public class Car implements AutoCloseable{


    public void close() {
        System.out.println("Машина жабылып атат");
    }

    public void drive(){
        System.out.println("Машина журуп атат");
    }


}
