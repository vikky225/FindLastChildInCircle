
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindingLastChildMain {

    /* This method is used to eliminate child and finding last child using o(n*k) complexity */
    public static int executeElimination(int n, int k){
        int childindex = 0;

        List<Integer> childrens = IntStream.range(0,n)
                .boxed()
                .collect(Collectors.toList());
      
        System.out.println("Children eliminated in order: for n= "+n +" and k = " +k);
        while(childrens.size() > 1){
            childindex = (childindex + k - 1) % childrens.size();
            System.out.print(childrens.get(childindex) + " ");
            childrens.remove(childindex);
        }
        System.out.println();
        return childrens.get(0);
    }


    /*This method is to find last child who has not been eleminated using recursion o(n) Complexity*/
    static int executeRecursivelyForLastChildren(int n, int k)
    {
      return n==1 ?  0 :  (executeRecursivelyForLastChildren(n - 1, k) + k) % n ;

    }


    public static void main(String[] args){
        System.out.println("Children has been given id starting from 0 to n-1  \n");
        System.out.println("Last child id  with o(n*k) complexity : " + executeElimination(14, 2));
        System.out.println("Last child id with o(n) complexity: " + executeRecursivelyForLastChildren(14, 2));
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("Last child id with o(n*k) complexity : " + executeElimination(7, 3));
        System.out.println("Last child id with o(n) complexity: " + executeRecursivelyForLastChildren(7, 3));
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("Last child id with o(n*k) complexity : " + executeElimination(5, 2));
        System.out.println("Last child id with o(n) complexity: " + executeRecursivelyForLastChildren(5, 2));
        System.out.println("-----------------------------------------------------------------------------------");

    }
}