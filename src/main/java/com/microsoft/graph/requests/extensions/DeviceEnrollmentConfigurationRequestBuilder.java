// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequest;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequest;
import com.microsoft.graph.requests.extensions.IEnrollmentConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEnrollmentConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationSetPriorityRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationSetPriorityRequestBuilder;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationAssignRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationAssignRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Request Builder.
 */
public class DeviceEnrollmentConfigurationRequestBuilder extends BaseRequestBuilder implements IDeviceEnrollmentConfigurationRequestBuilder {

    /**
     * The request builder for the DeviceEnrollmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceEnrollmentConfigurationRequest instance
     */
    public IDeviceEnrollmentConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceEnrollmentConfigurationRequest instance
     */
    public IDeviceEnrollmentConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceEnrollmentConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEnrollmentConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new EnrollmentConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IEnrollmentConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new EnrollmentConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IDeviceEnrollmentConfigurationSetPriorityRequestBuilder setPriority(final Integer priority) {
        return new DeviceEnrollmentConfigurationSetPriorityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setPriority"), getClient(), null, priority);
    }

    public IDeviceEnrollmentConfigurationAssignRequestBuilder assign(final java.util.List<EnrollmentConfigurationAssignment> enrollmentConfigurationAssignments) {
        return new DeviceEnrollmentConfigurationAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, enrollmentConfigurationAssignments);
    }
}

