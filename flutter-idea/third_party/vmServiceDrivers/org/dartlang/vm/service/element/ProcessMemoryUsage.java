/*
 * Copyright (c) 2015, the Dart project authors.
 *
 * Licensed under the Eclipse Public License v1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.dartlang.vm.service.element;

// This file is generated by the script: pkg/vm_service/tool/generate.dart in dart-lang/sdk.

import com.google.gson.JsonObject;

/**
 * Set getProcessMemoryUsage.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class ProcessMemoryUsage extends Response {

  public ProcessMemoryUsage(JsonObject json) {
    super(json);
  }

  public ProcessMemoryItem getRoot() {
    return new ProcessMemoryItem((JsonObject) json.get("root"));
  }
}
