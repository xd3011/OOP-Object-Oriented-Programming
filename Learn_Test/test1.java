import java.util.ArrayList;
import java.util.List;
class test1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> dayso = new ArrayList<Integer>();
        dayso.add(1);
        dayso.add(2);
        dayso.add(3);
        dayso.add(4);
        dayso.add(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("STT " + (i + 1) + " : " +
                          dayso.remove((int)(Math.random() * (4 - i))) + "\n");
        }
    }
}