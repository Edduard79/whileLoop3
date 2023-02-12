public class Tester {
    public static void main(String[] args){

        int i = 0;
        int j1 = 0;
        int j2 = j1 + 1;

        while(i < 10){

            int j3 = j1 + j2;

            System.out.println(j3 + " " + i);

            j1 = j2;
            j2 = j3;

            i++;
        }

    }
}
