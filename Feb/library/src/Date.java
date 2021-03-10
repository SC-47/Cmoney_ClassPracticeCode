public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
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

    public void setDate(int year, int month, int day) {
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

    public int getDateInt() {
        return getYear() * 1000 + getMonth() * 100 + getDay();
    }

    @Override
    public String toString() {
        return getDateString();
    }

    public String getDateString() {
        return getDateString('/');
    }

    public String getDateString(char c) {
        String date = String.valueOf(getYear()) + c;
        date += String.valueOf(getMonth()) + c;
        date += String.valueOf(getDay());
        return date;
    }

    public int compare(Date date){
        return this.getDateInt()-date.getDateInt();
    }

    public boolean isBetweenWith(Date startDate, Date endDate){
        return this.compare(startDate)>= 0 && this.compare(endDate) <= 0;
    }
}
