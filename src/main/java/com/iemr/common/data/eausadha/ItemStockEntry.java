package com.iemr.common.data.eausadha;

import java.util.Date;

import com.google.gson.annotations.Expose;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="t_itemstockentry")
@Data
public class ItemStockEntry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Expose
	@Column(name="ItemStockEntryID")
	private Integer itemStockEntryID;
	
	@Expose
	@Column(name="FacilityID")
	private Integer facilityID;
	
	@Expose
	@Column(name="ItemID")
	private Integer itemID;
	
//	@Expose
//	@Transient
//	private Integer issueQuantity;
	
	@Expose
	@Column(name="Quantity")
	private Integer quantity;
	
	@Expose
	@Column(name="QuantityInHand")
	private Integer quantityInHand;
	
	@Expose
	@Column(name="UnitCostPrice")
	private Double totalCostPrice;
	
	@Expose
	@Column(name="BatchNo")
	private String batchNo;
	
	@Expose
	@Column(name="ExpiryDate")
	private Date expiryDate;
	
	@Expose
	@Column(name="EntryTypeID")
	private Integer entryTypeID;
	
	
	
	@JoinColumn(name = "itemID", insertable = false, updatable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private ItemMaster item;
	
	@Expose
	@Column(name="EntryType")
	private String entryType;
	
	@Expose
	@Column(name="Deleted", insertable = false, updatable = true)
	private Boolean deleted;
	
	@Expose
	@Column(name="Processed", insertable = false, updatable = true)
	private Character processed;
	
	@Expose
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Expose
	@Column(name="CreatedDate", insertable = false, updatable = false)
	private Date createdDate;
	
	@Expose
	@Column(name="ModifiedBy")
	private String modifiedBy;
	
	@Expose
	@Column(name="LastModDate", insertable = false, updatable = false)
	private Date lastModDate;
	
	@Expose
	@Column(name="SyncFacilityID")
	private Integer syncFacilityID;
	
	@Expose
	@Column(name="VanSerialNo")
	private Integer vanSerialNo;
	
	@Expose
	@Column(name="VanID")
	private Integer vanId;

}
