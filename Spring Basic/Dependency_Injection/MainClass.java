package Dependancy1.Depandancy1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		System.out.println("config loaded");
		Employee S = context.getBean("Employee", Employee.class);
		S.ShowMePlease();
    }
}
