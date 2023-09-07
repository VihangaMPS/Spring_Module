package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements GoodGirl {


//    @Autowired
//    Girl girl ;

    @Autowired
    GoodGirl girl;


    public Boy() {
        System.out.println("Boy Component");
    }

    public void chattingWithGirl(){
        girl.chat();
    }

    @Override
    public void chat() {

    }
}
