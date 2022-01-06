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
import io.swagger.client.model.LegalTagInvalidResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection invalid LegalTags.
 */
@ApiModel(description = "Represents a collection invalid LegalTags.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:02:41.200Z")
public class LegalTagInvalidResponseList {
  @SerializedName("invalidLegalTags")
  private List<LegalTagInvalidResponse> invalidLegalTags = null;

  public LegalTagInvalidResponseList invalidLegalTags(List<LegalTagInvalidResponse> invalidLegalTags) {
    this.invalidLegalTags = invalidLegalTags;
    return this;
  }

  public LegalTagInvalidResponseList addInvalidLegalTagsItem(LegalTagInvalidResponse invalidLegalTagsItem) {
    if (this.invalidLegalTags == null) {
      this.invalidLegalTags = new ArrayList<LegalTagInvalidResponse>();
    }
    this.invalidLegalTags.add(invalidLegalTagsItem);
    return this;
  }

   /**
   * A collection of invalid LegalTags.
   * @return invalidLegalTags
  **/
  @ApiModelProperty(value = "A collection of invalid LegalTags.")
  public List<LegalTagInvalidResponse> getInvalidLegalTags() {
    return invalidLegalTags;
  }

  public void setInvalidLegalTags(List<LegalTagInvalidResponse> invalidLegalTags) {
    this.invalidLegalTags = invalidLegalTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalTagInvalidResponseList legalTagInvalidResponseList = (LegalTagInvalidResponseList) o;
    return Objects.equals(this.invalidLegalTags, legalTagInvalidResponseList.invalidLegalTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidLegalTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalTagInvalidResponseList {\n");
    
    sb.append("    invalidLegalTags: ").append(toIndentedString(invalidLegalTags)).append("\n");
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

