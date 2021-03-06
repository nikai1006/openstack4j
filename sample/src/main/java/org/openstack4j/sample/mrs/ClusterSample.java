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
package org.openstack4j.sample.mrs;

import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.sample.AbstractSample;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

/**
 *
 * @author QianBiao.NG
 * @date   2017-07-05 15:36:39
 */
@Test
public class ClusterSample extends AbstractSample {

	public void testDeleteCluster() {
		ActionResponse delete = osclient.sahara().clusters().delete("cluster-id");
		Assert.assertTrue(delete.isSuccess());
	}

	public void testExpandCluster() {
		ActionResponse expand = osclient.sahara().clusters().expand("cluster-id", 3);
		Assert.assertTrue(expand.isSuccess());
	}

	/**
	 * 这个操作系统暂不支持
	 */
	public void testReduceCluster() {
		ActionResponse reduce = osclient.sahara().clusters().reduce("cluster-id", 3,
				Lists.newArrayList("instance-id-1"), Lists.newArrayList("instance-id-3"));
		Assert.assertTrue(reduce.isSuccess());
	}

}
