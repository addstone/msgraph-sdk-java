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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Collection Request.
 */
public class GroupLifecyclePolicyCollectionRequest extends BaseCollectionRequest<GroupLifecyclePolicyCollectionResponse, IGroupLifecyclePolicyCollectionPage> implements IGroupLifecyclePolicyCollectionRequest {

    /**
     * The request builder for this collection of GroupLifecyclePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupLifecyclePolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupLifecyclePolicyCollectionResponse.class, IGroupLifecyclePolicyCollectionPage.class);
    }

    public void get(final ICallback<IGroupLifecyclePolicyCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IGroupLifecyclePolicyCollectionPage get() throws ClientException {
        final GroupLifecyclePolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GroupLifecyclePolicy newGroupLifecyclePolicy, final ICallback<GroupLifecyclePolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupLifecyclePolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGroupLifecyclePolicy, callback);
    }

    public GroupLifecyclePolicy post(final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupLifecyclePolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGroupLifecyclePolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupLifecyclePolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupLifecyclePolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupLifecyclePolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupLifecyclePolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupLifecyclePolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GroupLifecyclePolicyCollectionRequest)this;
    }

    public IGroupLifecyclePolicyCollectionPage buildFromResponse(final GroupLifecyclePolicyCollectionResponse response) {
        final IGroupLifecyclePolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupLifecyclePolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupLifecyclePolicyCollectionPage page = new GroupLifecyclePolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
