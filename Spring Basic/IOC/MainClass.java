package Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Hello {
	
public static void main(String[] args)
{
ApplicationContext context = new ClassPathXmlApplicationContext("Select.xml");	

	System.out.println("config loaded");
	
	
  Source ss = context.getBean("source", Source.class);
      
      ss.bark();
      ss.smell(); 
     // ss.Meow();
}
}
