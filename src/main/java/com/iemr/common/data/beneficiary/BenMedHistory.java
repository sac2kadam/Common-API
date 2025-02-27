/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.common.data.beneficiary;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.iemr.common.utils.mapper.OutputMapper;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "T_BenMedHistory")
@Data
public class BenMedHistory
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BenMedHistoryID")
	@Expose
	private Long benMedHistoryID;

	@Column(name = "BeneficiaryRegID")
	@Expose
	private Long beneficiaryRegID;

	@Transient
	@JsonIgnore
	private Beneficiary i_beneficiary;

	@Column(name = "YearofIllness")
	@Expose
	private Timestamp yearofIllness;
	@Column(name = "IllnessTypeID")
	@Expose
	private Integer illnessTypeID;
	@Column(name = "IllnessType")
	@Expose
	private String illnessType;
	@Column(name = "SurgeryID")
	@Expose
	private Integer surgeryID;
	@Column(name = "YearofSurgery")
	@Expose
	private Timestamp yearofSurgery;
	@Column(name = "Deleted", insertable = false, updatable = true)
	@Expose
	private Boolean deleted;
	@Column(name = "CreatedBy")
	@Expose
	private String createdBy;
	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp createdDate;
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp lastModDate;
	@Transient
	private OutputMapper outputMapper = new OutputMapper();

	@Override
	public String toString()
	{
		return outputMapper.gson().toJson(this);
	}
}
