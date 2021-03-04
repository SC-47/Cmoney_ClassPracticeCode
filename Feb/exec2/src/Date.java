public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int year, int month, int day){
        setDate(year, month, day);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(int year, int month, int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDateString(){
        return getDateString('.');
    }

    public String getDateString(char c){
        String str = String.valueOf(getYear())+c;
        str += String.valueOf(getMonth())+c;
        str += String.valueOf(getDay());
        return str;
    }

    public boolean isBetweenWith(Date startDate, Date endDate){
        if (this.compareDate(startDate)>=0 && this.compareDate(endDate)<=0){
            return true;
        }
        return false;
    }

    private int compareDate(Date date2){
        int dateNum = this.year*10000+this.month*100+this.day;
        int date2Num =  date2.year*10000+date2.month*100+date2.day;
        return dateNum-date2Num;
    }
}
