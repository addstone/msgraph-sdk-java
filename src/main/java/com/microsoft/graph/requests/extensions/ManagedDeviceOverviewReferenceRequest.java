// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Overview Reference Request.
 */
public class ManagedDeviceOverviewReferenceRequest extends BaseRequest implements IManagedDeviceOverviewReferenceRequest {

    /**
     * The request for the ManagedDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceOverviewReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceOverview.class);
    }

    public void delete(final ICallback<ManagedDeviceOverview> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagedDeviceOverview delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceOverviewReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceOverviewReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceOverviewReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceOverviewReferenceRequest)this;
    }
    /**
     * Puts the ManagedDeviceOverview
     *
     * @param srcManagedDeviceOverview the ManagedDeviceOverview reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedDeviceOverview srcManagedDeviceOverview, final ICallback<ManagedDeviceOverview> callback) {
        send(HttpMethod.PUT, callback, srcManagedDeviceOverview);
    }

    /**
     * Puts the ManagedDeviceOverview
     *
     * @param srcManagedDeviceOverview the ManagedDeviceOverview reference to PUT
     * @return the ManagedDeviceOverview
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedDeviceOverview put(ManagedDeviceOverview srcManagedDeviceOverview) throws ClientException {
        return send(HttpMethod.PUT, srcManagedDeviceOverview);
    }
}
