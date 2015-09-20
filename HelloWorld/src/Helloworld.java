import java.awt.Point;
import java.io.FileNotFoundException;
import java.util.*;

import org.omg.CORBA.SystemException;
@SuppressWarnings("unused")
public class Helloworld implements Cloneable{
	private String name;
	public String getName(){return name;};
	Helloworld(){};
	Helloworld(String a){name=a;};
	public Helloworld clone() throws CloneNotSupportedException{
		Helloworld cloned=(Helloworld) super.clone();
		return cloned;
	};
public static void main(String[] args) throws CloneNotSupportedException{
	Helloworld a=new Helloworld("bad");
	Helloworld b=a.clone();
	System.out.println(b.getName());
	System.out.println("lala");
	System.out.println("social program");
	System.out.println("but danshi zhe");
}
}

