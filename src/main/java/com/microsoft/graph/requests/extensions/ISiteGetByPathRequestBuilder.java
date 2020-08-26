// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISiteGetByPathRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Get By Path Request Builder.
 */
public interface ISiteGetByPathRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISiteGetByPathRequest
     *
     * @return the ISiteGetByPathRequest instance
     */
    ISiteGetByPathRequest buildRequest();

    /**
     * Creates the ISiteGetByPathRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ISiteGetByPathRequest instance
     */
    ISiteGetByPathRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
