public class nested_loop {

    static void patt(int x){
        for(int i=0; i<x; i++){
            for(int j=0; j<x; j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        patt(4
        );
    }
}
