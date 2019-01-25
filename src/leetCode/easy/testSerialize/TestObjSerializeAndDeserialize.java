package leetCode.easy.testSerialize;

import leetCode.easy.templeTest.Person;

import java.io.*;
import java.text.MessageFormat;

/**
 * @author tianqi
 * @date 2019/1/24
 * 1.多个对象，用EOFException来判断结束
 */
public class TestObjSerializeAndDeserialize {


/*    对象序列化包括如下步骤：
      1） 创建一个对象输出流，它可以包装一个其他类型的目标输出流，如文件输出流；
      2） 通过对象输出流的writeObject()方法写对象。*/
    private static void SerializePerson() throws IOException {
        Person person = new Person();
        person.setAge(23);
        person.setName("张天麒");
        person.setSex("男");
        Person person1 = new Person();
        person1.setAge(33);
        person1.setName("hellotintty");
        person1.setSex("男");
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E://Person.txt")));
        oo.writeObject(person);
        oo.writeObject(person1);
        System.out.println("对象序列化完成");
        oo.close();
    }


/*   对象反序列化的步骤如下：
     1） 创建一个对象输入流，它可以包装一个其他类型的源输入流，如文件输入流；
     2） 通过对象输入流的readObject()方法读取对象。*/
    private static void DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E://Person.txt")));
        try {
            while (true){
                Person person = (Person) ois.readObject();
                System.out.println(MessageFormat.format("name={0},age={1},sex={2}", person.getName(),person.getAge(),person.getSex()));
            }
        }catch (EOFException e){

        }
        finally {
            System.out.println("对象反序列化完成");
            ois.close();
        }
    }

    public static void main(String[] arge) throws IOException, ClassNotFoundException {
        SerializePerson();
        DeserializePerson();
    }
}
