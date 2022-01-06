/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RegisterAcl;
import io.swagger.client.model.RegisterData;
import io.swagger.client.model.RegisterLegal;
import java.io.IOException;

/**
 * RegisterRecord
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T21:56:39.476Z")
public class RegisterRecord {
  @SerializedName("id")
  private String id = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("acl")
  private RegisterAcl acl = null;

  @SerializedName("legal")
  private RegisterLegal legal = null;

  @SerializedName("data")
  private RegisterData data = null;

  public RegisterRecord id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RegisterRecord kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public RegisterRecord acl(RegisterAcl acl) {
    this.acl = acl;
    return this;
  }

   /**
   * Get acl
   * @return acl
  **/
  @ApiModelProperty(value = "")
  public RegisterAcl getAcl() {
    return acl;
  }

  public void setAcl(RegisterAcl acl) {
    this.acl = acl;
  }

  public RegisterRecord legal(RegisterLegal legal) {
    this.legal = legal;
    return this;
  }

   /**
   * Get legal
   * @return legal
  **/
  @ApiModelProperty(value = "")
  public RegisterLegal getLegal() {
    return legal;
  }

  public void setLegal(RegisterLegal legal) {
    this.legal = legal;
  }

  public RegisterRecord data(RegisterData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public RegisterData getData() {
    return data;
  }

  public void setData(RegisterData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterRecord registerRecord = (RegisterRecord) o;
    return Objects.equals(this.id, registerRecord.id) &&
        Objects.equals(this.kind, registerRecord.kind) &&
        Objects.equals(this.acl, registerRecord.acl) &&
        Objects.equals(this.legal, registerRecord.legal) &&
        Objects.equals(this.data, registerRecord.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, acl, legal, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

