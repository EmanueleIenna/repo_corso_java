import org.example.CollectionUtilities;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class TestCollectionUtilities {


    @Test
    public void testingEvenAndOddCollection(){
        CollectionUtilities utilsTest = new CollectionUtilities();
        List<Integer> numbers = Arrays.asList(2,2,2,3,3);
        Map<String, List<Integer>> testedMap = utilsTest.getEvenAndOddMapFromIntsCOllection(numbers);
        testedMap.forEach(
                (k,v)->{
                    if (k.equalsIgnoreCase("Even")){
                        Assert.assertEquals(3, v.size());
                       v.forEach( (number)-> {
                           Assert.assertEquals(0, number%2);
                       });
                    } else {
                        Assert.assertTrue(k.equalsIgnoreCase("Odd"));
                        Assert.assertEquals(2, v.size());
                        v.forEach( (number)-> {
                            Assert.assertTrue( number%2 != 0);
                        });
                    }
                }
        );
    }

    @Test
    public void numberSumInStatisticIsRight(){
        CollectionUtilities testUtils = new CollectionUtilities();
        List<Integer> numbers = Arrays.asList(1,1,1,1);
        Map<String,Integer> testingMap = testUtils.printMaxMinAverageFromNumsCollection(numbers);

         Assert.assertEquals(Optional.of(4).get(),  testingMap.get("sommaNumeri") );
    }
}
