package com.google.ads;

import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes.dex */
public final class AdRequest {
    @NonNull
    public static final String LOGTAG = "Ads";
    @NonNull
    public static final String TEST_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    @NonNull
    public static final String VERSION = "0.0.0";

    /* loaded from: classes.dex */
    public enum ErrorCode {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        

        /* renamed from: a */
        public final String f10013a;

        ErrorCode(String str) {
            this.f10013a = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f10013a;
        }
    }

    /* loaded from: classes.dex */
    public enum Gender {
        UNKNOWN,
        MALE,
        FEMALE
    }
}
