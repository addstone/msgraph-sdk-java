// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentTopFailuresRequest;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentTopFailuresRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Managed Device Enrollment Top Failures Request Builder.
 */
public class ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder {

    /**
     * The request builder for this ReportRootManagedDeviceEnrollmentTopFailures
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this ReportRootManagedDeviceEnrollmentTopFailures
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootManagedDeviceEnrollmentTopFailuresRequest
     *
     * @return the IReportRootManagedDeviceEnrollmentTopFailuresRequest instance
     */
    public IReportRootManagedDeviceEnrollmentTopFailuresRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootManagedDeviceEnrollmentTopFailuresRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootManagedDeviceEnrollmentTopFailuresRequest instance
     */
    public IReportRootManagedDeviceEnrollmentTopFailuresRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootManagedDeviceEnrollmentTopFailuresRequest request = new ReportRootManagedDeviceEnrollmentTopFailuresRequest(
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
