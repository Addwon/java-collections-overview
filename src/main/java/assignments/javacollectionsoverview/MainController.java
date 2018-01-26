package assignments.javacollectionsoverview;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MainController {
    @RequestMapping("/getnumber")

    public String collectionOverview(@RequestParam("number") int num){
        String collectedNums="";
        ArrayList temperatureList=new ArrayList();

        temperatureList.add(num);

        collectedNums+=temperatureList+"<br/>";

        return collectedNums;
    }


}
