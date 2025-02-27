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
package com.iemr.common.service.feedback;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iemr.common.data.feedback.FeedbackSeverity;
import com.iemr.common.repository.feedback.FeedbackSeverityRepository;

@Service
public class FeedbackSeverityServiceImpl implements FeedbackSeverityService {

	FeedbackSeverityRepository feedbackSeverityRepositorty;
	@Autowired
	public void setFeedbackTypeRepository(FeedbackSeverityRepository feedbackSeverityRepository){
		this.feedbackSeverityRepositorty = feedbackSeverityRepository;
	}
	@Override
	public List<FeedbackSeverity> getActiveFeedbackSeverity() {
		List<FeedbackSeverity> feedbackSeverityList = new ArrayList<FeedbackSeverity>();
		Set<Object[]> feedbackTypeResult = feedbackSeverityRepositorty.getActiveFeedbackSeverity();
		for (Object[] feedbackSevity : feedbackTypeResult) {
			if (feedbackSevity!=null && feedbackSevity.length >=2) {
			feedbackSeverityList.add(new FeedbackSeverity((Integer) feedbackSevity[0], (String) feedbackSevity[1]));
			}
		}
		return feedbackSeverityList;
	}

	@Override
	public List<FeedbackSeverity> getActiveFeedbackSeverity(Integer providerServiceMapID) {
		List<FeedbackSeverity> feedbackSeverityList = new ArrayList<FeedbackSeverity>();
		feedbackSeverityList = feedbackSeverityRepositorty.getActiveFeedbackSeverity(providerServiceMapID);
		// for (Object[] feedbackSevity : feedbackTypeResult) {
		// if (feedbackSevity!=null && feedbackSevity.length >=2) {
		// feedbackSeverityList.add(new FeedbackSeverity((Integer) feedbackSevity[0], (String) feedbackSevity[1]));
		// }
		// }
		return feedbackSeverityList;
	}
}
