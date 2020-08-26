// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;

import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Delta Collection Page.
 */
public class ServicePrincipalDeltaCollectionPage extends BaseCollectionPage<ServicePrincipal, IServicePrincipalDeltaCollectionRequestBuilder> implements IServicePrincipalDeltaCollectionPage {

    /**
     * The opaque link to query delta after the 
     * initial request
     */
    public String deltaLink;

    /**
     * A collection page for ServicePrincipalDelta.
     *
     * @param response The serialized ServicePrincipalDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ServicePrincipalDeltaCollectionPage(final ServicePrincipalDeltaCollectionResponse response, final IServicePrincipalDeltaCollectionRequestBuilder builder) {
       super(response.value, builder);

        if (response.getRawObject().get("@odata.deltaLink") != null) {
            deltaLink = response.getRawObject().get("@odata.deltaLink").getAsString();
        } else {
            deltaLink = null;
        }
    }
    /**
     * The deltaLink to make future delta requests
     *
     * @return String The deltaLink URL
     */
    public String deltaLink() {
        return deltaLink;
    }
}
