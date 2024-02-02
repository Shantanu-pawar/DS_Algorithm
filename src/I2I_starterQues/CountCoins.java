package I2I_starterQues;

public class CountCoins {
    public static void main(String[] args) {
        int n = 500;
        int change  = 360;

        int rs1cnt = 0; int rs2cnt = 0;
        int rs5cnt = 0; int rs50cnt = 0;

        while(change > 0){
            if(change > 50){
                rs50cnt++; change -= 50;
            }

            else if(change > 5) {
                rs5cnt++; change -= 5;
            }

            else if(change > 2){
                rs2cnt++; change -= 2;
            }

            else {
                rs1cnt++; change -= 1;
            }
        }

        System.out.println("we have 50 rs coins : " + rs50cnt +
                "\n we have 5 rs coins : " + rs5cnt +
                "\n  we have 2 rs coins : " + rs2cnt +
                "\n  and we have 1rs coins : " + rs1cnt );
    }
}
