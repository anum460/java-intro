public class Introduction {

    public static void main(String[] args){
        
        System.out.println("Hello World - Anum Irfan the new Developer!");

        int x;
        int y;
        int z;
        x=5;
        y=10;
        z=x+y;
        System.out.println(z);

        int evenNumCount = 0;
        int num = 1;
        while(evenNumCount < 11){
            if(num % 2 == 0){
                evenNumCount = evenNumCount + 1;
                System.out.println(num);
            }
            num = num + 1;
            
        }

    }
}
