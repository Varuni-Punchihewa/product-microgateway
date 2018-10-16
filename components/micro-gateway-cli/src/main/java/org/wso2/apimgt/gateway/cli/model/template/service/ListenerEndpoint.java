/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.apimgt.gateway.cli.model.template.service;

import org.wso2.apimgt.gateway.cli.model.config.HTTP2;
import org.wso2.apimgt.gateway.cli.utils.GatewayCmdUtils;
import org.wso2.apimgt.gateway.cli.model.config.ContainerConfig;

public class ListenerEndpoint {
    private ContainerConfig containerConfig;
    private HTTP2 http2;

    public ListenerEndpoint buildContext() {
        this.containerConfig = GatewayCmdUtils.getContainerConfig();
        this.http2 = GatewayCmdUtils.getHttp2();
        return this;
    }

    public ContainerConfig getContainerConfig() {
        return containerConfig;
    }
}
