package cn.anicert.grpc;

import cn.anicert.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * @author chenzuyi
 * @create 2019-11-12 13:39
 */
public class GrpcClient {

    private final ManagedChannel channel;

    public GrpcClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build());
    }

    public GrpcClient(ManagedChannel channel) {
        this.channel = channel;
    }

    private void shutdown() throws InterruptedException {
        if (channel != null) {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        GrpcClient grpcClient = new GrpcClient("localhost", 50051);

        StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.newBlockingStub(grpcClient.channel);
        StudentServiceGrpc.StudentServiceStub stub = StudentServiceGrpc.newStub(grpcClient.channel);
        MyResponse myResponse = blockingStub.getRealNameByUserName(MyRequest.newBuilder().setUsername("李四").build());
        System.out.println(myResponse.getRealname());

        System.out.println("-----------------------------");

        Iterator<StudentResponse> iterator = blockingStub.getStudentsByAge(StudentRequest.newBuilder().setAge(34).build());

        while (iterator.hasNext()) {
            StudentResponse studentResponse = iterator.next();
            System.out.println(studentResponse.getName() + "," + studentResponse.getAddr() + "," + studentResponse.getAge());
        }

        System.out.println("-----------------------------");

        StreamObserver<StudentResponseList> studentResponseListStreamObserver = new StreamObserver<StudentResponseList>() {
            @Override
            public void onNext(StudentResponseList value) {
                value.getStudentResponseList().forEach(studentResponse -> {
                    System.out.println("name:" + studentResponse.getName());
                    System.out.println("age:" + studentResponse.getAge());
                    System.out.println("addr:" + studentResponse.getAddr());
                    System.out.println("========");
                });
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("completed");
            }
        };

        StreamObserver<StudentRequest> studentRequestStreamObserver = stub.getStudentsBysAges(studentResponseListStreamObserver);
        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(20).build());
        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(30).build());
        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(40).build());

        studentRequestStreamObserver.onCompleted();

        Thread.sleep(50000);
    }

}
