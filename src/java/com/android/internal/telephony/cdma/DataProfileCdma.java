/*
 * Copyright (c) 2010-2012, The Linux Foundation. All rights reserved.
 * Not a Contribution, Apache license notifications and license are retained
 * for attribution purposes only.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.telephony.cdma;

import com.android.internal.telephony.DataProfile;
import com.android.internal.telephony.DataProfile.DataProfileType;

import java.util.Arrays;

public class DataProfileCdma extends DataProfile {

    /* ID of the profile in the modem */
    private static String PROFILE_TYPE = "CdmaNai";

    private int mProfileId = 0;

    public DataProfileCdma(int id, String numeric, String name, String user, String password,
            int authType, String[] types, String protocol, String roamingProtocol, int bearer) {
        super(id, numeric, name == null ? PROFILE_TYPE : name, user, password,
                authType, types, protocol, roamingProtocol, bearer);
    }

    @Override
    public boolean canHandleType(String type) {
        return Arrays.asList(types).contains(type);
    }

    @Override
    public DataProfileType getDataProfileType() {
        return DataProfileType.PROFILE_TYPE_CDMA;
    }

    @Override
    public int getProfileId() {
        return mProfileId;
    }

    public void setProfileId(int profileId) {
        mProfileId = profileId;
    }

    @Override
    public String toShortString() {
        return "DataProfileCdma";
    }

    @Override
    public String toHash() {
        return this.toString();
    }
}
