package bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl{
    public Girl() {
        System.out.println("Girl Component]");
    }

    public void chat(){
        System.out.println("Chatting");
    }
}
