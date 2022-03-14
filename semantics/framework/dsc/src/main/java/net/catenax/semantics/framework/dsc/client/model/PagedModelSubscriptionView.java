/*
 * Dataspace Connector
 * IDS Connector originally developed by the Fraunhofer ISST
 *
 * OpenAPI spec version: 6.2.0
 * Contact: info@dataspace-connector.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.catenax.semantics.framework.dsc.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PagedModelSubscriptionView
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-08T16:15:16.333286600+02:00[Europe/Berlin]")
public class PagedModelSubscriptionView {
  @JsonProperty("_embedded")
  private PagedModelSubscriptionViewEmbedded _embedded = null;

  @JsonProperty("_links")
  private Links _links = null;

  @JsonProperty("page")
  private PageMetadata page = null;

  public PagedModelSubscriptionView _embedded(PagedModelSubscriptionViewEmbedded _embedded) {
    this._embedded = _embedded;
    return this;
  }

   /**
   * Get _embedded
   * @return _embedded
  **/
  @Schema(description = "")
  public PagedModelSubscriptionViewEmbedded getEmbedded() {
    return _embedded;
  }

  public void setEmbedded(PagedModelSubscriptionViewEmbedded _embedded) {
    this._embedded = _embedded;
  }

  public PagedModelSubscriptionView _links(Links _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public Links getLinks() {
    return _links;
  }

  public void setLinks(Links _links) {
    this._links = _links;
  }

  public PagedModelSubscriptionView page(PageMetadata page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public PageMetadata getPage() {
    return page;
  }

  public void setPage(PageMetadata page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedModelSubscriptionView pagedModelSubscriptionView = (PagedModelSubscriptionView) o;
    return Objects.equals(this._embedded, pagedModelSubscriptionView._embedded) &&
        Objects.equals(this._links, pagedModelSubscriptionView._links) &&
        Objects.equals(this.page, pagedModelSubscriptionView.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_embedded, _links, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedModelSubscriptionView {\n");
    
    sb.append("    _embedded: ").append(toIndentedString(_embedded)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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