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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Workflow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T21:37:15.431Z")
public class Workflow {
  @SerializedName("workflowId")
  private String workflowId = null;

  @SerializedName("workflowName")
  private String workflowName = null;

  @SerializedName("registrationInstructions")
  private Object registrationInstructions = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("createdby")
  private String createdby = null;

  @SerializedName("creationTimestamp")
  private BigDecimal creationTimestamp = null;

  @SerializedName("version")
  private String version = null;

   /**
   * System generated id, which uniquely recongnizes a workflow.
   * @return workflowId
  **/
  @ApiModelProperty(value = "System generated id, which uniquely recongnizes a workflow.")
  public String getWorkflowId() {
    return workflowId;
  }

  public Workflow workflowName(String workflowName) {
    this.workflowName = workflowName;
    return this;
  }

   /**
   * Workfow name given as input from user while deploying the workflow.
   * @return workflowName
  **/
  @ApiModelProperty(value = "Workfow name given as input from user while deploying the workflow.")
  public String getWorkflowName() {
    return workflowName;
  }

  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }

  public Workflow registrationInstructions(Object registrationInstructions) {
    this.registrationInstructions = registrationInstructions;
    return this;
  }

   /**
   * Workfow registration instructions which could contains: - Name of already registered Airflow DAG - Cotent of python DAG file - etc By default this is Airflow DAG named &#x60;workflowName&#x60; 
   * @return registrationInstructions
  **/
  @ApiModelProperty(value = "Workfow registration instructions which could contains: - Name of already registered Airflow DAG - Cotent of python DAG file - etc By default this is Airflow DAG named `workflowName` ")
  public Object getRegistrationInstructions() {
    return registrationInstructions;
  }

  public void setRegistrationInstructions(Object registrationInstructions) {
    this.registrationInstructions = registrationInstructions;
  }

  public Workflow description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of workflow provided by user at time of creation of workflow.
   * @return description
  **/
  @ApiModelProperty(value = "Description of workflow provided by user at time of creation of workflow.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * System captured user info who created workflow.
   * @return createdby
  **/
  @ApiModelProperty(value = "System captured user info who created workflow.")
  public String getCreatedby() {
    return createdby;
  }

   /**
   * System date of creation of workflow.Epoch tiemstamp.
   * @return creationTimestamp
  **/
  @ApiModelProperty(value = "System date of creation of workflow.Epoch tiemstamp.")
  public BigDecimal getCreationTimestamp() {
    return creationTimestamp;
  }

   /**
   * Sematic versions of workflow. These numbers are assigned in increasing order and correspond to edits\\modifications to workflow definitions.
   * @return version
  **/
  @ApiModelProperty(value = "Sematic versions of workflow. These numbers are assigned in increasing order and correspond to edits\\modifications to workflow definitions.")
  public String getVersion() {
    return version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.workflowId, workflow.workflowId) &&
        Objects.equals(this.workflowName, workflow.workflowName) &&
        Objects.equals(this.registrationInstructions, workflow.registrationInstructions) &&
        Objects.equals(this.description, workflow.description) &&
        Objects.equals(this.createdby, workflow.createdby) &&
        Objects.equals(this.creationTimestamp, workflow.creationTimestamp) &&
        Objects.equals(this.version, workflow.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, workflowName, registrationInstructions, description, createdby, creationTimestamp, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    registrationInstructions: ").append(toIndentedString(registrationInstructions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdby: ").append(toIndentedString(createdby)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

