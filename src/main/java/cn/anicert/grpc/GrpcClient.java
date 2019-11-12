package cn.anicert.grpc;

import cn.anicert.proto.MyRequest;
import cn.anicert.proto.MyResponse;
import cn.anicert.proto.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

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

    public static void main(String[] args) {
        GrpcClient grpcClient = new GrpcClient("localhost", 50051);

        StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.newBlockingStub(grpcClient.channel);
        MyResponse myResponse = blockingStub.getRealNameByUserName(MyRequest.newBuilder().setUsername("李四").build());
        System.out.println(myResponse.getRealname());

    }

}
