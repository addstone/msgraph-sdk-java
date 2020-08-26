// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMailFolderCopyRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mail Folder Copy Request Builder.
 */
public interface IMailFolderCopyRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IMailFolderCopyRequest
     *
     * @return the IMailFolderCopyRequest instance
     */
    IMailFolderCopyRequest buildRequest();

    /**
     * Creates the IMailFolderCopyRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IMailFolderCopyRequest instance
     */
    IMailFolderCopyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
