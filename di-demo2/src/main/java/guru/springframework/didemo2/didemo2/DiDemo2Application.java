package guru.springframework.didemo2.didemo2;

import guru.springframework.didemo2.didemo2.controllers.ConstructorInjectedController;
import guru.springframework.didemo2.didemo2.controllers.MyController;
import guru.springframework.didemo2.didemo2.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemo2Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemo2Application.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(myController.hello());
        //GreetingService'yi implement eden 3 tane sınıf var. Primary ile öncelik verildi.

        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
