/*
 * Copyright 2017 ThoughtWorks, Inc.
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

package com.example.artifact;

/**
 * Enumerable that represents one of the messages that the server sends to the plugin
 */
public enum Request {
    REQUEST_GET_PLUGIN_ICON(String.join(".", "go.cd.artifact", "get-icon")),

    REQUEST_STORE_CONFIG_METADATA(String.join(".", "go.cd.artifact", "store", "get-metadata")),
    REQUEST_STORE_CONFIG_VIEW(String.join(".", "go.cd.artifact", "store", "get-view")),
    REQUEST_STORE_CONFIG_VALIDATE(String.join(".", "go.cd.artifact", "store", "validate")),

    REQUEST_PUBLISH_ARTIFACT_METADATA(String.join(".", "go.cd.artifact", "publish", "get-metadata")),
    REQUEST_PUBLISH_ARTIFACT_VIEW(String.join(".", "go.cd.artifact", "publish", "get-view")),
    REQUEST_PUBLISH_ARTIFACT_VALIDATE(String.join(".", "go.cd.artifact", "publish", "validate")),

    REQUEST_FETCH_ARTIFACT_METADATA(String.join(".", "go.cd.artifact", "fetch", "get-metadata")),
    REQUEST_FETCH_ARTIFACT_VIEW(String.join(".", "go.cd.artifact", "fetch", "get-view")),
    REQUEST_FETCH_ARTIFACT_VALIDATE(String.join(".", "go.cd.artifact", "fetch", "validate")),

    REQUEST_PUBLISH_ARTIFACT(String.join(".", "go.cd.artifact", "publish-artifact")),
    REQUEST_FETCH_ARTIFACT(String.join(".", "go.cd.artifact", "fetch-artifact"));

    private final String requestName;

    Request(String requestName) {
        this.requestName = requestName;
    }

    public String requestName() {
        return requestName;
    }

    public static Request fromString(String requestName) {
        if (requestName != null) {
            for (Request request : Request.values()) {
                if (requestName.equalsIgnoreCase(request.requestName)) {
                    return request;
                }
            }
        }

        return null;
    }
}
