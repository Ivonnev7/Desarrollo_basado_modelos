import java.util.Enumeration;
import java.util.Iterator;

public class Iterator_Enumeration implements Enumeration {
    Iterator iter;
    public Iterator_Enumeration(Iterator iter){
        this.iter = iter;
    }
    public boolean hasMoreElements(){
        return iter.hasNext();
    }
    public Object nextElement(){
        return iter.next();
    }
}
