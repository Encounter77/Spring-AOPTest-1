package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        int eatWhat = (int)(Math.random()*10);
        String foodType = null;
        Food food = null;
        if (eatWhat <= 5) {
            foodType = "Noodles";
        }
        else {
            foodType = "Rice";
        }
        food = (Food) context.getBean(foodType);
        food.process();
    }
}
