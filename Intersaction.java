import java.util.HashSet;
import java.util.Set;

public class Intersaction {
        int intersactionSet(int[] a,int[] b)
        {
            Set<Integer> set = new HashSet<>();
            int count =0;
            for (int x : a){
                set.add(x);
            }
            for (int x : b){
                if(set.contains(x)){
                    count++;
                    set.remove(x);
                }

            }
            return count;
        }

        public static void main(String[] args)
        {
            Intersaction ob = new Intersaction();
            int[] a = {5,10,15,5};
            int[] b = {10,15,4,7,5};
            int c = ob.intersactionSet(a,b);
            System.out.println(""+c);

        }
    }




