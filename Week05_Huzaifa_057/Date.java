public class Date{
    private int day;
    private String month ;
    private int year ;

    public Date(){
        this.day= 28 ;
        this.month= "september";
        this.year=2026 ;
    }

    public Date(int Day, String Month , int Year){
       this.day= Day ;
        this.month= Month;
        this.year=Year ; 
    }

    public Date( Date D){
        this.day = D.day ;
        this.month = D.month;
        this.year = D.year ;
    }
    public void setDate(int day, String month, int year){
        this.day = day;
        this.month = month; 
        this.year = year ;
    }

    public int GetDay(){
        return this.day ;
    }
    public String getMonth(){
        return this.month ; 
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public String toString(){
        return this.day+ "/" + this.month + "/" + this.year ;
    }
}