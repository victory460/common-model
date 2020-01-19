/*
 * Copyright 2018-2020 the original author or authors.
 *
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
 */

package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.Locale;
import org.junit.jupiter.api.Test;

/**
 * The three letter country codes test.
 *
 * @author Christian Bremer
 */
class ThreeLetterCountryCodesTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    ThreeLetterCountryCodes model = new ThreeLetterCountryCodes();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new ThreeLetterCountryCodes());
    assertTrue(model.toString().length() > 0);

    ThreeLetterCountryCode value = ThreeLetterCountryCode.DEU;
    model = new ThreeLetterCountryCodes(Collections.singleton(value));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new ThreeLetterCountryCodes(Collections.singleton(value)));
    assertTrue(model.toString().contains(value.toString()));
  }
}