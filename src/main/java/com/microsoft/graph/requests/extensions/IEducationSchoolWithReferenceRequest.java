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
 * The interface for the Education School With Reference Request.
 */
public interface IEducationSchoolWithReferenceRequest extends IHttpRequest {

    void post(final EducationSchool newEducationSchool, final IJsonBackedObject payload, final ICallback<EducationSchool> callback);

    EducationSchool post(final EducationSchool newEducationSchool, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<EducationSchool> callback);

    EducationSchool get() throws ClientException;

	void delete(final ICallback<EducationSchool> callback);

	void delete() throws ClientException;

	void patch(final EducationSchool sourceEducationSchool, final ICallback<EducationSchool> callback);

	EducationSchool patch(final EducationSchool sourceEducationSchool) throws ClientException;

    IEducationSchoolWithReferenceRequest select(final String value);

    IEducationSchoolWithReferenceRequest expand(final String value);

}
