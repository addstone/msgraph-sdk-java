// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;
import com.microsoft.graph.callrecords.requests.extensions.ISessionRequest;
import com.microsoft.graph.callrecords.requests.extensions.ISegmentCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.ISegmentRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Session Request Builder.
 */
public interface ISessionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISessionRequest instance
     */
    ISessionRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISessionRequest instance
     */
    ISessionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ISegmentCollectionRequestBuilder segments();

    ISegmentRequestBuilder segments(final String id);

}
