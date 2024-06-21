package marinalucentini.backend_w5_d4.exception;

public class ElementExist extends RuntimeException{
    public ElementExist (String name){
        super("L'elemento" + name + "esiste già nel db");
    }
}
