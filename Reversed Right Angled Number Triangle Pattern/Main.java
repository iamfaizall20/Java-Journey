//Reversed Right-Angled Number Triangle
public class Main {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
Expected Output:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */