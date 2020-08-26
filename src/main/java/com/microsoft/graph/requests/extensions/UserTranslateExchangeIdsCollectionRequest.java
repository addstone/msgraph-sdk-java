// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Translate Exchange Ids Collection Request.
 */
public class UserTranslateExchangeIdsCollectionRequest extends BaseCollectionRequest<UserTranslateExchangeIdsCollectionResponse, IUserTranslateExchangeIdsCollectionPage> implements IUserTranslateExchangeIdsCollectionRequest {


    protected final UserTranslateExchangeIdsBody body;


    /**
     * The request for this UserTranslateExchangeIds
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserTranslateExchangeIdsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserTranslateExchangeIdsCollectionResponse.class, IUserTranslateExchangeIdsCollectionPage.class);
        body = new UserTranslateExchangeIdsBody();
    }


    public void post(final ICallback<IUserTranslateExchangeIdsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IUserTranslateExchangeIdsCollectionPage post() throws ClientException {
        final UserTranslateExchangeIdsCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IUserTranslateExchangeIdsCollectionPage buildFromResponse(final UserTranslateExchangeIdsCollectionResponse response) {
        final IUserTranslateExchangeIdsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserTranslateExchangeIdsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* inputIds */ null, /* targetIdType */ null, /* sourceIdType */ null);
        } else {
            builder = null;
        }
        final IUserTranslateExchangeIdsCollectionPage page = new UserTranslateExchangeIdsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserTranslateExchangeIdsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IUserTranslateExchangeIdsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserTranslateExchangeIdsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IUserTranslateExchangeIdsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserTranslateExchangeIdsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IUserTranslateExchangeIdsCollectionRequest)this;
    }

}
