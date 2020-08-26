// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentRequest;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentRequest;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Assignment Request.
 */
public class DeviceCompliancePolicyAssignmentRequest extends BaseRequest implements IDeviceCompliancePolicyAssignmentRequest {
	
    /**
     * The request for the DeviceCompliancePolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyAssignment.class);
    }

    /**
     * Gets the DeviceCompliancePolicyAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceCompliancePolicyAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicyAssignment from the service
     *
     * @return the DeviceCompliancePolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceCompliancePolicyAssignment> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceCompliancePolicyAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicyAssignment sourceDeviceCompliancePolicyAssignment, final ICallback<DeviceCompliancePolicyAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicyAssignment);
    }

    /**
     * Patches this DeviceCompliancePolicyAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyAssignment the source object with updates
     * @return the updated DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyAssignment patch(final DeviceCompliancePolicyAssignment sourceDeviceCompliancePolicyAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment, final ICallback<DeviceCompliancePolicyAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the new object to create
     * @return the created DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyAssignment post(final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicyAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceCompliancePolicyAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceCompliancePolicyAssignmentRequest)this;
     }

}

