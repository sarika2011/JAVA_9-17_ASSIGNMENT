package Question3;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*Use rangeClosed to create a  Stream*/
public class Question_3 {

    //Use rangeClosed to create a  Stream
    public static void main(String[] args) {

        IntStream.rangeClosed(1,10)
                .forEach(System.out::println);
    }
}
