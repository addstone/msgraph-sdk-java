// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDegreesRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Degrees Request Builder.
 */
public interface IWorkbookFunctionsDegreesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDegreesRequest
     *
     * @return the IWorkbookFunctionsDegreesRequest instance
     */
    IWorkbookFunctionsDegreesRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsDegreesRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDegreesRequest instance
     */
    IWorkbookFunctionsDegreesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
