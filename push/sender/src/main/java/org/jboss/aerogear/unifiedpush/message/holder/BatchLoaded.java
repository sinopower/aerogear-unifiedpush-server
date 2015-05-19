/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.unifiedpush.message.holder;

import java.io.Serializable;

/**
 * Event fired when one batch for given variant was loaded and queued.
 *
 * @see AllBatchesLoaded
 */
public class BatchLoaded implements Serializable {

    private static final long serialVersionUID = 1897563219239181838L;

    private String variantID;

    public BatchLoaded(String variantID) {
        this.variantID = variantID;
    }

    public String getVariantID() {
        return variantID;
    }
}
