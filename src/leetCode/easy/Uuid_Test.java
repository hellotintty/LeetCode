package leetCode.easy;


import java.lang.reflect.Field;

/**
 * @author tianqi
 * @date 2018/6/27
 */
public class Uuid_Test {
    public static void main(String[] arge) throws NoSuchFieldException {
        staticTest new1 = new staticTest();
        new1.speak();
        staticTest new2 = new staticTest();

        Field field = new1.getClass().getDeclaredField("a");
        System.out.println(field);
/**
 * UUID
 */
//        for (int i=0;i<6;i++){
//            UUID uuid = UUID.randomUUID();
//            String str = uuid.toString();
//            String uuidStr = str.replace("-", "");
//            System.out.println(uuidStr);
//        }
/**
 * 获取当前时间
 */
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        sdf.applyPattern("yyyy-MM-dd HH-mm-ss a");
//        Date date = new Date();
//        System.out.println(sdf.format(date));
//        String data = "2010-08-10 19:00";
//        String[] data1 = data.split("-");
//        String[] day = data1[2].split(" ");
//        Calendar c = Calendar.getInstance();
//        Date date1 = null;
//        date1 = c.getTime();
//        System.out.println(date1);
/**
 * 比较String,StringBuffer,StringBuilder的存储时间区别
 */
//        System.out.println("————————使用String创建字符串——————");
//        long startTime = System.currentTimeMillis();
//        String s1 = "";
//        for (int i =0;i<100000;i++){
//            s1 = s1+i;
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(s1);
//        System.out.println(s1.length());
//        System.out.println((endTime - startTime)+"毫秒");
//        System.out.println("————————使用StringBuffer创建字符串——————");
//        long start = System.currentTimeMillis();
//        StringBuffer s = new StringBuffer();
//        for (int i = 0;i<100000;i++){
//            s.append(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(s.toString());
//        System.out.println(s.length());
//        System.out.println((end - start)+"毫秒");
//        System.out.println("————————使用StringBuilder创建字符串——————");
//        long start1 = System.currentTimeMillis();
//        StringBuilder s2 = new StringBuilder();
//        for (int i = 0;i<100000;i++){
//            s2.append(i);
//        }
//        long end1 = System.currentTimeMillis();
//        System.out.println(s2.toString());
//        System.out.println((end1 - start1)+"毫秒");
    }
}
class father{
    public father(){
        System.out.println("父类构造函数");
    }
    static {
        System.out.println("父类static");
    }
    {
        System.out.println("父类构造代码块");
    }
    public void spe(){
        System.out.println("123");
    }
}
class staticTest extends father{
    public staticTest(){
        super();
        System.out.println("构造函数");
    }
    static {
        System.out.println("static");
    }
    {
        System.out.println("构造代码块");
    }
    int a = 3;
    public void speak(){
        System.out.println("speak");
    }
}