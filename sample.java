package com.squaretrade.domain;

import static com.squaretrade.domain.util.STUtils.DEFAULT_PRECISION;
import static com.squaretrade.domain.util.STUtils.DEFAULT_SCALE;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/*
CREATE TABLE "public"."product_definition"
(
   id text PRIMARY KEY NOT NULL,
   internal_product_id text NOT NULL,
   display_name text NOT NULL,
   product_definition_version_start_date timestamp NOT NULL,
   product_definition_version_end_date timestamp,
   product_definition_version_number smallint,
   product_definition_group_id text NOT NULL,
   category_id text NOT NULL,
   resale_category text NOT NULL,
   item_condition text NOT NULL,
   min_item_price numeric(15,2) NOT NULL,
   min_item_price_currency_code text NOT NULL,
   max_item_price numeric(15,2) NOT NULL,
   max_item_price_currency_code text NOT NULL,
   retail_price numeric(15,2) NOT NULL,
   retail_price_currency_code text NOT NULL,
   contract_id text,
   installments smallint,
   billing_type text,
   billing_frequency text,
   status text,
   group_hash text NOT NULL,
   legacy_service_type text NOT NULL,
   created timestamp DEFAULT now() NOT NULL,
   updated timestamp
)
;
ALTER TABLE "public"."product_definition"
ADD CONSTRAINT product_definition_product_definition_group_id_fkey
FOREIGN KEY (product_definition_group_id)
REFERENCES "public"."product_definition_group"(id)
;
CREATE UNIQUE INDEX product_definition_pkey ON "public"."product_definition"(id)
;
CREATE INDEX product_definition_internal_product_id_idx ON "public"."product_definition"(internal_product_id)
;
CREATE INDEX product_definition_group_hash_idx ON "public"."product_definition"(group_hash)
;
CREATE INDEX product_definition_product_definition_version_start_date_idx ON "public"."product_definition"(product_definition_version_start_date)
;
CREATE INDEX product_definition_product_definition_version_number_idx ON "public"."product_definition"(product_definition_version_number)
;
CREATE INDEX product_definition_category_id_idx ON "public"."product_definition"(category_id)
;
CREATE INDEX product_definition_product_definition_group_id_idx ON "public"."product_definition"(product_definition_group_id)
;
CREATE INDEX product_definition_legacy_service_type_idx ON "public"."product_definition"(legacy_service_type)
;
 */
@Entity
@Table(name = "product_definition")
public class ProductDefinition implements Serializable {

	private String id;

	private String internalProductId;

	private String displayName;

	private LocalDate productDefinitionVersionStartDate;

	private LocalDate productDefinitionVersionEndDate;

	private Integer productDefinitionVersionNumber;

	private String productDefinitionGroupId;

	private String categoryId;

	private String resaleCategory;

	private String itemCondition;

	private BigDecimal minItemPrice;

	private String minItemPriceCurrencyCode;

	private BigDecimal maxItemPrice;

	private String maxItemPriceCurrencyCode;

	private BigDecimal retailPrice;

	private String retailPriceCurrencyCode;

	private String contractId;

	private Integer installments;

	private String billingType;

	private String billingFrequency;

	private String status;

	private String groupHash;

	private String legacyServiceType;

	private LocalDateTime created;

	private LocalDateTime updated;

	@Id
	@Column(name = "id", nullable = false)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotNull
	@Column(name = "internal_product_id", nullable = false)
	public String getInternalProductId() {
		return internalProductId;
	}

	public void setInternalProductId(String internalProductId) {
		this.internalProductId = internalProductId;
	}

	@NotNull
	@Column(name = "display_name", nullable = false)
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@NotNull
	@Column(name = "product_definition_version_start_date", nullable = false)
	public LocalDate getProductDefinitionVersionStartDate() {
		return productDefinitionVersionStartDate;
	}

	public void setProductDefinitionVersionStartDate(LocalDate productDefinitionVersionStartDate) {
		this.productDefinitionVersionStartDate = productDefinitionVersionStartDate;
	}

	@Column(name = "product_definition_version_end_date")
	public LocalDate getProductDefinitionVersionEndDate() {
		return productDefinitionVersionEndDate;
	}

