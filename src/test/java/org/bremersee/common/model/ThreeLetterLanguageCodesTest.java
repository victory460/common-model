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
import org.junit.jupiter.api.Test;

/**
 * The three letter language codes test.
 *
 * @author Christian Bremer
 */
class ThreeLetterLanguageCodesTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    ThreeLetterLanguageCodes model = new ThreeLetterLanguageCodes();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new ThreeLetterLanguageCodes());
    assertTrue(model.toString().length() > 0);

    ThreeLetterLanguageCode value = ThreeLetterLanguageCode.DEU;
    model = new ThreeLetterLanguageCodes(Collections.singleton(value));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new ThreeLetterLanguageCodes(Collections.singleton(value)));
    assertTrue(model.toString().contains(value.toString()));
  }
}