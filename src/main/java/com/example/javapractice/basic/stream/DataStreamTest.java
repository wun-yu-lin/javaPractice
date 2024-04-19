package com.example.javapractice.basic.stream;

import java.io.*;

public class DataStreamTest {
    record Member(String id, String name, int age) {

        public void save()throws Exception{
            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("member"+ id  +".dat"))){
                dos.writeUTF(id);
                dos.writeUTF(name);
                dos.writeInt(age);
            }
        }

        public  Member load () throws IOException {
            try(DataInputStream dis = new DataInputStream(new FileInputStream("member"+ id  +".dat"))){
               return new Member(dis.readUTF(), dis.readUTF(), dis.readInt());
                //在 load()方法中，使用 DataInputStream 包裹 FileInputStream ，並呼叫 readUTF()、readInt()分別讀入字串、int 型態
            }
        }

    }

    public static void main(String[] args) {
        Member member = new Member("001", "John", 30);
        try {
            member.save();
            Member r = member.load();
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
