// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_web.proto

package com.obctech.growbe.proto.serviceweb;

public final class ServiceWeb {
  private ServiceWeb() {}
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
      "\n\021service_web.proto\022\006client\032\020serre_data." +
      "proto\032\016app_data.proto2\365\007\n\017GrowbeClientAP" +
      "I\022:\n\017GetLatestReport\022\016.client.Wanted\032\027.c" +
      "lient.SerreDataReport\022>\n\017GetReportsRange" +
      "\022\021.client.GapReport\032\030.client.SerreDataRe" +
      "ports\022:\n\016GetLatestError\022\016.client.Wanted\032" +
      "\030.client.SerreErrorReport\0228\n\013GetAllError" +
      "\022\016.client.Wanted\032\031.client.SerreErrorRepo" +
      "rts\022=\n\013GetErrorAll\022\023.client.NullMessage\032" +
      "\031.client.SerreErrorReports\0224\n\010GetState\022\016",
      ".client.Wanted\032\030.client.SerreStateReport" +
      "\0221\n\010GetSerre\022\016.client.Wanted\032\025.client.Re" +
      "gisterSerre\0225\n\013GetAllSerre\022\016.client.Want" +
      "ed\032\026.client.RegisterSerres\022-\n\006GetHub\022\016.c" +
      "lient.Wanted\032\023.client.RegisterHub\0226\n\tGet" +
      "AllHub\022\023.client.NullMessage\032\024.client.Reg" +
      "isterHubs\022@\n\021SetReportSettings\022\026.client." +
      "ReportSettings\032\023.client.NullMessage\022C\n\020S" +
      "etGrowingProfil\022\032.client.SerreGrowingPro" +
      "fil\032\023.client.NullMessage\022>\n\020SetLightSett",
      "ings\022\025.client.LightSettings\032\023.client.Nul" +
      "lMessage\022D\n\023SetSerreHubSettings\022\030.client" +
      ".SerreHubSettings\032\023.client.NullMessage\022A" +
      "\n\tAddNewHub\022\025.client.NewHubMessage\032\035.cli" +
      "ent.NewSerreReturnMessage\022Z\n\022AddNewContr" +
      "olBoard\022\036.client.NewControlBoardMessage\032" +
      "$.client.NewControlBoardReturnMessage2\270\003" +
      "\n\014GrowbeHubAPI\0229\n\010SetState\022\030.client.Serr" +
      "eStateReport\032\023.client.NullMessage\0229\n\tAdd" +
      "Report\022\027.client.SerreDataReport\032\023.client",
      ".NullMessage\0229\n\010AddError\022\030.client.SerreE" +
      "rrorReport\032\023.client.NullMessage\022;\n\021GetRe" +
      "portSettings\022\016.client.Wanted\032\026.client.Re" +
      "portSettings\022>\n\020GetGrowingProfil\022\016.clien" +
      "t.Wanted\032\032.client.SerreGrowingProfil\0229\n\020" +
      "GetLightSettings\022\016.client.Wanted\032\025.clien" +
      "t.LightSettings\022?\n\023GetSerreHubSettings\022\016" +
      ".client.Wanted\032\030.client.SerreHubSettings" +
      "B-\n#com.obctech.growbe.proto.servicewebZ" +
      "\006clientb\006proto3"
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
          com.obctech.growbe.proto.serre.SerreData.getDescriptor(),
          com.obctech.growbe.proto.app.AppData.getDescriptor(),
        }, assigner);
    com.obctech.growbe.proto.serre.SerreData.getDescriptor();
    com.obctech.growbe.proto.app.AppData.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
