package testerClasses;

public class as {

    public static void main(String[] args) {
        int n =22;
        int r=0;
        int e=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                r=r+1;
                e++;
            }
            r=r+1;
        }
        System.out.println(r);
        System.out.print(e);

    }
}
