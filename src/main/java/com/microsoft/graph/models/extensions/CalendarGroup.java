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
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.CalendarCollectionResponse;
import com.microsoft.graph.requests.extensions.CalendarCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group.
 */
public class CalendarGroup extends Entity implements IJsonBackedObject {


    /**
     * The Name.
     * The group name.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Class Id.
     * The class identifier. Read-only.
     */
    @SerializedName("classId")
    @Expose
    public java.util.UUID classId;

    /**
     * The Change Key.
     * Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     */
    @SerializedName("changeKey")
    @Expose
    public String changeKey;

    /**
     * The Calendars.
     * The calendars in the calendar group. Navigation property. Read-only. Nullable.
     */
    public CalendarCollectionPage calendars;


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


        if (json.has("calendars")) {
            final CalendarCollectionResponse response = new CalendarCollectionResponse();
            if (json.has("calendars@odata.nextLink")) {
                response.nextLink = json.get("calendars@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendars").toString(), JsonObject[].class);
            final Calendar[] array = new Calendar[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Calendar.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendars = new CalendarCollectionPage(response, null);
        }
    }
}
