// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsoWeekNumRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Iso Week Num Request Builder.
 */
public interface IWorkbookFunctionsIsoWeekNumRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsIsoWeekNumRequest
     *
     * @return the IWorkbookFunctionsIsoWeekNumRequest instance
     */
    IWorkbookFunctionsIsoWeekNumRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsIsoWeekNumRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsoWeekNumRequest instance
     */
    IWorkbookFunctionsIsoWeekNumRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
