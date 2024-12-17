//Total Abstraction -
// Abstraction is the critical concept of Object-Oriented programming techniques.
// An interface only stores the method signature and not the method definition.
// Method Signatures make an Interface achieve complete Abstraction by hiding the method implementation from the user.


//Multiple Inheritance -
//Without Interface, the process of multiple inheritances is impossible as the conventional way of inheriting multiple
// parent classes results in profound ambiguity. This type of ambiguity is known as the Diamond problem. Interface resolves this issue.


//Loose-Coupling -
//The term Coupling describes the dependency of one class for the other. So, while using an interface,
// we define the method separately and the signature separately. This way, all the methods,
// and classes are entirely independent and archives Loose Coupling.


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
