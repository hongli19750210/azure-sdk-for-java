// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SmsSendResponseItemRepeatabilityResult. */
public final class SmsSendResponseItemRepeatabilityResult
        extends ExpandableStringEnum<SmsSendResponseItemRepeatabilityResult> {
    /** Static value accepted for SmsSendResponseItemRepeatabilityResult. */
    public static final SmsSendResponseItemRepeatabilityResult ACCEPTED = fromString("accepted");

    /** Static value rejected for SmsSendResponseItemRepeatabilityResult. */
    public static final SmsSendResponseItemRepeatabilityResult REJECTED = fromString("rejected");

    /**
     * Creates or finds a SmsSendResponseItemRepeatabilityResult from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SmsSendResponseItemRepeatabilityResult.
     */
    @JsonCreator
    public static SmsSendResponseItemRepeatabilityResult fromString(String name) {
        return fromString(name, SmsSendResponseItemRepeatabilityResult.class);
    }

    /** @return known SmsSendResponseItemRepeatabilityResult values. */
    public static Collection<SmsSendResponseItemRepeatabilityResult> values() {
        return values(SmsSendResponseItemRepeatabilityResult.class);
    }
}
