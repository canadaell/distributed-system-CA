// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Sensor.proto

package grpc.SensorService;

public final class SensorProto {
  private SensorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SensorService_SensorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SensorService_SensorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SensorService_SensorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SensorService_SensorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SensorService_AddSensorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SensorService_AddSensorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SensorService_AddSensorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SensorService_AddSensorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Sensor.proto\022\rSensorService\"\036\n\rSensorR" +
      "equest\022\r\n\005start\030\001 \001(\010\"\202\001\n\016SensorResponse" +
      "\022\016\n\006farmid\030\001 \001(\005\022\020\n\010sensorid\030\002 \001(\005\022\022\n\ndi" +
      "strictid\030\003 \001(\005\022\022\n\ntempreture\030\004 \001(\001\022\020\n\010hu" +
      "midity\030\005 \001(\005\022\024\n\014illumination\030\006 \001(\005\"L\n\020Ad" +
      "dSensorRequest\022\020\n\010sensorid\030\001 \001(\005\022\022\n\nsens" +
      "ortype\030\002 \001(\t\022\022\n\ndistrictid\030\003 \001(\005\"5\n\021AddS" +
      "ensorResponse\022\017\n\007success\030\001 \001(\010\022\017\n\007messag" +
      "e\030\002 \001(\t2\262\001\n\rSensorService\022Q\n\020StreamSenso" +
      "rData\022\034.SensorService.SensorRequest\032\035.Se" +
      "nsorService.SensorResponse0\001\022N\n\tAddSenso" +
      "r\022\037.SensorService.AddSensorRequest\032 .Sen" +
      "sorService.AddSensorResponseB#\n\022grpc.Sen" +
      "sorServiceB\013SensorProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SensorService_SensorRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SensorService_SensorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SensorService_SensorRequest_descriptor,
        new java.lang.String[] { "Start", });
    internal_static_SensorService_SensorResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SensorService_SensorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SensorService_SensorResponse_descriptor,
        new java.lang.String[] { "Farmid", "Sensorid", "Districtid", "Tempreture", "Humidity", "Illumination", });
    internal_static_SensorService_AddSensorRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SensorService_AddSensorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SensorService_AddSensorRequest_descriptor,
        new java.lang.String[] { "Sensorid", "Sensortype", "Districtid", });
    internal_static_SensorService_AddSensorResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SensorService_AddSensorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SensorService_AddSensorResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
