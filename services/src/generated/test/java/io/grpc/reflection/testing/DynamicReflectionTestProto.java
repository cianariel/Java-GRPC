// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/reflection/testing/dynamic_reflection_test.proto

package io.grpc.reflection.testing;

public final class DynamicReflectionTestProto {
  private DynamicReflectionTestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8io/grpc/reflection/testing/dynamic_ref" +
      "lection_test.proto\022\027grpc.reflection.test" +
      "ing\032Bio/grpc/reflection/testing/dynamic_" +
      "reflection_test_depth_two.proto2l\n\016Dynam" +
      "icService\022Z\n\006Method\022\'.grpc.reflection.te" +
      "sting.DynamicRequest\032%.grpc.reflection.t" +
      "esting.DynamicReply\"\0002s\n\025AnotherDynamicS" +
      "ervice\022Z\n\006Method\022\'.grpc.reflection.testi" +
      "ng.DynamicRequest\032%.grpc.reflection.test" +
      "ing.DynamicReply\"\000B:\n\032io.grpc.reflection",
      ".testingB\032DynamicReflectionTestProtoP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grpc.reflection.testing.DynamicReflectionTestDepthTwoProto.getDescriptor(),
        }, assigner);
    io.grpc.reflection.testing.DynamicReflectionTestDepthTwoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
