public class Date{
    private int year;
    private int month;
    private int day;
    //private int year, month, day;

    //Constructor (method that same name of class)
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Setter and Getter
    //Getter ส่งคืนค่ากลับให้กับ object

    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }    
    public int getDay(){
        return this.day;
    }

    //Setter เอาไว้กำหนดค่าให้กับ attribute
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }

    //toString() เป็น method ที่เรียกใช้ได้เลยผ่าน object
    public String toString(){
        return String.format("%02d%02d%4d",month,day,year);
    }

    public void setDate(int year,int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    
}