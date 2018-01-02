/*
 * Copyright 2018 ThoughtWorks, Inc.
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

package com.example.artifact.executors;

import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class GetFetchArtifactMetadataExecutorTest {
    @Test
    public void shouldReturnFetchArtifactMetadata() throws JSONException {
        final GoPluginApiResponse response = new GetFetchArtifactMetadataExecutor().execute();

        final String expectedJSON = "[{\"key\":\"source\",\"metadata\":{\"required\":true,\"secure\":false}},{\"key\":\"destination\",\"metadata\":{\"required\":true,\"secure\":false}}]";

        assertThat(response.responseCode()).isEqualTo(200);
        JSONAssert.assertEquals(expectedJSON, response.responseBody(), true);
    }
}