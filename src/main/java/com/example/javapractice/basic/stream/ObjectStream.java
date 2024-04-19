package com.example.javapractice.basic.stream;

import java.io.*;

public class ObjectStream {
    record Member(String id, String name, int age) implements Serializable { //implement Serializable, 這只是個標記
        public void save() throws IOException {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(id + ".txt"))) {
                out.writeObject(this);
            }

        }

        public Member load(String id) throws IOException, ClassNotFoundException {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(id + ".txt"))) {
                return (Member) in.readObject();
            }
        }
    }

    public static void main(String[] args) {
        Member member = new Member("001", "John", 30);
        try {
            member.save();
            Member member1 = member.load("001");
            System.out.println(member1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
