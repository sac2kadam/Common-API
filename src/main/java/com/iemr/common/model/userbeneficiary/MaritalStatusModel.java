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
package com.iemr.common.model.userbeneficiary;

import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MaritalStatusModel
{
	@Expose
	private Integer maritalStatusID;
	// private List<BeneficiaryModel> i_beneficiary;
	// private List<UserModel> m_user;
	@Expose
	private String status;
	@Expose
	private String statusDesc;
	// private Boolean deleted;
	// private String createdBy;
	// private Timestamp createdDate;
	// private String modifiedBy;
	// private Timestamp lastModDate;

	// public static MaritalStatusModel createMaritalStatus(Integer msId, MaritalStatusRepository
	// maritalStatusRepository,
	// MaritalStatusMapper maritalStatusMapper)
	// {
	// MaritalStatusModel msModel = new MaritalStatusModel();
	// if (msId != null)
	// {
	// msModel = maritalStatusMapper
	// .maritalStatusToLoginResponse(maritalStatusRepository.findAciveMaritalStatusByID(msId));
	// }
	// return msModel;
	// }

	public MaritalStatusModel()
	{

	}
}
