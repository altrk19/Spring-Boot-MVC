package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setup()throws Exception{
        this.setterInjectedController=new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
        //if line 15 comment , occurs NPE. So preferred injection is constructor
    }

    @Test
    public void test()throws Exception{
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS,setterInjectedController.sayHello());
    }
}
