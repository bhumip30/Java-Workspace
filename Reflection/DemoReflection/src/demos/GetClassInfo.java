package demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetClassInfo {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the fully qualified name: ");
			String name = br.readLine();
			
			Class c = Class.forName(name);
			
			String s1 = new String("welcome");
			Class c1 = s1.getClass();
			
			Class c3 = String.class;
			
			System.out.println("Constructors....");
			Constructor [] cons = c1.getConstructors();
			for(Constructor co : cons) {
				System.out.println(co);
			}
			
			System.out.println("Methods...");
			Method [] med = c1.getMethods();
			for(Method m : med) {
				System.out.println(m);
			}
			
			System.out.println("Package..." + c1.getPackageName());
			
			System.out.println("Super Class..." + c1.getSuperclass());
			
			System.out.println("Interfaces...");
			Class [] in = c1.getInterfaces();
			for(Class i : in) {
				System.out.println(i);
			}
			
			int n = c1.getModifiers();
			if(Modifier.isAbstract(n))
				System.out.println("Class is abstract");
			else
				System.out.println("Class is not abstract");
			
			if(Modifier.isFinal(n))
				System.out.println("Class is final");
			
			if(Modifier.isPublic(n))
				System.out.println("Class is public");
			
		}
		catch( IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
