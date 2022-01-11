package k14dcpm02.oop;

public class Cusomter {
    // data
    String name, address;
    // operation
    // functions
    void getName(String _name){
        name = _name;
    }

    void getAddress(String _address){
        address =_address;
    }

    // show
    void show(){
        System.out.println("\nThông tin khách hàng:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
