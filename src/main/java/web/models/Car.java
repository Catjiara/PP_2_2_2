package web.models;

public class Car {
    private String model;
    private String series;
    private int year;

    public Car(String model, String series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }
    public String getModel() {return this.model;}
    public void setModel(String model) {this.model = model;}
    public String getSeries() {return this.series;}
    public void setSeries(String series) {this.series = series;}
    public int getYear() {return this.year;}
    public void setYear(int year) { this.year = year;}
}
