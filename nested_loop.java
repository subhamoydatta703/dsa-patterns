public class nested_loop {

    static void patt(int x){
        for(int i=0; i<x; i++){
            for(int j=0; j<x; j++){
                System.err.print("* ");
            }
            System.err.println();
        }
    }

    static void patt_2(int x){
        for(int i=0; i<x; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patt_3(int x){
        for(int i =1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patt_3(4);
    }
}
