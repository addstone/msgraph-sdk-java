// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsLenbRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Lenb Request Builder.
 */
public interface IWorkbookFunctionsLenbRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsLenbRequest
     *
     * @return the IWorkbookFunctionsLenbRequest instance
     */
    IWorkbookFunctionsLenbRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsLenbRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLenbRequest instance
     */
    IWorkbookFunctionsLenbRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
