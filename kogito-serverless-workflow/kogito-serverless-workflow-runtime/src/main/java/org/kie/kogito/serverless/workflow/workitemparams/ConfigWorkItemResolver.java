/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates.
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
package org.kie.kogito.serverless.workflow.workitemparams;

import org.kie.kogito.internal.process.runtime.KogitoWorkItem;
import org.kie.kogito.process.workitems.impl.WorkItemParamResolver;
import org.kie.kogito.serverless.workflow.utils.ConfigResolverHolder;

public class ConfigWorkItemResolver<T> implements WorkItemParamResolver {

    private final String key;
    private final Class<T> clazz;
    private final T defaultValue;

    public ConfigWorkItemResolver(String key, Class<T> clazz, T defaultValue) {
        this.key = key;
        this.clazz = clazz;
        this.defaultValue = defaultValue;
    }

    @Override
    public Object apply(KogitoWorkItem workitem) {
        return ConfigResolverHolder.getConfigResolver().getConfigProperty(key, clazz, defaultValue);
    }

}
