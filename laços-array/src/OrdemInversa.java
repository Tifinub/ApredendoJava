public class OrdemInversa {

    public static void main(String[] args) throws Exception {
        int[] array = {10, 20, 30, 25, 50};

        for(int x = array.length-1; x >= 0; x--){
            System.out.println(array[x]);
        }
    }

}