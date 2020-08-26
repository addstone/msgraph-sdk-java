// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequest;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequest;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyTargetAppsRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyTargetAppsRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Policy Request Builder.
 */
public class ManagedAppPolicyRequestBuilder extends BaseRequestBuilder implements IManagedAppPolicyRequestBuilder {

    /**
     * The request builder for the ManagedAppPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppPolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedAppPolicyRequest instance
     */
    public IManagedAppPolicyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppPolicyRequest instance
     */
    public IManagedAppPolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagedAppPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IManagedAppPolicyTargetAppsRequestBuilder targetApps(final java.util.List<ManagedMobileApp> apps) {
        return new ManagedAppPolicyTargetAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.targetApps"), getClient(), null, apps);
    }
}

