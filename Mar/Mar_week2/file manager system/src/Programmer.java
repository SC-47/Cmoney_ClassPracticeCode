public class Programmer {
    Programmable programmable;
    public Programmer(Programmable programmable){
        this.programmable = programmable;
    }

    public void code(){
        programmable.program();
    }



}
