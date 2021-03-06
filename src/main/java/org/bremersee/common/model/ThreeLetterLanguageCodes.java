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

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * A list of ISO 639-2 language codes.
 *
 * @author Christian Bremer
 */
@Schema(description = "A list of ISO 639-2 language codes.")
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class ThreeLetterLanguageCodes extends ArrayList<ThreeLetterLanguageCode>
    implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new list of three letter language codes.
   *
   * @param languageCodes the language codes
   */
  public ThreeLetterLanguageCodes(
      Collection<? extends ThreeLetterLanguageCode> languageCodes) {
    super(languageCodes);
  }

}