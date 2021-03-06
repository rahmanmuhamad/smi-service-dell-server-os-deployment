/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dell.isg.smi.osdeployment.service;

import com.dell.isg.smi.adapter.server.model.WsmanCredentials;
import com.dell.isg.smi.commons.model.osdeployment.OSDeploymentPayload;
import com.dell.isg.smi.commons.model.server.JobStatus;
import com.dell.isg.smi.osdeployment.model.Version;

/**
 * The Interface OSDeploymentService.
 */
public interface OSDeploymentService {
	
	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public Version getVersion();
	
	/**
	 * Deploy OS.
	 *
	 * @param payload the payload
	 * @return the job status
	 */
	public JobStatus deployOS(OSDeploymentPayload payload);
	
	/**
	 * Detach virtual media.
	 *
	 * @param wsmanCredentials the wsman credentials
	 * @return the job status
	 */
	public JobStatus detachVirtualMedia(WsmanCredentials wsmanCredentials);
	
}
