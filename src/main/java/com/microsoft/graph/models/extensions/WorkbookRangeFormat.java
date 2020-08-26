// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import com.microsoft.graph.models.extensions.WorkbookRangeFill;
import com.microsoft.graph.models.extensions.WorkbookRangeFont;
import com.microsoft.graph.models.extensions.WorkbookFormatProtection;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Format.
 */
public class WorkbookRangeFormat extends Entity implements IJsonBackedObject {


    /**
     * The Column Width.
     * Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
     */
    @SerializedName("columnWidth")
    @Expose
    public Double columnWidth;

    /**
     * The Horizontal Alignment.
     * Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right, Fill, Justify, CenterAcrossSelection, Distributed.
     */
    @SerializedName("horizontalAlignment")
    @Expose
    public String horizontalAlignment;

    /**
     * The Row Height.
     * Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned.
     */
    @SerializedName("rowHeight")
    @Expose
    public Double rowHeight;

    /**
     * The Vertical Alignment.
     * Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify, Distributed.
     */
    @SerializedName("verticalAlignment")
    @Expose
    public String verticalAlignment;

    /**
     * The Wrap Text.
     * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
     */
    @SerializedName("wrapText")
    @Expose
    public Boolean wrapText;

    /**
     * The Borders.
     * Collection of border objects that apply to the overall range selected Read-only.
     */
    public WorkbookRangeBorderCollectionPage borders;

    /**
     * The Fill.
     * Returns the fill object defined on the overall range. Read-only.
     */
    @SerializedName("fill")
    @Expose
    public WorkbookRangeFill fill;

    /**
     * The Font.
     * Returns the font object defined on the overall range selected Read-only.
     */
    @SerializedName("font")
    @Expose
    public WorkbookRangeFont font;

    /**
     * The Protection.
     * Returns the format protection object for a range. Read-only.
     */
    @SerializedName("protection")
    @Expose
    public WorkbookFormatProtection protection;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("borders")) {
            final WorkbookRangeBorderCollectionResponse response = new WorkbookRangeBorderCollectionResponse();
            if (json.has("borders@odata.nextLink")) {
                response.nextLink = json.get("borders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("borders").toString(), JsonObject[].class);
            final WorkbookRangeBorder[] array = new WorkbookRangeBorder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookRangeBorder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            borders = new WorkbookRangeBorderCollectionPage(response, null);
        }
    }
}
