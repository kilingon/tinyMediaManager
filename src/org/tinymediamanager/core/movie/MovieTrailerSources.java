/*
 * Copyright 2012 - 2014 Manuel Laggner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tinymediamanager.core.movie;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * The enum MovieTrailerSources
 * 
 * @author Manuel Laggner
 */
public enum MovieTrailerSources {

  //@formatter:off
  YOUTUBE("Youtube", Arrays.asList("youtube")), 
  APPLE("Apple", Arrays.asList("apple")), 
  AOL("Aol", Arrays.asList("aol")),
  HDTRAILERS("HD Trailers", Arrays.asList("hdtrailers"));  // @formatter:on

  private String       displayText;
  private List<String> possibleSources;

  private MovieTrailerSources(String text, List<String> sources) {
    this.displayText = text;
    this.possibleSources = sources;
  }

  public boolean containsSource(String source) {
    if (StringUtils.isBlank(source)) {
      return false;
    }
    for (String s : possibleSources) {
      if (source.equalsIgnoreCase(s)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return this.displayText;
  }
}