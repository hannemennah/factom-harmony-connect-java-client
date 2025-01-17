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
import harmony_connect_client.model.EntryListChain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EntryListData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-19T17:12:36.829940300-06:00[America/Chicago]")
public class EntryListData {
  public static final String SERIALIZED_NAME_ENTRY_HASH = "entry_hash";
  @SerializedName(SERIALIZED_NAME_ENTRY_HASH)
  private String entryHash;

  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private EntryListChain chain = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public EntryListData entryHash(String entryHash) {
    this.entryHash = entryHash;
    return this;
  }

   /**
   * The SHA256 Hash of this entry.
   * @return entryHash
  **/
  @ApiModelProperty(required = true, value = "The SHA256 Hash of this entry.")
  public String getEntryHash() {
    return entryHash;
  }

  public void setEntryHash(String entryHash) {
    this.entryHash = entryHash;
  }

  public EntryListData chain(EntryListChain chain) {
    this.chain = chain;
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @ApiModelProperty(required = true, value = "")
  public EntryListChain getChain() {
    return chain;
  }

  public void setChain(EntryListChain chain) {
    this.chain = chain;
  }

  public EntryListData createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which this entry was created. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ss.ssssssZ&#x60;
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The time at which this entry was created. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: `YYYY-MM-DDThh:mm:ss.ssssssZ`")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public EntryListData href(String href) {
    this.href = href;
    return this;
  }

   /**
   * An API link to retrieve all information about this entry.
   * @return href
  **/
  @ApiModelProperty(required = true, value = "An API link to retrieve all information about this entry.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryListData entryListData = (EntryListData) o;
    return Objects.equals(this.entryHash, entryListData.entryHash) &&
        Objects.equals(this.chain, entryListData.chain) &&
        Objects.equals(this.createdAt, entryListData.createdAt) &&
        Objects.equals(this.href, entryListData.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryHash, chain, createdAt, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryListData {\n");
    sb.append("    entryHash: ").append(toIndentedString(entryHash)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

