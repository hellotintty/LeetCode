package leetCode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author tianqi
 * @date 2018/9/29
 */
public class Main {

    public static void main(String[] arge){
        Scanner in = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        map.put("123","123");
        map.put("342","321");
        map.put(null,null);
        map.put("666","123");
        map.put("adf","123");
        map.put("123","425");
        System.out.println(map);
        while (true){
            double a = in.nextDouble();
            double b = in.nextDouble();
            System.out.println(a*b);
        }
    }
}
