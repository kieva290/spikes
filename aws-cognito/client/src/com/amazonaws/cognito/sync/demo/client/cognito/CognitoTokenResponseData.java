/**
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.cognito.sync.demo.client.cognito;

import com.amazonaws.cognito.sync.demo.client.ResponseData;

public class CognitoTokenResponseData extends ResponseData {
    private final String identityId;
    private final String token;

    public CognitoTokenResponseData(final int responseCode, final String responseMessage) {
        super(responseCode, responseMessage);
        this.identityId = null;
        this.token = null;
    }

    public CognitoTokenResponseData(final String identityId, final String token) {
        super(200, null);
        this.identityId = identityId;
        this.token = token;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getToken() {
        return this.token;
    }
}
