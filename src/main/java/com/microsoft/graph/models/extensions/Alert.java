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
import com.microsoft.graph.models.extensions.CloudAppSecurityState;
import com.microsoft.graph.models.generated.AlertFeedback;
import com.microsoft.graph.models.extensions.FileSecurityState;
import com.microsoft.graph.models.extensions.AlertHistoryState;
import com.microsoft.graph.models.extensions.HostSecurityState;
import com.microsoft.graph.models.extensions.MalwareState;
import com.microsoft.graph.models.extensions.NetworkConnection;
import com.microsoft.graph.models.extensions.Process;
import com.microsoft.graph.models.extensions.RegistryKeyState;
import com.microsoft.graph.models.extensions.SecurityResource;
import com.microsoft.graph.models.generated.AlertSeverity;
import com.microsoft.graph.models.generated.AlertStatus;
import com.microsoft.graph.models.extensions.AlertTrigger;
import com.microsoft.graph.models.extensions.UserSecurityState;
import com.microsoft.graph.models.extensions.SecurityVendorInformation;
import com.microsoft.graph.models.extensions.VulnerabilityState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert.
 */
public class Alert extends Entity implements IJsonBackedObject {


    /**
     * The Activity Group Name.
     * Name or alias of the activity group (attacker) this alert is attributed to.
     */
    @SerializedName("activityGroupName")
    @Expose
    public String activityGroupName;

    /**
     * The Assigned To.
     * Name of the analyst the alert is assigned to for triage, investigation, or remediation (supports update).
     */
    @SerializedName("assignedTo")
    @Expose
    public String assignedTo;

    /**
     * The Azure Subscription Id.
     * Azure subscription ID, present if this alert is related to an Azure resource.
     */
    @SerializedName("azureSubscriptionId")
    @Expose
    public String azureSubscriptionId;

    /**
     * The Azure Tenant Id.
     * Azure Active Directory tenant ID. Required.
     */
    @SerializedName("azureTenantId")
    @Expose
    public String azureTenantId;

    /**
     * The Category.
     * Category of the alert (for example, credentialTheft, ransomware, etc.).
     */
    @SerializedName("category")
    @Expose
    public String category;

    /**
     * The Closed Date Time.
     * Time at which the alert was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z' (supports update).
     */
    @SerializedName("closedDateTime")
    @Expose
    public java.util.Calendar closedDateTime;

    /**
     * The Cloud App States.
     * Security-related stateful information generated by the provider about the cloud application/s related to this alert.
     */
    @SerializedName("cloudAppStates")
    @Expose
    public java.util.List<CloudAppSecurityState> cloudAppStates;

    /**
     * The Comments.
     * Customer-provided comments on alert (for customer alert management) (supports update).
     */
    @SerializedName("comments")
    @Expose
    public java.util.List<String> comments;

    /**
     * The Confidence.
     * Confidence of the detection logic (percentage between 1-100).
     */
    @SerializedName("confidence")
    @Expose
    public Integer confidence;

    /**
     * The Created Date Time.
     * Time at which the alert was created by the alert provider. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Required.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Alert description.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Detection Ids.
     * Set of alerts related to this alert entity (each alert is pushed to the SIEM as a separate record).
     */
    @SerializedName("detectionIds")
    @Expose
    public java.util.List<String> detectionIds;

    /**
     * The Event Date Time.
     * Time at which the event(s) that served as the trigger(s) to generate the alert occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Required.
     */
    @SerializedName("eventDateTime")
    @Expose
    public java.util.Calendar eventDateTime;

    /**
     * The Feedback.
     * Analyst feedback on the alert. Possible values are: unknown, truePositive, falsePositive, benignPositive. (supports update)
     */
    @SerializedName("feedback")
    @Expose
    public AlertFeedback feedback;

    /**
     * The File States.
     * Security-related stateful information generated by the provider about the file(s) related to this alert.
     */
    @SerializedName("fileStates")
    @Expose
    public java.util.List<FileSecurityState> fileStates;

