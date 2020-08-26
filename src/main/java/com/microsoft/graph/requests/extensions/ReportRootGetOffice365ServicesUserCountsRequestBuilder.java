// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ServicesUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ServicesUserCountsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Services User Counts Request Builder.
 */
public class ReportRootGetOffice365ServicesUserCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetOffice365ServicesUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetOffice365ServicesUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetOffice365ServicesUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetOffice365ServicesUserCountsRequest
     *
     * @return the IReportRootGetOffice365ServicesUserCountsRequest instance
     */
    public IReportRootGetOffice365ServicesUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetOffice365ServicesUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ServicesUserCountsRequest instance
     */
    public IReportRootGetOffice365ServicesUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetOffice365ServicesUserCountsRequest request = new ReportRootGetOffice365ServicesUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
