package cn.anicert.grpc;

import io.grpc.stub.StreamObserver;

/**
 * @author chenzuyi
 * @create 2019-11-12 10:55
 */
public class StudentServiceImpl /*extends StudentServiceGrpc.StudentServiceImplBase*/ {

    /*@Override
    public void getRealNameByUserName(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("接收客户端的请求：" + request.getUsername());

        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStudentsByAge(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println("接收客户端的请求：" + request.getAge());

        responseObserver.onNext(StudentResponse.newBuilder().setAge(13).setAddr("北京").setName("张三").build());
        responseObserver.onNext(StudentResponse.newBuilder().setAge(14).setAddr("上海").setName("里斯").build());
        responseObserver.onNext(StudentResponse.newBuilder().setAge(15).setAddr("广东").setName("网五月").build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StudentRequest> getStudentsBysAges(StreamObserver<StudentResponseList> responseObserver) {

        return new StreamObserver<StudentRequest>() {

            @Override
            public void onNext(StudentRequest value) {
                System.out.println("客户端流式传输：" + value);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("客户端传输错误" + t.getMessage());
            }

            @Override
            public void onCompleted() {
                StudentResponse studentResponse = StudentResponse.newBuilder().setAge(13).setAddr("北京").setName("张三").build();
                StudentResponse studentResponse2 = StudentResponse.newBuilder().setAge(23).setAddr("伤害").setName("里斯").build();

                StudentResponseList studentResponseList = StudentResponseList.newBuilder().addStudentResponse(studentResponse).addStudentResponse(studentResponse2).build();

                responseObserver.onNext(studentResponseList);
                responseObserver.onCompleted();
            }
        };

    }*/
}
