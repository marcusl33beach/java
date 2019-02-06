/**
 * Count to 10 and skip 4
 */
public class Continue {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            // if to skip the number 4 or continue past 4
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
