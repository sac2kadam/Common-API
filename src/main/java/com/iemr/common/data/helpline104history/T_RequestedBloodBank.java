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
package com.iemr.common.data.helpline104history;


import com.google.gson.annotations.Expose;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="t_requestedbloodbank")
public class T_RequestedBloodBank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	private Long requestedBloodBankID;
	
	@Expose
	private Long bloodReqID;
	
	@Expose
	private String BloodBankAddress;
	
	@Expose
	private String BBPersonName;
	
	@Expose
	private String BBMobileNo;
	
	@Expose
	private String BBPersonDesignation;
	
}
