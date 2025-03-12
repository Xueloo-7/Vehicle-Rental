package models;

public class  Vehicle{

    private String id;       
    private String brand;    
    private String model;    
    private String licensePlate; 
    private String type;     

    private double engineSize; 
    private int seatingCapacity;
    private double mileage;    

    private boolean isAvailable;
    private double rentalPricePerDay; 
    private double rentalPricePerHour;
    private String location;    

    public String getID()
    {
        return this.id;
    }
    public void setID(String newId)
    {
        this.id = newId;
    }
    public String getBrand()
    {
        return this.brand;
    }

    public Vehicle(){

    }

    public Vehicle(String id, String brand){
        this.id = id;
        this.brand = brand;
    }
}