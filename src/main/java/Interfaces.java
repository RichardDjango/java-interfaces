
interface WritingTool{
    String Erase = "eraser";  //public static final
    public void write();
}
class  Pen implements WritingTool  {
    public void write(){
        System.out.println("Im a Pen");
    }
}
class Pencil implements WritingTool{
    public  void write(){
        System.out.println("Im a Pencil");
    }
}

class Kit {
    public void doSomething(WritingTool p){
        p.write();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Kit k = new Kit();
        WritingTool penTool = new Pen();
        WritingTool pencilTool = new Pencil();

        k.doSomething(pencilTool);
        k.doSomething(penTool);
    }
}
