// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package cn.anicert.proto;

/**
 * Protobuf type {@code cn.anicert.netty.proto.StudentResponse}
 */
public  final class StudentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.anicert.netty.proto.StudentResponse)
    StudentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentResponse.newBuilder() to construct.
  private StudentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentResponse() {
    name_ = "";
    addr_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudentResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudentResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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
          case 10: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            age_ = input.readInt32();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            addr_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return StudentProto.internal_static_cn_anicert_netty_proto_StudentResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return StudentProto.internal_static_cn_anicert_netty_proto_StudentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            StudentResponse.class, StudentResponse.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @Override
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 2;
  private int age_;
  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  @Override
  public int getAge() {
    return age_;
  }

  public static final int ADDR_FIELD_NUMBER = 3;
  private volatile Object addr_;
  /**
   * <code>string addr = 3;</code>
   * @return The addr.
   */
  @Override
  public String getAddr() {
    Object ref = addr_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      addr_ = s;
      return s;
    }
  }
  /**
   * <code>string addr = 3;</code>
   * @return The bytes for addr.
   */
  @Override
  public com.google.protobuf.ByteString
      getAddrBytes() {
    Object ref = addr_;
    if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      addr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (age_ != 0) {
      output.writeInt32(2, age_);
    }
    if (!getAddrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, addr_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, age_);
    }
    if (!getAddrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, addr_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof StudentResponse)) {
      return super.equals(obj);
    }
    StudentResponse other = (StudentResponse) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getAge()
        != other.getAge()) return false;
    if (!getAddr()
        .equals(other.getAddr())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getAddr().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static StudentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StudentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StudentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StudentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StudentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StudentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StudentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StudentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static StudentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static StudentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static StudentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StudentResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(StudentResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code cn.anicert.netty.proto.StudentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.anicert.netty.proto.StudentResponse)
      StudentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StudentProto.internal_static_cn_anicert_netty_proto_StudentResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StudentProto.internal_static_cn_anicert_netty_proto_StudentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StudentResponse.class, StudentResponse.Builder.class);
    }

    // Construct using cn.anicert.proto.StudentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      name_ = "";

      age_ = 0;

      addr_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return StudentProto.internal_static_cn_anicert_netty_proto_StudentResponse_descriptor;
    }

    @Override
    public StudentResponse getDefaultInstanceForType() {
      return StudentResponse.getDefaultInstance();
    }

    @Override
    public StudentResponse build() {
      StudentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public StudentResponse buildPartial() {
      StudentResponse result = new StudentResponse(this);
      result.name_ = name_;
      result.age_ = age_;
      result.addr_ = addr_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof StudentResponse) {
        return mergeFrom((StudentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(StudentResponse other) {
      if (other == StudentResponse.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (!other.getAddr().isEmpty()) {
        addr_ = other.addr_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      StudentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (StudentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

        name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {

        name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        name_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @Override
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 2;</code>
     * @param value The age to set.
     * @return This builder for chaining.
     */
    public Builder setAge(int value) {

        age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAge() {

        age_ = 0;
      onChanged();
      return this;
    }

    private Object addr_ = "";
    /**
     * <code>string addr = 3;</code>
     * @return The addr.
     */
    @Override
    public String getAddr() {
      Object ref = addr_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        addr_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string addr = 3;</code>
     * @return The bytes for addr.
     */
    @Override
    public com.google.protobuf.ByteString
        getAddrBytes() {
      Object ref = addr_;
      if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        addr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string addr = 3;</code>
     * @param value The addr to set.
     * @return This builder for chaining.
     */
    public Builder setAddr(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

        addr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string addr = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddr() {

        addr_ = getDefaultInstance().getAddr();
      onChanged();
      return this;
    }
    /**
     * <code>string addr = 3;</code>
     * @param value The bytes for addr to set.
     * @return This builder for chaining.
     */
    public Builder setAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        addr_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cn.anicert.netty.proto.StudentResponse)
  }

  // @@protoc_insertion_point(class_scope:cn.anicert.netty.proto.StudentResponse)
  private static final StudentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StudentResponse();
  }

  public static StudentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentResponse>
      PARSER = new com.google.protobuf.AbstractParser<StudentResponse>() {
    @Override
    public StudentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<StudentResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public StudentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

