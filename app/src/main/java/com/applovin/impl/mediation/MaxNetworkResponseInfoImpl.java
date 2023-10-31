package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* loaded from: classes.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* renamed from: a */
    private final MaxNetworkResponseInfo.AdLoadState f6739a;

    /* renamed from: b */
    private final MaxMediatedNetworkInfo f6740b;

    /* renamed from: c */
    private final Bundle f6741c;

    /* renamed from: d */
    private final long f6742d;
    @Nullable

    /* renamed from: e */
    private final MaxError f6743e;

    /* renamed from: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C28141 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6744a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f6744a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6744a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, Bundle bundle, MaxMediatedNetworkInfo maxMediatedNetworkInfo, long j, @Nullable MaxError maxError) {
        this.f6739a = adLoadState;
        this.f6740b = maxMediatedNetworkInfo;
        this.f6741c = bundle;
        this.f6742d = j;
        this.f6743e = maxError;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f6739a;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f6741c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    @Nullable
    public MaxError getError() {
        return this.f6743e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f6742d;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f6740b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (r1 != 2) goto L6;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MaxResponseInfo{adLoadState="
            r1.<init>(r2)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r4.f6739a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r4.f6740b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r4.f6741c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.C28141.f6744a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r4.f6739a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L3a
            r2 = 2
            if (r1 == r2) goto L4d
            goto L60
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", error="
            r1.<init>(r2)
            com.applovin.mediation.MaxError r2 = r4.f6743e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", latencyMillis="
            r1.<init>(r2)
            long r2 = r4.f6742d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L60:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}