    /**
     * The History States.
     * 
     */
    @SerializedName("historyStates")
    @Expose
    public java.util.List<AlertHistoryState> historyStates;

    /**
     * The Host States.
     * Security-related stateful information generated by the provider about the host(s) related to this alert.
     */
    @SerializedName("hostStates")
    @Expose
    public java.util.List<HostSecurityState> hostStates;

    /**
     * The Incident Ids.
     * IDs of incidents related to current alert.
     */
    @SerializedName("incidentIds")
    @Expose
    public java.util.List<String> incidentIds;

    /**
     * The Last Modified Date Time.
     * Time at which the alert entity was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Malware States.
     * Threat Intelligence pertaining to malware related to this alert.
     */
    @SerializedName("malwareStates")
    @Expose
    public java.util.List<MalwareState> malwareStates;

    /**
     * The Network Connections.
     * Security-related stateful information generated by the provider about the network connection(s) related to this alert.
     */
    @SerializedName("networkConnections")
    @Expose
    public java.util.List<NetworkConnection> networkConnections;

    /**
     * The Processes.
     * Security-related stateful information generated by the provider about the process or processes related to this alert.
     */
    @SerializedName("processes")
    @Expose
    public java.util.List<Process> processes;

    /**
     * The Recommended Actions.
     * Vendor/provider recommended action(s) to take as a result of the alert (for example, isolate machine, enforce2FA, reimage host).
     */
    @SerializedName("recommendedActions")
    @Expose
    public java.util.List<String> recommendedActions;

    /**
     * The Registry Key States.
     * Security-related stateful information generated by the provider about the registry keys related to this alert.
     */
    @SerializedName("registryKeyStates")
    @Expose
    public java.util.List<RegistryKeyState> registryKeyStates;

    /**
     * The Security Resources.
     * Resources related to current alert. For example, for some alerts this can have the Azure Resource value.
     */
    @SerializedName("securityResources")
    @Expose
    public java.util.List<SecurityResource> securityResources;

    /**
     * The Severity.
     * Alert severity - set by vendor/provider. Possible values are: unknown, informational, low, medium, high. Required.
     */
    @SerializedName("severity")
    @Expose
    public AlertSeverity severity;

    /**
     * The Source Materials.
     * Hyperlinks (URIs) to the source material related to the alert, for example, provider's user interface for alerts or log search, etc.
     */
    @SerializedName("sourceMaterials")
    @Expose
    public java.util.List<String> sourceMaterials;

    /**
     * The Status.
     * Alert lifecycle status (stage). Possible values are: unknown, newAlert, inProgress, resolved. (supports update). Required.
     */
    @SerializedName("status")
    @Expose
    public AlertStatus status;

    /**
     * The Tags.
     * User-definable labels that can be applied to an alert and can serve as filter conditions (for example 'HVA', 'SAW', etc.) (supports update).
     */
    @SerializedName("tags")
    @Expose
    public java.util.List<String> tags;

    /**
     * The Title.
     * Alert title. Required.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Triggers.
     * Security-related information about the specific properties that triggered the alert (properties appearing in the alert). Alerts might contain information about multiple users, hosts, files, ip addresses. This field indicates which properties triggered the alert generation.
     */
    @SerializedName("triggers")
    @Expose
    public java.util.List<AlertTrigger> triggers;

    /**
     * The User States.
     * Security-related stateful information generated by the provider about the user accounts related to this alert.
     */
    @SerializedName("userStates")
    @Expose
    public java.util.List<UserSecurityState> userStates;

    /**
     * The Vendor Information.
     * Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=Windows Defender ATP; subProvider=AppLocker). Required.
     */
    @SerializedName("vendorInformation")
    @Expose
    public SecurityVendorInformation vendorInformation;

    /**
     * The Vulnerability States.
     * Threat intelligence pertaining to one or more vulnerabilities related to this alert.
     */
    @SerializedName("vulnerabilityStates")
    @Expose
    public java.util.List<VulnerabilityState> vulnerabilityStates;


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

    }
}
