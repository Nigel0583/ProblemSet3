public class House {
    private String address;
    private String type;
    private  double price;
    private String owner;

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //toString
    public String toString() {
        return "Address " +getAddress()+ "\nType " +getType()+ "\nPrice " +getPrice()+ "\nOwner " +getOwner();
    }

    //3-argument constructor
    public House(String address, String type, double price, String owner){
      setAddress(address);
      setType(type);
      setPrice(price);
      setOwner(owner);

    }

    //no argument constructor
    public House(){
        this("No Address Specified", "No Type Specified", 0.0,"No owner specified");
    }

}