	public void setProductDefinitionVersionEndDate(LocalDate productDefinitionVersionEndDate) {
		this.productDefinitionVersionEndDate = productDefinitionVersionEndDate;
	}

	@Column(name = "product_definition_version_number")
	public Integer getProductDefinitionVersionNumber() {
		return productDefinitionVersionNumber;
	}

	public void setProductDefinitionVersionNumber(Integer productDefinitionVersionNumber) {
		this.productDefinitionVersionNumber = productDefinitionVersionNumber;
	}

	@NotNull
	@Column(name = "product_definition_group_id", nullable = false)
	public String getProductDefinitionGroupId() {
		return productDefinitionGroupId;
	}

	public void setProductDefinitionGroupId(String productDefinitionGroupId) {
		this.productDefinitionGroupId = productDefinitionGroupId;
	}

	@NotNull
	@Column(name = "category_id", nullable = false)
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@NotNull
	@Column(name = "resale_category", nullable = false)
	public String getResaleCategory() {
		return resaleCategory;
	}

	public void setResaleCategory(String resaleCategory) {
		this.resaleCategory = resaleCategory;
	}

	@NotNull
	@Column(name = "item_condition", nullable = false)
	public String getItemCondition() {
		return itemCondition;
	}

	public void setItemCondition(String itemCondition) {
		this.itemCondition = itemCondition;
	}

	@NotNull
	@Column(name = "min_item_price", nullable = false, precision = DEFAULT_PRECISION, scale = DEFAULT_SCALE)
	public BigDecimal getMinItemPrice() {
		return minItemPrice;
	}

	public void setMinItemPrice(BigDecimal minItemPrice) {
		this.minItemPrice = minItemPrice;
	}

	@NotNull
	@Column(name = "min_item_price_currency_code", nullable = false)
	public String getMinItemPriceCurrencyCode() {
		return minItemPriceCurrencyCode;
	}

	public void setMinItemPriceCurrencyCode(String minItemPriceCurrencyCode) {
		this.minItemPriceCurrencyCode = minItemPriceCurrencyCode;
	}

	@NotNull
	@Column(name = "max_item_price", nullable = false, precision = DEFAULT_PRECISION, scale = DEFAULT_SCALE)
	public BigDecimal getMaxItemPrice() {
		return maxItemPrice;
	}

	public void setMaxItemPrice(BigDecimal maxItemPrice) {
		this.maxItemPrice = maxItemPrice;
	}

	@NotNull
	@Column(name = "max_item_price_currency_code", nullable = false)
	public String getMaxItemPriceCurrencyCode() {
		return maxItemPriceCurrencyCode;
	}

	public void setMaxItemPriceCurrencyCode(String maxItemPriceCurrencyCode) {
		this.maxItemPriceCurrencyCode = maxItemPriceCurrencyCode;
	}

	@NotNull
	@Column(name = "retail_price", nullable = false, precision = DEFAULT_PRECISION, scale = DEFAULT_SCALE)
	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	@NotNull
	@Column(name = "retail_price_currency_code", nullable = false)
	public String getRetailPriceCurrencyCode() {
		return retailPriceCurrencyCode;
	}

	public void setRetailPriceCurrencyCode(String retailPriceCurrencyCode) {
		this.retailPriceCurrencyCode = retailPriceCurrencyCode;
	}

	@Column(name = "contract_id")
	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	@Column(name = "installments")
	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

	@Column(name = "billing_type")
	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	@Column(name = "billing_frequency")
	public String getBillingFrequency() {
		return billingFrequency;
	}

	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@NotNull
	@Column(name = "group_hash", nullable = false)
	public String getGroupHash() {
		return groupHash;
	}

	public void setGroupHash(String groupHash) {
		this.groupHash = groupHash;
	}

	@NotNull
	@Column(name = "legacy_service_type", nullable = false)
	public String getLegacyServiceType() {
		return legacyServiceType;
	}

	public void setLegacyServiceType(String legacyServiceType) {
		this.legacyServiceType = legacyServiceType;
	}

	@NotNull
	@Column(name = "created", nullable = false)
	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	@Column(name = "updated")
	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

}
