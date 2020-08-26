// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsEcma_CeilingRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsEcma_CeilingRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Ecma_Ceiling Request Builder.
 */
public class WorkbookFunctionsEcma_CeilingRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsEcma_CeilingRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsEcma_Ceiling
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     */
    public WorkbookFunctionsEcma_CeilingRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("significance", significance);
    }

    /**
     * Creates the IWorkbookFunctionsEcma_CeilingRequest
     *
     * @return the IWorkbookFunctionsEcma_CeilingRequest instance
     */
    public IWorkbookFunctionsEcma_CeilingRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsEcma_CeilingRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsEcma_CeilingRequest instance
     */
    public IWorkbookFunctionsEcma_CeilingRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsEcma_CeilingRequest request = new WorkbookFunctionsEcma_CeilingRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("significance")) {
            request.body.significance = getParameter("significance");
        }

        return request;
    }
}
