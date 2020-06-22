/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoint addresses.
 */
public class Endpoints {
    /**
     * Endpoint for the NSX-T Data Center manager.
     */
    @JsonProperty(value = "nsxtManager", access = JsonProperty.Access.WRITE_ONLY)
    private String nsxtManager;

    /**
     * Endpoint for Virtual Center Server Appliance.
     */
    @JsonProperty(value = "vcsa", access = JsonProperty.Access.WRITE_ONLY)
    private String vcsa;

    /**
     * Get endpoint for the NSX-T Data Center manager.
     *
     * @return the nsxtManager value
     */
    public String nsxtManager() {
        return this.nsxtManager;
    }

    /**
     * Get endpoint for Virtual Center Server Appliance.
     *
     * @return the vcsa value
     */
    public String vcsa() {
        return this.vcsa;
    }

}