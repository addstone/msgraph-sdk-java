// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyRequest;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequest;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Request.
 */
public class HomeRealmDiscoveryPolicyRequest extends BaseRequest implements IHomeRealmDiscoveryPolicyRequest {
	
    /**
     * The request for the HomeRealmDiscoveryPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HomeRealmDiscoveryPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HomeRealmDiscoveryPolicy.class);
    }

    /**
     * Gets the HomeRealmDiscoveryPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<HomeRealmDiscoveryPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the HomeRealmDiscoveryPolicy from the service
     *
     * @return the HomeRealmDiscoveryPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public HomeRealmDiscoveryPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<HomeRealmDiscoveryPolicy> callback) {
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
     * Patches this HomeRealmDiscoveryPolicy with a source
     *
     * @param sourceHomeRealmDiscoveryPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final HomeRealmDiscoveryPolicy sourceHomeRealmDiscoveryPolicy, final ICallback<HomeRealmDiscoveryPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceHomeRealmDiscoveryPolicy);
    }

    /**
     * Patches this HomeRealmDiscoveryPolicy with a source
     *
     * @param sourceHomeRealmDiscoveryPolicy the source object with updates
     * @return the updated HomeRealmDiscoveryPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public HomeRealmDiscoveryPolicy patch(final HomeRealmDiscoveryPolicy sourceHomeRealmDiscoveryPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceHomeRealmDiscoveryPolicy);
    }

    /**
     * Creates a HomeRealmDiscoveryPolicy with a new object
     *
     * @param newHomeRealmDiscoveryPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final HomeRealmDiscoveryPolicy newHomeRealmDiscoveryPolicy, final ICallback<HomeRealmDiscoveryPolicy> callback) {
        send(HttpMethod.POST, callback, newHomeRealmDiscoveryPolicy);
    }

    /**
     * Creates a HomeRealmDiscoveryPolicy with a new object
     *
     * @param newHomeRealmDiscoveryPolicy the new object to create
     * @return the created HomeRealmDiscoveryPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public HomeRealmDiscoveryPolicy post(final HomeRealmDiscoveryPolicy newHomeRealmDiscoveryPolicy) throws ClientException {
        return send(HttpMethod.POST, newHomeRealmDiscoveryPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IHomeRealmDiscoveryPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (HomeRealmDiscoveryPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IHomeRealmDiscoveryPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (HomeRealmDiscoveryPolicyRequest)this;
     }

}

