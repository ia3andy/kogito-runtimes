/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.audit.event;

import org.drools.kiesession.audit.RuleFlowNodeLogEvent;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.kogito.internal.process.runtime.KogitoProcessInstance;

public class KogitoRuleFlowNodeLogEvent extends RuleFlowNodeLogEvent {

    public KogitoRuleFlowNodeLogEvent(final int type,
            final String nodeId,
            final String nodeName,
            final String nodeInstanceId,
            ProcessInstance processInstance) {
        super(type, nodeId, nodeName, nodeInstanceId,
                processInstance.getProcessId(), processInstance.getProcessName(), ((KogitoProcessInstance) processInstance).getStringId());
    }

}
