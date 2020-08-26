// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateRequest;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateRequest;
import com.microsoft.graph.models.extensions.ApplePushNotificationCertificate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Push Notification Certificate Request.
 */
public class ApplePushNotificationCertificateRequest extends BaseRequest implements IApplePushNotificationCertificateRequest {
	
    /**
     * The request for the ApplePushNotificationCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplePushNotificationCertificateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplePushNotificationCertificate.class);
    }

    /**
     * Gets the ApplePushNotificationCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ApplePushNotificationCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ApplePushNotificationCertificate from the service
     *
     * @return the ApplePushNotificationCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ApplePushNotificationCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ApplePushNotificationCertificate> callback) {
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
     * Patches this ApplePushNotificationCertificate with a source
     *
     * @param sourceApplePushNotificationCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ApplePushNotificationCertificate sourceApplePushNotificationCertificate, final ICallback<ApplePushNotificationCertificate> callback) {
        send(HttpMethod.PATCH, callback, sourceApplePushNotificationCertificate);
    }

    /**
     * Patches this ApplePushNotificationCertificate with a source
     *
     * @param sourceApplePushNotificationCertificate the source object with updates
     * @return the updated ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ApplePushNotificationCertificate patch(final ApplePushNotificationCertificate sourceApplePushNotificationCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceApplePushNotificationCertificate);
    }

    /**
     * Creates a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ApplePushNotificationCertificate newApplePushNotificationCertificate, final ICallback<ApplePushNotificationCertificate> callback) {
        send(HttpMethod.POST, callback, newApplePushNotificationCertificate);
    }

    /**
     * Creates a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the new object to create
     * @return the created ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ApplePushNotificationCertificate post(final ApplePushNotificationCertificate newApplePushNotificationCertificate) throws ClientException {
        return send(HttpMethod.POST, newApplePushNotificationCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IApplePushNotificationCertificateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ApplePushNotificationCertificateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IApplePushNotificationCertificateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ApplePushNotificationCertificateRequest)this;
     }

}

