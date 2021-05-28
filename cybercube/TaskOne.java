package cybercube;

public class TaskOne {

    private String s;
    private String t;


    public TaskOne(String s, String t) {
        this.s = s;
        this.t = t;
    }

    public String getOutput() {
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sChar != tChar) {
                return String.valueOf(tChar);
            }
        }
        return t.substring(t.length() -1);
    }

}
