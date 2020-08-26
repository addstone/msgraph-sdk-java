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
 * The interface for the Managed App Registration With Reference Request.
 */
public interface IManagedAppRegistrationWithReferenceRequest extends IHttpRequest {

    void post(final ManagedAppRegistration newManagedAppRegistration, final IJsonBackedObject payload, final ICallback<ManagedAppRegistration> callback);

    ManagedAppRegistration post(final ManagedAppRegistration newManagedAppRegistration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<ManagedAppRegistration> callback);

    ManagedAppRegistration get() throws ClientException;

	void delete(final ICallback<ManagedAppRegistration> callback);

	void delete() throws ClientException;

	void patch(final ManagedAppRegistration sourceManagedAppRegistration, final ICallback<ManagedAppRegistration> callback);

	ManagedAppRegistration patch(final ManagedAppRegistration sourceManagedAppRegistration) throws ClientException;

    IManagedAppRegistrationWithReferenceRequest select(final String value);

    IManagedAppRegistrationWithReferenceRequest expand(final String value);

}
