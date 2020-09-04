// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MediaJobErroredEventData model. */
@Fluent
public final class MediaJobErroredEventData extends MediaJobStateChangeEventData {
    /*
     * Gets the Job outputs.
     */
    @JsonProperty(value = "outputs")
    private List<MediaJobOutput> outputs;

    /**
     * Get the outputs property: Gets the Job outputs.
     *
     * @return the outputs value.
     */
    public List<MediaJobOutput> getOutputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: Gets the Job outputs.
     *
     * @param outputs the outputs value to set.
     * @return the MediaJobErroredEventData object itself.
     */
    public MediaJobErroredEventData setOutputs(List<MediaJobOutput> outputs) {
        this.outputs = outputs;
        return this;
    }
}
