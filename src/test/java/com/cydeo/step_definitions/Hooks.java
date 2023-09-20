package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
in the class  we will be able to  pass pre-&ost-conditions to each scenario and each step

 */
public class Hooks {

    // import from io.cucumber .java not from junit
    @Before(order = 1)
    public void setupScenario(){
        System.out.println("=== setting up browser using cucumber @Before");
    }

    @Before(value ="@login",order = 2)
    public  void setupScenarioForLogins(){
        System.out.println("==== this will only apply to scenario  with @login");
    }

    @Before(value ="@db",order = 0)
    public void setupForDatabaseScenario(){
        System.out.println("===== this will only apply to scenarios with  @db");
    }

    @After
    public void teardownScenario(){
        System.out.println("====closing browser using @After ");
        System.out.println("==== Scenario ended / Take Screenshot if failed ");
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("----->applying  setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("--------> applying teardown  using @AfterStep");
    }

}
