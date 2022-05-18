import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class SingletonEx1 {
    private static SingletonEx1 obj;

    private SingletonEx1() {
    }

    public static SingletonEx1 getInstance() {

        if (obj == null) {
            obj = new SingletonEx1();
        }
        return obj;
    }
    void connection() {
        System.out.println("you are now connected");
    }
}

