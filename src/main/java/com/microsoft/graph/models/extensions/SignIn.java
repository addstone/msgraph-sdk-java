// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppliedConditionalAccessPolicy;
import com.microsoft.graph.models.generated.ConditionalAccessStatus;
import com.microsoft.graph.models.extensions.DeviceDetail;
import com.microsoft.graph.models.extensions.SignInLocation;
import com.microsoft.graph.models.generated.RiskDetail;
import com.microsoft.graph.models.generated.RiskEventType;
import com.microsoft.graph.models.generated.RiskLevel;
import com.microsoft.graph.models.generated.RiskState;
import com.microsoft.graph.models.extensions.SignInStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In.
 */
public class SignIn extends Entity implements IJsonBackedObject {


    /**
     * The App Display Name.
     * App name displayed in the Azure Portal.
     */
    @SerializedName("appDisplayName")
    @Expose
    public String appDisplayName;

    /**
     * The App Id.
     * Unique GUID representing the app ID in the Azure Active Directory.
     */
    @SerializedName("appId")
    @Expose
    public String appId;

    /**
     * The Applied Conditional Access Policies.
     * 
     */
    @SerializedName("appliedConditionalAccessPolicies")
    @Expose
    public java.util.List<AppliedConditionalAccessPolicy> appliedConditionalAccessPolicies;

    /**
     * The Client App Used.
     * Identifies the legacy client used for sign-in activity.  Includes Browser, Exchange Active Sync, modern clients, IMAP, MAPI, SMTP, and POP.
     */
    @SerializedName("clientAppUsed")
    @Expose
    public String clientAppUsed;

    /**
     * The Conditional Access Status.
     * Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and unknownFutureValue.
     */
    @SerializedName("conditionalAccessStatus")
    @Expose
    public ConditionalAccessStatus conditionalAccessStatus;

    /**
     * The Correlation Id.
     * The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity.
     */
    @SerializedName("correlationId")
    @Expose
    public String correlationId;

    /**
     * The Created Date Time.
     * Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as '2014-01-01T00:00:00Z'.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Device Detail.
     * Device information from where the sign-in occurred; includes device ID, operating system, and browser.
     */
    @SerializedName("deviceDetail")
    @Expose
    public DeviceDetail deviceDetail;

    /**
     * The Ip Address.
     * IP address of the client used to sign in.
     */
    @SerializedName("ipAddress")
    @Expose
    public String ipAddress;

    /**
     * The Is Interactive.
     * Indicates if a sign-in is interactive or not.
     */
    @SerializedName("isInteractive")
    @Expose
    public Boolean isInteractive;

    /**
     * The Location.
     * Provides the city, state, and country code where the sign-in originated.
     */
    @SerializedName("location")
    @Expose
    public SignInLocation location;

    /**
     * The Resource Display Name.
     * Name of the resource the user signed into.
     */
    @SerializedName("resourceDisplayName")
    @Expose
    public String resourceDisplayName;

    /**
     * The Resource Id.
     * ID of the resource that the user signed into.
     */
    @SerializedName("resourceId")
    @Expose
    public String resourceId;

    /**
     * The Risk Detail.
     * Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far. Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the value hidden.
     */
    @SerializedName("riskDetail")
    @Expose
    public RiskDetail riskDetail;

    /**
     * The Risk Event Types.
     * Risk event types associated with the sign-in. The possible values are: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, and unknownFutureValue.
     */
    @SerializedName("riskEventTypes")
    @Expose
    public java.util.List<RiskEventType> riskEventTypes;

    /**
     * The Risk Event Types_v2.
     * The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue.
     */
    @SerializedName("riskEventTypes_v2")
    @Expose
    public java.util.List<String> riskEventTypes_v2;

    /**
     * The Risk Level Aggregated.
     * Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
     */
    @SerializedName("riskLevelAggregated")
    @Expose
    public RiskLevel riskLevelAggregated;

    /**
     * The Risk Level During Sign In.
     * Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
     */
    @SerializedName("riskLevelDuringSignIn")
    @Expose
    public RiskLevel riskLevelDuringSignIn;

    /**
     * The Risk State.
     * Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     */
    @SerializedName("riskState")
    @Expose
    public RiskState riskState;

    /**
     * The Status.
     * Sign-in status. Possible values include Success and Failure.
     */
    @SerializedName("status")
    @Expose
    public SignInStatus status;

    /**
     * The User Display Name.
     * Display name of the user that initiated the sign-in.
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Id.
     * ID of the user that initiated the sign-in.
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * User principal name of the user that initiated the sign-in.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


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
