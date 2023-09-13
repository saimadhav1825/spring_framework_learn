package org.example;

import org.example.springFrameWorkLearn.Vehicle;
import org.example.springFrameWorkLearn.annoationbasedconfiguration.Truck;
import org.example.springFrameWorkLearn.configurationbeanannotation.AppConfig;
import org.example.springFrameWorkLearn.configurationbeanannotation.Samsung;
import org.example.springFrameWorkLearn.xmlbasedConfiguration.Tyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*//For These Two Creating Manually Using New KeyWord
        //Tight Coupling
        Car car=new Car();
        car.drive();

        //Loose Coupling       how we achieved created one interface  Vehicle methods ,
        // inside if we want to change object in future no need to change each and every object
        Vehicle vehicle=new Bike();
        vehicle.drive();*/

        //three type of configuration
        //1.xml based configuration
        //2.annotation based configuration
        //3.java based configuration


        //xml based configuration
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        vehicle.drive();*/

        //annotation based xml configuration
       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle vehicle = (Vehicle) context.getBean("truck");
        vehicle.drive();*/

        //Bean Property we can directly value in xml using <property> tag
        //  <bean id="tyre" class="org.example.springFrameWorkLearn.xmlbasedConfiguration.Tyre">
        //        <property name="brand" value="MRF"/>
        //    </bean>
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Tyre tyre = (Tyre) context.getBean("tyre");
        System.out.println(tyre.getBrand());*/

        //annotation based configuration using autowired
       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Truck tyre = (Truck) context.getBean("truck");
        tyre.drive();*/

        //configuration using annotation without using xml
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung samsung = applicationContext.getBean(Samsung.class);
        samsung.call();
    }
}
