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
package com.iemr.common.notification;

import static org.assertj.core.api.Assertions.fail;

import static org.mockito.Mockito.doReturn;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;


import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.iemr.common.data.institute.Designation;
import com.iemr.common.data.notification.EmergencyContacts;
import com.iemr.common.data.notification.NotificationType;
import com.iemr.common.data.users.ProviderServiceMapping;
import com.iemr.common.repository.notification.EmergencyContactsRepository;
import com.iemr.common.service.notification.NotificationServiceImpl;
import com.iemr.common.utils.mapper.InputMapper;

//@RunWith(MockitoJUnitRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@DataJpaTest
public class NotificationServiceTest
{
	@InjectMocks
	private NotificationServiceImpl serviceSpy;
	@Spy
	private EmergencyContactsRepository emergencyContactsRepository;

	//@Before
	public void initialize()
	{
		MockitoAnnotations.initMocks(this);
	}

//	@Test
	public void getAgentCallStatsFailure1()
	{
		// try
		// {
		// doReturn(ConstantAgentStatus.urlFailureResponse1).when(serviceSpy)
		// .callUrl(ConstantAgentStatus.urlFailureRequest1);
		// String response = serviceSpy.getAgentCallStats(ConstantEmergencyContacts.failureRequest1)
		// .toString();
		// assertTrue("getAgentCallStats failure 1 ", response.equals(ConstantAgentStatus.failureResponse1));
		// } catch (Exception e)
		// {
		// e.printStackTrace();
		// fail("getAgentCallStats failure 1 failed with " + e.getMessage(), e);
		// }
	}

}
