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
package com.sigpwned.lambda.hello;

import java.util.Optional;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.sigpwned.lambda.hello.model.Greeting;
import com.sigpwned.lambda.hello.model.Person;

/**
 * Respond to the person with a nice, polite greeting!
 */
public class HelloLambda implements RequestHandler<Person, Greeting> {
  public Greeting handleRequest(Person input, Context context) {
    return new Greeting().withText(String.format("Hello, %s!",
        Optional.ofNullable(input).map(Person::getName).orElse("Person")));
  }
}
