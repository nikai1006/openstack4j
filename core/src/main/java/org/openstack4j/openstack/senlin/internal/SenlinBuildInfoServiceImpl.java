/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
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
package org.openstack4j.openstack.senlin.internal;

import org.openstack4j.api.senlin.SenlinBuildInfoService;
import org.openstack4j.model.senlin.BuildInfo;
import org.openstack4j.openstack.senlin.domain.SenlinBuildInfo;

/**
 * This class contains getters for all implementation of the available build-info services
 * 
 * @author lion
 */
public class SenlinBuildInfoServiceImpl extends BaseSenlinServices implements SenlinBuildInfoService {

	@Override
	public  BuildInfo get() {
		return get(SenlinBuildInfo.class, uri("/build-info")).execute();
	}
}
