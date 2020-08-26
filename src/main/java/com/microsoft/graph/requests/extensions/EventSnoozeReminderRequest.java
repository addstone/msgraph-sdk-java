// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EventSnoozeReminderBody;
import com.microsoft.graph.requests.extensions.IEventSnoozeReminderRequest;
import com.microsoft.graph.requests.extensions.EventSnoozeReminderRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Snooze Reminder Request.
 */
public class EventSnoozeReminderRequest extends BaseRequest implements IEventSnoozeReminderRequest {
    protected final EventSnoozeReminderBody body;

    /**
     * The request for this EventSnoozeReminder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventSnoozeReminderRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new EventSnoozeReminderBody();
    }

    public void post(final ICallback<Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEventSnoozeReminderRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EventSnoozeReminderRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEventSnoozeReminderRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (EventSnoozeReminderRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEventSnoozeReminderRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EventSnoozeReminderRequest)this;
    }

}
