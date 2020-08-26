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
 * The class for the Home Realm Discovery Policy With Reference Request Builder.
 */
public class HomeRealmDiscoveryPolicyWithReferenceRequestBuilder extends BaseRequestBuilder implements IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder {

    /**
     * The request builder for the HomeRealmDiscoveryPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HomeRealmDiscoveryPolicyWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IHomeRealmDiscoveryPolicyWithReferenceRequest instance
     */
    public IHomeRealmDiscoveryPolicyWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IHomeRealmDiscoveryPolicyWithReferenceRequest instance
     */
    public IHomeRealmDiscoveryPolicyWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new HomeRealmDiscoveryPolicyWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IHomeRealmDiscoveryPolicyReferenceRequestBuilder reference(){
        return new HomeRealmDiscoveryPolicyReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
