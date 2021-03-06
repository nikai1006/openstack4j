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
package org.openstack4j.openstack.manila.domain.actions;

import org.openstack4j.model.ModelEntity;

/**
 * Actions to enable/disable manila services
 */
public class ServiceAction implements ModelEntity {
    private String binary;
    private String host;

    private ServiceAction(String binary, String host) {
        this.binary = binary;
        this.host = host;
    }

    public static ServiceAction enable(String binary, String host) {
        return new ServiceAction(binary, host);
    }

    public static ServiceAction disable(String binary, String host) {
        return new ServiceAction(binary, host);
    }

    public String getBinary() {
        return binary;
    }

    public String getHost() {
        return host;
    }
}
