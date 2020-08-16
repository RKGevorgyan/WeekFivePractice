import java.sql.SQLOutput;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int x,a,b,t,swap=0,comparison=0;
        long time;

        // Getting length of array
        System.out.println("Введите размерность массива:");
        Scanner scanner = new Scanner(System.in);
        x=scanner.nextInt();

        int [] nums = new int[x];
        for (int i = 0; i<x;i++){
            nums[i]=(int)(Math.random()*10);
        }

        time=System.currentTimeMillis();
        // bubble sort
        for (a=1;a<nums.length;a++)
            for (b=nums.length-1;b>=a;b--){
                comparison++;
                if (nums[b-1]>nums[b]){
                    swap++;
                    t=nums[b-1];
                    nums[b-1]=nums[b];
                    nums[b]= t;
                }
            }
        System.out.println("Скорость сортировки в мс: "+(System.currentTimeMillis()-time));
        System.out.println("Количество перестановок: "+swap);
        System.out.println("Количество сравнений: " + comparison);

    }
}
