// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppConfigurationKeyValueDeletedEventData model. */
@Fluent
public final class AppConfigurationKeyValueDeletedEventData {
    /*
     * The key used to identify the key-value that was deleted.
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * The label, if any, used to identify the key-value that was deleted.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * The etag representing the key-value that was deleted.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the key property: The key used to identify the key-value that was deleted.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key used to identify the key-value that was deleted.
     *
     * @param key the key value to set.
     * @return the AppConfigurationKeyValueDeletedEventData object itself.
     */
    public AppConfigurationKeyValueDeletedEventData setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the label property: The label, if any, used to identify the key-value that was deleted.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: The label, if any, used to identify the key-value that was deleted.
     *
     * @param label the label value to set.
     * @return the AppConfigurationKeyValueDeletedEventData object itself.
     */
    public AppConfigurationKeyValueDeletedEventData setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the etag property: The etag representing the key-value that was deleted.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag representing the key-value that was deleted.
     *
     * @param etag the etag value to set.
     * @return the AppConfigurationKeyValueDeletedEventData object itself.
     */
    public AppConfigurationKeyValueDeletedEventData setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}
