/*
 * Copyright (C) 2020 Microservice Systems, Inc.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package systems.microservice.loghub.sdk.util;

import java.io.Serializable;

/**
 * @author Dmitry Kotlyarov
 * @since 1.0
 */
public final class Tag implements Serializable {
    private static final long serialVersionUID = 1L;

    public final String key;
    public final Object value;
    public final String unit;

    public Tag(String key, Object value) {
        this(key, value, null);
    }

    public Tag(String key, Object value, String unit) {
        Argument.notNull("key", key);
        Argument.notNull("value", value);

        this.key = key;
        this.value = value;
        this.unit = unit;
    }
}
