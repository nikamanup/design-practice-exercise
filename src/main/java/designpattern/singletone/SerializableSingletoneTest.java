package designpattern.singletone;

import java.io.*;

public class SerializableSingletoneTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingletone serializableSingletone= SerializableSingletone.getInstance();
        ObjectOutput output=new ObjectOutputStream(new FileOutputStream("filename.ser"));
        output.writeObject(serializableSingletone);
        output.close();

        ObjectInput in=new ObjectInputStream(new FileInputStream(("filename.ser")));
        SerializableSingletone serializableSingletone1= (SerializableSingletone) in.readObject();
        in.close();
        System.out.println("Before Serialization"+serializableSingletone.hashCode());
        System.out.println("After Serialization"+serializableSingletone1.hashCode());
    }
}
