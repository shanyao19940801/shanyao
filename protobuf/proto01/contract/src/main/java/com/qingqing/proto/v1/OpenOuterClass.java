// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/Open.proto

package com.qingqing.proto.v1;

public final class OpenOuterClass {
  private OpenOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OpenOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Open)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string qingqing_test = 1;</code>
     */
    boolean hasQingqingTest();
    /**
     * <code>optional string qingqing_test = 1;</code>
     */
    java.lang.String getQingqingTest();
    /**
     * <code>optional string qingqing_test = 1;</code>
     */
    com.google.protobuf.ByteString
        getQingqingTestBytes();

    /**
     * <code>optional int32 page_number = 2;</code>
     */
    boolean hasPageNumber();
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    int getPageNumber();
  }
  /**
   * Protobuf type {@code Open}
   */
  public  static final class Open extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Open)
      OpenOrBuilder {
    // Use Open.newBuilder() to construct.
    private Open(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private Open() {
      qingqingTest_ = "";
      pageNumber_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Open(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              qingqingTest_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              pageNumber_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.qingqing.proto.v1.OpenOuterClass.internal_static_Open_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.qingqing.proto.v1.OpenOuterClass.internal_static_Open_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.qingqing.proto.v1.OpenOuterClass.Open.class, com.qingqing.proto.v1.OpenOuterClass.Open.Builder.class);
    }

    private int bitField0_;
    public static final int QINGQING_TEST_FIELD_NUMBER = 1;
    private volatile java.lang.Object qingqingTest_;
    /**
     * <code>optional string qingqing_test = 1;</code>
     */
    public boolean hasQingqingTest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string qingqing_test = 1;</code>
     */
    public java.lang.String getQingqingTest() {
      java.lang.Object ref = qingqingTest_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          qingqingTest_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string qingqing_test = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQingqingTestBytes() {
      java.lang.Object ref = qingqingTest_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        qingqingTest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
    private int pageNumber_;
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    public boolean hasPageNumber() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getQingqingTestBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, pageNumber_);
      }
      unknownFields.writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getQingqingTestBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, pageNumber_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.qingqing.proto.v1.OpenOuterClass.Open parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.qingqing.proto.v1.OpenOuterClass.Open prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Open}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Open)
        com.qingqing.proto.v1.OpenOuterClass.OpenOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.qingqing.proto.v1.OpenOuterClass.internal_static_Open_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.qingqing.proto.v1.OpenOuterClass.internal_static_Open_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.qingqing.proto.v1.OpenOuterClass.Open.class, com.qingqing.proto.v1.OpenOuterClass.Open.Builder.class);
      }

      // Construct using com.qingqing.proto.v1.OpenOuterClass.Open.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        qingqingTest_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        pageNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.qingqing.proto.v1.OpenOuterClass.internal_static_Open_descriptor;
      }

      public com.qingqing.proto.v1.OpenOuterClass.Open getDefaultInstanceForType() {
        return com.qingqing.proto.v1.OpenOuterClass.Open.getDefaultInstance();
      }

      public com.qingqing.proto.v1.OpenOuterClass.Open build() {
        com.qingqing.proto.v1.OpenOuterClass.Open result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.qingqing.proto.v1.OpenOuterClass.Open buildPartial() {
        com.qingqing.proto.v1.OpenOuterClass.Open result = new com.qingqing.proto.v1.OpenOuterClass.Open(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.qingqingTest_ = qingqingTest_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.pageNumber_ = pageNumber_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.qingqing.proto.v1.OpenOuterClass.Open) {
          return mergeFrom((com.qingqing.proto.v1.OpenOuterClass.Open)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.qingqing.proto.v1.OpenOuterClass.Open other) {
        if (other == com.qingqing.proto.v1.OpenOuterClass.Open.getDefaultInstance()) return this;
        if (other.hasQingqingTest()) {
          bitField0_ |= 0x00000001;
          qingqingTest_ = other.qingqingTest_;
          onChanged();
        }
        if (other.hasPageNumber()) {
          setPageNumber(other.getPageNumber());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.qingqing.proto.v1.OpenOuterClass.Open parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.qingqing.proto.v1.OpenOuterClass.Open) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object qingqingTest_ = "";
      /**
       * <code>optional string qingqing_test = 1;</code>
       */
      public boolean hasQingqingTest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string qingqing_test = 1;</code>
       */
      public java.lang.String getQingqingTest() {
        java.lang.Object ref = qingqingTest_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            qingqingTest_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string qingqing_test = 1;</code>
       */
      public com.google.protobuf.ByteString
          getQingqingTestBytes() {
        java.lang.Object ref = qingqingTest_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          qingqingTest_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string qingqing_test = 1;</code>
       */
      public Builder setQingqingTest(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        qingqingTest_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string qingqing_test = 1;</code>
       */
      public Builder clearQingqingTest() {
        bitField0_ = (bitField0_ & ~0x00000001);
        qingqingTest_ = getDefaultInstance().getQingqingTest();
        onChanged();
        return this;
      }
      /**
       * <code>optional string qingqing_test = 1;</code>
       */
      public Builder setQingqingTestBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        qingqingTest_ = value;
        onChanged();
        return this;
      }

      private int pageNumber_ ;
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public boolean hasPageNumber() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public int getPageNumber() {
        return pageNumber_;
      }
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public Builder setPageNumber(int value) {
        bitField0_ |= 0x00000002;
        pageNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public Builder clearPageNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pageNumber_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Open)
    }

    // @@protoc_insertion_point(class_scope:Open)
    private static final com.qingqing.proto.v1.OpenOuterClass.Open DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.qingqing.proto.v1.OpenOuterClass.Open();
    }

    public static com.qingqing.proto.v1.OpenOuterClass.Open getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<Open> PARSER =
        new com.google.protobuf.AbstractParser<Open>() {
      public Open parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Open(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Open> getParserForType() {
      return PARSER;
    }

    public com.qingqing.proto.v1.OpenOuterClass.Open getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Open_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Open_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020proto/Open.proto\"2\n\004Open\022\025\n\rqingqing_t" +
      "est\030\001 \001(\t\022\023\n\013page_number\030\002 \001(\005B\027\n\025com.qi" +
      "ngqing.proto.v1"
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
        }, assigner);
    internal_static_Open_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Open_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Open_descriptor,
        new java.lang.String[] { "QingqingTest", "PageNumber", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
