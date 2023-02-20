package ie.atu.productv4;

public class Dog extends Animal {
    private String Vaccination;
    private String Shedding;
    private String neutered;


    public Dog() {
        super();
        Vaccination = "";
        Shedding = "";
        neutered = "";
    }

    public String getVaccination() {
        return Vaccination;
    }

    public void setVaccination(String vaccination) {
        Vaccination = vaccination;
    }

    public String getShedding() {
        return Shedding;
    }

    public void setShedding(String shedding) {
        Shedding = shedding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Vaccination='" + Vaccination + '\'' +
                ", Shedding='" + Shedding + '\'' +
                ", neutered='" + neutered + '\'' +
                '}';
    }
}




