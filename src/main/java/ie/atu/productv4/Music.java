package ie.atu.productv4;

import java.text.NumberFormat;
import java.util.Locale;

public class Music extends Product {
    private String Artist;
    private String Label;


    public Music() {
        super();
        Label = "";
        Artist = "";
        count++;
    }

    public void setAuthor(String Artist) {
        this.Artist = Artist;
    }

    public String getArtist() {
        return Artist;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public String getLabel() {
        return Label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + Artist;
    }
}



