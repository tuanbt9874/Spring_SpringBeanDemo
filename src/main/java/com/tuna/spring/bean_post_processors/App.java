package com.tuna.spring.bean_post_processors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
    	Message message = (Message) context.getBean("message");
    	message.getMessage();
    	
     	Text text = (Text) context.getBean("text");
    	text.getText();
    	
    	//Demo Spring Bean Definition:    	
    	Character character = (Character) context.getBean("character");
    	character.getCharacter1();
    	character.getCharacter4();
    	
    	
    	context.registerShutdownHook();
    }
}
