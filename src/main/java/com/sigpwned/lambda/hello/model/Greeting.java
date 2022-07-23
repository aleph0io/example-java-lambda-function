/*-
 * =================================LICENSE_START==================================
 * hello-lambda
 * ====================================SECTION=====================================
 * Copyright (C) 2022 Andy Boothe
 * ====================================SECTION=====================================
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
 * ==================================LICENSE_END===================================
 */
package com.sigpwned.lambda.hello.model;

public class Greeting {
  private String text;

  /**
   * @return the greeting
   */
  public String getText() {
    return text;
  }

  /**
   * @param text the greeting to set
   */
  public void setText(String text) {
    this.text = text;
  }

  public Greeting withText(String text) {
    setText(text);
    return this;
  }
}
