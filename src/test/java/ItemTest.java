import org.junit.Assert;
import org.junit.Test;


public class ItemTest {
   @Test
   // tests how many lines there are (separated by ##)
    public void lineSeparationTest(){
        //given
        ItemParser itemParser = new ItemParser();
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##NAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016##";
        //when
        Integer actual = itemParser.lineSeparation(input).length;
        Integer expected = 3;
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    //tests actual line retrieval
    public void lineSeparation2Test(){
        //given
        ItemParser itemParser = new ItemParser();
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##NAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016##";
        //when
        String[] actual = itemParser.lineSeparation(input);
        String expected =  "naME:BreaD;price:1.23;type:Food;expiration:1/02/2016";
        //then
        Assert.assertEquals(expected,actual[1]);
    }

    @Test
    //tests separation of each key pair
    public void keyPairSeparationTest(){
        ItemParser itemParser = new ItemParser();
        //given
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##";
        String[] inputArray = itemParser.keyPairSeparation(input);
        //when
        Integer actual = inputArray.length;
        Integer expected = 4;
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void pairSeparationTest(){
        ItemParser itemParser = new ItemParser();
        //given
        String input = "naMe:Milk";
        String[] inputArray = itemParser.pairSeparation(input);
        //when
        Integer actual = inputArray.length;
        Integer expected = 2;
        //then
        Assert.assertEquals(expected,actual);
    }


}

