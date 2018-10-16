public class House {
    private String address;
    private String type;
    private  double price;
    private String owner;
    private Layout layout;

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

    public Layout getLayout() {
        return layout;
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

    public void setLayout(int rooms, int floors){
        layout.setLayout(rooms,floors);
    }

    //toString
    public String toString() {
        return "Address " +getAddress()+ "\nType " +getType()+ "\nPrice " +getPrice()+
                "\nOwner " +getOwner()+ "\n" +layout.toString();
    }

    //3-argument constructor
    public House(String address, String type, double price, String owner, int floor, int rooms){
      setAddress(address);
      setType(type);
      setPrice(price);
      setOwner(owner);
        layout = new Layout(floor,rooms);
    }

    //no argument constructor
    public House(){
       address = "Not Specified";
       type = "Not Specified";
       price = 0;
       owner = "Not Specified";
    }



}


