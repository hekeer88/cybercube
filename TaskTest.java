package cybercube;

import org.junit.jupiter.api.Test;
import java.util.Random;


public class TaskTest {

    @Test
    public void testOutputWithEmptyString() {

        String extraLetter = getRandomLetters(1);
        String s = "";
        String t = s + extraLetter;

        TaskOne task = new TaskOne(s, t);

        assert(task.getOutput().equals(extraLetter));
    }

    @Test
    public void testOutputWithShortString() {

        String extraLetter = getRandomLetters(1);
        String s = getRandomLetters(5);
        String t = s + extraLetter;

        TaskOne task = new TaskOne(s, t);

        assert(task.getOutput().equals(extraLetter));
    }

    @Test
    public void testOutputWithLongString() {

        String extraLetter = getRandomLetters(1);
        String s = getRandomLetters(999);
        String t = s + extraLetter;

        TaskOne task = new TaskOne(s, t);

        assert(task.getOutput().equals(extraLetter));
    }

    @Test
    public void testOutputWithRandomLetterAtRandomPosition() {

        String sOne = "abce";
        String tOne = "abcde";
        TaskOne taskOne = new TaskOne(sOne, tOne);
        assert(taskOne.getOutput().equals("d"));

        String sTwo = "aa";
        String tTwo = "aba";
        TaskOne taskTwo = new TaskOne(sTwo, tTwo);
        assert(taskTwo.getOutput().equals("b"));

        String sThree = "abc";
        String tThree = "aabc";
        TaskOne taskThree = new TaskOne(sThree, tThree);
        assert(taskThree.getOutput().equals("a"));
    }




    public String getRandomLetters(int numberOfLetters) {

        String result = "";

        Random r = new Random();

        for (int i = 0; i < numberOfLetters; i++) {
            char c = (char)(r.nextInt(26) + 'a');
            result += c;
        }
        return result;
    }

}
