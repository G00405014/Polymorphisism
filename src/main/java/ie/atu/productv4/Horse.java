package ie.atu.productv4;

public class Horse extends Animal {
    private String Sire;
    private String Height;
    private String Dam;
    private String Code;


    public Horse() {
        super();
        Sire = "";
        Dam = "";
        Height = "";
    }

    public String getSire() {
        return Sire;
    }

    public void setSire(String sire) {
        Sire = sire;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getDam() {
        return Dam;
    }

    public void setDam(String dam) {
        Dam = dam;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "Sire='" + Sire + '\'' +
                ", Height='" + Height + '\'' +
                ", Dam='" + Dam + '\'' +
                '}';
    }
}