/*
 *
 */
package com.catenax.tdm.model.v1;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

// TODO: Auto-generated Javadoc
/**
 * Material.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-14T13:39:46.417Z[GMT]")

@Entity
@Table(name = "aspect_material")
public class Material {

	/** The db id. */
	@Id
	@GeneratedValue
	@JsonIgnore
	private Long dbId;

	/** The material details. */
	@JsonProperty("materialDetails")
	@OneToOne
	private MaterialCharacteristic materialDetails = null;

	/**
	 * Equals.
	 *
	 * @param o the o
	 * @return true, if successful
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		final Material material = (Material) o;
		return Objects.equals(this.materialDetails, material.materialDetails);
	}

	/**
	 * Gets the db id.
	 *
	 * @return the db id
	 */
	public Long getDbId() {
		return dbId;
	}

	/**
	 * Get materialDetails.
	 *
	 * @return materialDetails
	 */
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public MaterialCharacteristic getMaterialDetails() {
		return materialDetails;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(materialDetails);
	}

	/**
	 * Material details.
	 *
	 * @param materialDetails the material details
	 * @return the material
	 */
	public Material materialDetails(MaterialCharacteristic materialDetails) {
		this.materialDetails = materialDetails;
		return this;
	}

	/**
	 * Sets the db id.
	 *
	 * @param dbId the new db id
	 */
	public void setDbId(Long dbId) {
		this.dbId = dbId;
	}

	/**
	 * Sets the material details.
	 *
	 * @param materialDetails the new material details
	 */
	public void setMaterialDetails(MaterialCharacteristic materialDetails) {
		this.materialDetails = materialDetails;
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 *
	 * @param o the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("class Material {\n");

		sb.append("    materialDetails: ").append(toIndentedString(materialDetails)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
