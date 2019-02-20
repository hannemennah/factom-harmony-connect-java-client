/*
 * Harmony Connect
 * An easy to use API that helps you access the Factom blockchain.
 *
 * OpenAPI spec version: 1.0.17
 * Contact: harmony-support@factom.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package harmony_connect_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import harmony_connect_client.model.ChainDataDblock;
import harmony_connect_client.model.ChainDataEblock;
import harmony_connect_client.model.ChainDataEntries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChainData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-19T17:12:36.829940300-06:00[America/Chicago]")
public class ChainData {
  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_EXTERNAL_IDS = "external_ids";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDS)
  private List<String> externalIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_STAGE = "stage";
  @SerializedName(SERIALIZED_NAME_STAGE)
  private String stage;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private ChainDataEntries entries = null;

  public static final String SERIALIZED_NAME_EBLOCK = "eblock";
  @SerializedName(SERIALIZED_NAME_EBLOCK)
  private ChainDataEblock eblock = null;

  public static final String SERIALIZED_NAME_DBLOCK = "dblock";
  @SerializedName(SERIALIZED_NAME_DBLOCK)
  private ChainDataDblock dblock = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public ChainData chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * This is the unique identifier created for each chain.
   * @return chainId
  **/
  @ApiModelProperty(required = true, value = "This is the unique identifier created for each chain.")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public ChainData content(String content) {
    this.content = content;
    return this;
  }

   /**
   * This is the data that was stored in the first entry of this chain.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "This is the data that was stored in the first entry of this chain.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChainData externalIds(List<String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public ChainData addExternalIdsItem(String externalIdsItem) {
    this.externalIds.add(externalIdsItem);
    return this;
  }

   /**
   * Tags that have been used to identify this entry.
   * @return externalIds
  **/
  @ApiModelProperty(required = true, value = "Tags that have been used to identify this entry.")
  public List<String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(List<String> externalIds) {
    this.externalIds = externalIds;
  }

  public ChainData stage(String stage) {
    this.stage = stage;
    return this;
  }

   /**
   * The immutability stage that this chain has reached.
   * @return stage
  **/
  @ApiModelProperty(example = "replicated", required = true, value = "The immutability stage that this chain has reached.")
  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public ChainData entries(ChainDataEntries entries) {
    this.entries = entries;
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(required = true, value = "")
  public ChainDataEntries getEntries() {
    return entries;
  }

  public void setEntries(ChainDataEntries entries) {
    this.entries = entries;
  }

  public ChainData eblock(ChainDataEblock eblock) {
    this.eblock = eblock;
    return this;
  }

   /**
   * Get eblock
   * @return eblock
  **/
  @ApiModelProperty(required = true, value = "")
  public ChainDataEblock getEblock() {
    return eblock;
  }

  public void setEblock(ChainDataEblock eblock) {
    this.eblock = eblock;
  }

  public ChainData dblock(ChainDataDblock dblock) {
    this.dblock = dblock;
    return this;
  }

   /**
   * Get dblock
   * @return dblock
  **/
  @ApiModelProperty(required = true, value = "")
  public ChainDataDblock getDblock() {
    return dblock;
  }

  public void setDblock(ChainDataDblock dblock) {
    this.dblock = dblock;
  }

  public ChainData createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which this chain was created. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ss.ssssssZ&#x60; This will be null if the chain is not at least at the &#x60;factom&#x60; immutability stage.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The time at which this chain was created. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: `YYYY-MM-DDThh:mm:ss.ssssssZ` This will be null if the chain is not at least at the `factom` immutability stage.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainData chainData = (ChainData) o;
    return Objects.equals(this.chainId, chainData.chainId) &&
        Objects.equals(this.content, chainData.content) &&
        Objects.equals(this.externalIds, chainData.externalIds) &&
        Objects.equals(this.stage, chainData.stage) &&
        Objects.equals(this.entries, chainData.entries) &&
        Objects.equals(this.eblock, chainData.eblock) &&
        Objects.equals(this.dblock, chainData.dblock) &&
        Objects.equals(this.createdAt, chainData.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, content, externalIds, stage, entries, eblock, dblock, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainData {\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    eblock: ").append(toIndentedString(eblock)).append("\n");
    sb.append("    dblock: ").append(toIndentedString(dblock)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
