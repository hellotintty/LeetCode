package leetCode.easy.testSerialize;

import leetCode.easy.templeTest.Person;

import java.io.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tianqi
 * @date 2019/1/25
 * 2.用容器存进再取出容器
 */
public class TestObjSerializeAndDeserialize2 {
    private static void SerializePerson() throws IOException {
        Person person = new Person();
        person.setAge(23);
        person.setName("张天麒");
        person.setSex("男");
        Person person1 = new Person();
        person1.setAge(33);
        person1.setName("hellotintty");
        person1.setSex("男");
        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(person1);
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E://Person.txt")));
        oo.writeObject(list);
        System.out.println("对象序列化完成");
        oo.close();
    }

    private static ArrayList DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E://Person.txt")));
        ArrayList<Person> list = (ArrayList) ois.readObject();
        System.out.println("对象反序列化完成");
        ois.close();
        return list;
    }

    public static void main(String[] arge) throws IOException, ClassNotFoundException {
        SerializePerson();
        ArrayList<Person> list = (ArrayList)DeserializePerson();
        for (int i = 0;i<list.size();i++){
            Person person = list.get(i);
            System.out.println(MessageFormat.format("name={0},age={1},sex={2}", person.getName(),person.getAge(),person.getSex()));
        }
    }
}

