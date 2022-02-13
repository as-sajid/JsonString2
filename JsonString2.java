import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonString2 {
    
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
         mapper.enable(SerializationFeature.INDENT_OUTPUT);
         /* using list*/
        List <String> shoppingList =new ArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("Sugar");
        String jsonString =mapper.writeValueAsString(shoppingList);
        System.out.println(jsonString);
        /* using Maps*/
        Map <String, String> capitalsMap = new HashMap<>();
        capitalsMap.put("France","Paris");
        capitalsMap.put("Spain","Madrid");
        jsonString = mapper.writeValueAsString(capitalsMap);
        System.out.println(jsonString);
        /* Object within an object*/
        Car car = new Car();
        car.model="Ford-F150";
        car.engine.cylinders=8;
        car.engine.hp=600;
        jsonString = mapper.writeValueAsString(car);
        System.out.println(jsonString);


    }
}
