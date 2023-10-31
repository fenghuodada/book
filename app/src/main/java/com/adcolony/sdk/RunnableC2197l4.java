package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C2275r2;

/* renamed from: com.adcolony.sdk.l4 */
/* loaded from: classes.dex */
public final class RunnableC2197l4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f5357a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2140i6 f5358b;

    /* renamed from: c */
    public final /* synthetic */ C2247p4 f5359c;

    public RunnableC2197l4(C2247p4 c2247p4, Context context, C2275r2.C2276a c2276a) {
        this.f5359c = c2247p4;
        this.f5357a = context;
        this.f5358b = c2276a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (android.provider.Settings.Secure.getInt(r4.getContentResolver(), "limit_ad_tracking") != 0) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            boolean r0 = com.adcolony.sdk.C2201m0.f5367e
            com.adcolony.sdk.p4 r1 = r8.f5359c
            r2 = 1
            r3 = 0
            if (r0 == 0) goto Lc
            java.lang.String r0 = "00000000-0000-0000-0000-000000000000"
            goto L81
        Lc:
            r0 = 0
            android.content.Context r4 = r8.f5357a     // Catch: java.lang.Exception -> L1e java.lang.NoSuchMethodError -> L36 java.lang.NoClassDefFoundError -> L3f
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r4)     // Catch: java.lang.Exception -> L1e java.lang.NoSuchMethodError -> L36 java.lang.NoClassDefFoundError -> L3f
            java.lang.String r5 = r4.getId()     // Catch: java.lang.Exception -> L1e java.lang.NoSuchMethodError -> L36 java.lang.NoClassDefFoundError -> L3f
            boolean r4 = r4.isLimitAdTrackingEnabled()     // Catch: java.lang.Exception -> L1c java.lang.NoSuchMethodError -> L37 java.lang.NoClassDefFoundError -> L40
            goto L52
        L1c:
            r4 = move-exception
            goto L20
        L1e:
            r4 = move-exception
            r5 = r0
        L20:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Query Advertising ID failed with: "
            r6.<init>(r7)
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            androidx.datastore.preferences.protobuf.C1169e.m11129c(r4, r3, r2, r2)
            goto L51
        L36:
            r5 = r0
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Google Play Services is out of date, please update to GPS 4.0+."
            goto L47
        L3f:
            r5 = r0
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Google Play Services Ads dependencies are missing."
        L47:
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            androidx.datastore.preferences.protobuf.C1169e.m11129c(r4, r3, r2, r3)
        L51:
            r4 = r3
        L52:
            if (r5 != 0) goto L86
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r7 = "Amazon"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L86
            r1.getClass()
            android.content.Context r4 = com.adcolony.sdk.C2201m0.f5363a
            if (r4 != 0) goto L66
            goto L70
        L66:
            android.content.ContentResolver r0 = r4.getContentResolver()
            java.lang.String r4 = "advertising_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r4)
        L70:
            android.content.Context r4 = com.adcolony.sdk.C2201m0.f5363a
            if (r4 != 0) goto L75
            goto L84
        L75:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> L84
            java.lang.String r5 = "limit_ad_tracking"
            int r4 = android.provider.Settings.Secure.getInt(r4, r5)     // Catch: android.provider.Settings.SettingNotFoundException -> L84
            if (r4 == 0) goto L84
        L81:
            r5 = r0
            r4 = r2
            goto L86
        L84:
            r5 = r0
            r4 = r3
        L86:
            com.adcolony.sdk.i6 r0 = r8.f5358b
            if (r5 != 0) goto L9e
            java.lang.String r4 = "Advertising ID is not available. Collecting Android ID instead of Advertising ID."
            androidx.datastore.preferences.protobuf.C1169e.m11129c(r4, r3, r2, r3)
            if (r0 == 0) goto Lc0
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r4 = "Advertising ID is not available."
            r3.<init>(r4)
            com.adcolony.sdk.r2$a r0 = (com.adcolony.sdk.C2275r2.C2276a) r0
            r0.m9510b(r3)
            goto Lc0
        L9e:
            r1.f5467c = r5
            com.adcolony.sdk.b3 r3 = com.adcolony.sdk.C2201m0.m9588d()
            com.adcolony.sdk.a2 r3 = r3.m9689n()
            com.adcolony.sdk.u4 r3 = r3.f4926e
            if (r3 == 0) goto Lb5
            java.lang.String r5 = r1.f5467c
            java.lang.String r6 = "advertisingId"
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r3.f5631d
            r3.put(r6, r5)
        Lb5:
            r1.f5468d = r4
            if (r0 == 0) goto Lc0
            java.lang.String r3 = r1.f5467c
            com.adcolony.sdk.r2$a r0 = (com.adcolony.sdk.C2275r2.C2276a) r0
            r0.m9511a(r3)
        Lc0:
            com.adcolony.sdk.z1 r0 = r1.f5465a
            r0.m9427b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.RunnableC2197l4.run():void");
    }
}
