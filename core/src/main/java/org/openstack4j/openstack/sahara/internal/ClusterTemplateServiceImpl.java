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
package org.openstack4j.openstack.sahara.internal;

import java.util.List;

import org.openstack4j.api.sahara.ClusterTemplateService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.sahara.ClusterTemplate;
import org.openstack4j.openstack.sahara.domain.SaharaClusterTemplate;
import org.openstack4j.openstack.sahara.domain.SaharaClusterTemplateUnwrapped;
import org.openstack4j.openstack.sahara.domain.SaharaClusterTemplate.ClusterTemplates;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Sahara Data Processing Operations
 * 
 * @author Ekasit Kijsipongse
 */
public class ClusterTemplateServiceImpl extends BaseSaharaServices implements ClusterTemplateService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends ClusterTemplate> list() {
        return get(ClusterTemplates.class, uri("/cluster-templates")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterTemplate get(String templateId) {
        checkNotNull(templateId);
        return get(SaharaClusterTemplate.class, uri("/cluster-templates/%s", templateId)).execute();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterTemplate create(ClusterTemplate template) {
        checkNotNull(template);
        SaharaClusterTemplateUnwrapped unwrapped = new SaharaClusterTemplateUnwrapped(template);  
        return post(SaharaClusterTemplate.class, uri("/cluster-templates"))
                     .entity(unwrapped)  // setup request
                     .execute();
       
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String templateId) {
        checkNotNull(templateId);
        return deleteWithResponse(uri("/cluster-templates/%s", templateId)).execute();
    }

}
