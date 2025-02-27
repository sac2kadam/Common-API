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
package com.iemr.common.service.helpline104history;

import java.util.ArrayList;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.iemr.common.data.helpline104history.H104BenMedHistory;
import com.iemr.common.repository.helpline104history.H104BenHistoryRepository;

@Service
public class H104BenHistoryServiceImpl implements H104BenHistoryService
{

	@Autowired
	private H104BenHistoryRepository smpleBenHistoryRepositoryRepository;

	private Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Override
	public ArrayList<H104BenMedHistory> geSmpleBenHistory(Long beneficiaryId)
	{

		return smpleBenHistoryRepositoryRepository.getBenHistory(beneficiaryId);
	}

}
