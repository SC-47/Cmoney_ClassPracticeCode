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

    public String getDateString() {
        return getDateString('.');
    }

    public String getDateString(char c) {
        String str = String.valueOf(getYear()) + c;
        str += String.valueOf(getMonth()) + c;
        str += String.valueOf(getDay());
        return str;
    }
}
