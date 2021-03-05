public class PrintMapper implements Mapper{
    @Override
    public void map(Student student) {
        System.out.println("座號:"+student.getSeatNum()+" 姓名:"+student.getName()+" 成績:"+student.getScore());
    }
}
