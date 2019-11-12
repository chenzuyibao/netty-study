package cn.anicert.grpc;

import cn.anicert.proto.MyRequest;
import cn.anicert.proto.MyResponse;
import cn.anicert.proto.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @author chenzuyi
 * @create 2019-11-12 10:55
 */
public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getRealNameByUserName(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("接收客户端的请求：" + request.getUsername());

        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());
        responseObserver.onCompleted();
    }
}
