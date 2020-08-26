// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTrueRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTrueRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions True Request Builder.
 */
public class WorkbookFunctionsTrueRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsTrueRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTrue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsTrueRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookFunctionsTrueRequest
     *
     * @return the IWorkbookFunctionsTrueRequest instance
     */
    public IWorkbookFunctionsTrueRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTrueRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTrueRequest instance
     */
    public IWorkbookFunctionsTrueRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsTrueRequest request = new WorkbookFunctionsTrueRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
