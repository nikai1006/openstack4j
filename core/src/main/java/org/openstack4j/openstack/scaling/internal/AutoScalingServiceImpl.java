/*******************************************************************************
 * 	Copyright 2017 HuaWei Tld                                     
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package org.openstack4j.openstack.scaling.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.scaling.AutoScalingActivityLogService;
import org.openstack4j.api.scaling.AutoScalingConfigService;
import org.openstack4j.api.scaling.AutoScalingGroupInstanceService;
import org.openstack4j.api.scaling.AutoScalingGroupService;
import org.openstack4j.api.scaling.AutoScalingPolicyService;
import org.openstack4j.api.scaling.AutoScalingQuotaService;
import org.openstack4j.api.scaling.AutoScalingService;

/**
 *
 * @author QianBiao.NG
 * @date   2017-06-14 09:57:45
 */
public class AutoScalingServiceImpl extends BaseAutoScalingServices implements AutoScalingService {

	/* 
	 * {@inheritDoc}
	 */
	@Override
	public AutoScalingGroupService groups() {
		return Apis.get(AutoScalingGroupService.class);
	}

	@Override
	public AutoScalingConfigService configs() {
		return Apis.get(AutoScalingConfigService.class);
	}

	@Override
	public AutoScalingGroupInstanceService groupInstances() {
		return Apis.get(AutoScalingGroupInstanceService.class);
	}

	@Override
	public AutoScalingPolicyService policies() {
		return Apis.get(AutoScalingPolicyService.class);
	}

	@Override
	public AutoScalingActivityLogService activityLogs() {
		return Apis.get(AutoScalingActivityLogService.class);
	}

	@Override
	public AutoScalingQuotaService quotas() {
		return Apis.get(AutoScalingQuotaService.class);
	}
	
}
