// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsVar_SRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Var_SRequest Builder.
 */
public interface IWorkbookFunctionsVar_SRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsVar_SRequest
     *
     * @return the IWorkbookFunctionsVar_SRequest instance
     */
    IWorkbookFunctionsVar_SRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsVar_SRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsVar_SRequest instance
     */
    IWorkbookFunctionsVar_SRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
