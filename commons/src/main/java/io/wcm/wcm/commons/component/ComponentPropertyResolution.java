/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2019 wcm.io
 * %%
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
 * #L%
 */
package io.wcm.wcm.commons.component;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Resolution mode for resolving component properties.
 */
@ProviderType
public enum ComponentPropertyResolution {

  /**
   * Do not resolve component property.
   */
  IGNORE,

  /**
   * Resolve component property without inheritance.
   */
  RESOLVE,

  /**
   * Resolve component property with inheritance from parent pages / super components.
   */
  RESOLVE_INHERIT

}
