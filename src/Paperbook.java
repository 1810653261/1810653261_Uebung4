import java.util.Date;

public class Paperbook extends Book {
    //Attribute
    private String series;
    private String month;
    //Getter und Setter
    public String getSeries()
    {
        return series;
    }
    public void setSeries(String series){
        this.series=series;
    }
    public String getMonth(){
        return month;
    }
    public void setMonth(String month){
        this.month=month;
    }
    // Super da geerbt.
    public Paperbook(String series, String month, int pages, Date released, String title, String isbn){
        super(pages, released, title, isbn);
        this.series=series;
        this.month=month;
    }

}