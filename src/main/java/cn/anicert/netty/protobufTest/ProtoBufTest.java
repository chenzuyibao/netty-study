package cn.anicert.netty.protobufTest;

import com.google.protobuf.InvalidProtocolBufferException;

import cn.anicert.netty.protobufTest.DataInfo.Student;

public class ProtoBufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {

        DataInfo.Student student = DataInfo.Student.newBuilder().setName("张三").setId(12).setAddress("北京").build();

        byte[] byteArray = student.toByteArray();

        Student student2 = DataInfo.Student.parseFrom(byteArray);

        System.out.println(student2.getName());
        System.out.println(student2.getId());
        System.out.println(student2.getAddress());

    }

}
