public class Book {
    private String name;
    private String author;
    private Date date;
    public Book(String name, String author, Date date){
        setName(name);
        setAuthor(author);
        setDate(date);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getBookInfo(){
        String str = "書名:"+this.getName();
        str += " 作者:"+this.getAuthor();
        str += " 年月日:"+this.getDate().getDateString();
        return str;
    }

    public String getBookInfo(char c){
        String str = "書名:"+this.getName();
        str += " 作者:"+this.getAuthor();
        str += " 年月日:"+this.getDate().getDateString(c);
        return str;
    }
}
