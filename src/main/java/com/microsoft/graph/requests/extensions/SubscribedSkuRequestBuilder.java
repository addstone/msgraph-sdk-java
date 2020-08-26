// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISubscribedSkuRequest;
import com.microsoft.graph.requests.extensions.SubscribedSkuRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscribed Sku Request Builder.
 */
public class SubscribedSkuRequestBuilder extends BaseRequestBuilder implements ISubscribedSkuRequestBuilder {

    /**
     * The request builder for the SubscribedSku
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SubscribedSkuRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ISubscribedSkuRequest instance
     */
    public ISubscribedSkuRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISubscribedSkuRequest instance
     */
    public ISubscribedSkuRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SubscribedSkuRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

