import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo{
    public static void main(String[] args){
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().forEach(item->System.out.println(item));
        List<String> rsltList = 
            list.stream().filter(item->"b".equals(item)).map(item->item + "1").collect(Collectors.toList());
        System.out.println(rsltList);
    }
}