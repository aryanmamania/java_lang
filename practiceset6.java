public class practiceset6 {
    public static void main (String[] args){
        float[] marks = {45.7f , 353.9f , 24.8f , 13.9f , 89.6f };
        float sum=0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("the sum is "+ sum);
    }
}
