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
 * The interface for the Certificate Based Auth Configuration With Reference Request.
 */
public interface ICertificateBasedAuthConfigurationWithReferenceRequest extends IHttpRequest {

    void post(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration, final IJsonBackedObject payload, final ICallback<CertificateBasedAuthConfiguration> callback);

    CertificateBasedAuthConfiguration post(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<CertificateBasedAuthConfiguration> callback);

    CertificateBasedAuthConfiguration get() throws ClientException;

	void delete(final ICallback<CertificateBasedAuthConfiguration> callback);

	void delete() throws ClientException;

	void patch(final CertificateBasedAuthConfiguration sourceCertificateBasedAuthConfiguration, final ICallback<CertificateBasedAuthConfiguration> callback);

	CertificateBasedAuthConfiguration patch(final CertificateBasedAuthConfiguration sourceCertificateBasedAuthConfiguration) throws ClientException;

    ICertificateBasedAuthConfigurationWithReferenceRequest select(final String value);

    ICertificateBasedAuthConfigurationWithReferenceRequest expand(final String value);

}
