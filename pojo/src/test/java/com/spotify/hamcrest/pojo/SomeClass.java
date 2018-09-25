/*-
 * -\-\-
 * hamcrest-pojo
 * --
 * Copyright (C) 2016 Spotify AB
 * --
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
 * -/-/-
 */

package com.spotify.hamcrest.pojo;

import java.util.ArrayList;

class SomeClass extends SomeParent {

  public int foo() {
    return 42;
  }

  public String getBar() {
    return "bar";
  }

  public SomeClass baz() {
    return new SomeClass();
  }

  private boolean privateInClass() {
    return true;
  }

  public String throwsException() {
    throw new RuntimeException("Error!");
  }

  @Override
  public ArrayList<String> covariantlyOverriddenMethod() {
    return new ArrayList<>();
  }
}
