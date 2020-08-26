// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnenoteOperationRequest;
import com.microsoft.graph.requests.extensions.OnenoteOperationRequest;
import com.microsoft.graph.models.extensions.OnenoteOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Operation Request.
 */
public class OnenoteOperationRequest extends BaseRequest implements IOnenoteOperationRequest {
	
    /**
     * The request for the OnenoteOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteOperation.class);
    }

    /**
     * Gets the OnenoteOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<OnenoteOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenoteOperation from the service
     *
     * @return the OnenoteOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenoteOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<OnenoteOperation> callback) {
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
     * Patches this OnenoteOperation with a source
     *
     * @param sourceOnenoteOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OnenoteOperation sourceOnenoteOperation, final ICallback<OnenoteOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenoteOperation);
    }

    /**
     * Patches this OnenoteOperation with a source
     *
     * @param sourceOnenoteOperation the source object with updates
     * @return the updated OnenoteOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenoteOperation patch(final OnenoteOperation sourceOnenoteOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteOperation);
    }

    /**
     * Creates a OnenoteOperation with a new object
     *
     * @param newOnenoteOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OnenoteOperation newOnenoteOperation, final ICallback<OnenoteOperation> callback) {
        send(HttpMethod.POST, callback, newOnenoteOperation);
    }

    /**
     * Creates a OnenoteOperation with a new object
     *
     * @param newOnenoteOperation the new object to create
     * @return the created OnenoteOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenoteOperation post(final OnenoteOperation newOnenoteOperation) throws ClientException {
        return send(HttpMethod.POST, newOnenoteOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOnenoteOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OnenoteOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOnenoteOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OnenoteOperationRequest)this;
     }

}

