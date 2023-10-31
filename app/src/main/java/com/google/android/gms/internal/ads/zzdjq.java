package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdjq {
    private final zzfwc zza;
    private final zzdkd zzb;
    private final zzdki zzc;

    public zzdjq(zzfwc zzfwcVar, zzdkd zzdkdVar, zzdki zzdkiVar) {
        this.zza = zzfwcVar;
        this.zzb = zzdkdVar;
        this.zzc = zzdkiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzfwb zza(final com.google.android.gms.internal.ads.zzezr r16, final com.google.android.gms.internal.ads.zzezf r17, final org.json.JSONObject r18) {
        /*
            r15 = this;
            r12 = r15
            r0 = r16
            r1 = r17
            r7 = r18
            com.google.android.gms.internal.ads.zzfwc r2 = r12.zza
            com.google.android.gms.internal.ads.zzdjo r3 = new com.google.android.gms.internal.ads.zzdjo
            r3.<init>()
            com.google.android.gms.internal.ads.zzfwb r2 = r2.zzb(r3)
            com.google.android.gms.internal.ads.zzdkd r3 = r12.zzb
            java.lang.String r4 = "images"
            com.google.android.gms.internal.ads.zzfwb r3 = r3.zzf(r7, r4)
            com.google.android.gms.internal.ads.zzdkd r5 = r12.zzb
            com.google.android.gms.internal.ads.zzezq r6 = r0.zzb
            com.google.android.gms.internal.ads.zzezi r6 = r6.zzb
            com.google.android.gms.internal.ads.zzfwb r9 = r5.zzg(r7, r4, r1, r6)
            java.lang.String r4 = "secondary_image"
            com.google.android.gms.internal.ads.zzdkd r5 = r12.zzb
            com.google.android.gms.internal.ads.zzfwb r5 = r5.zze(r7, r4)
            java.lang.String r4 = "app_icon"
            com.google.android.gms.internal.ads.zzdkd r6 = r12.zzb
            com.google.android.gms.internal.ads.zzfwb r4 = r6.zze(r7, r4)
            java.lang.String r6 = "attribution"
            com.google.android.gms.internal.ads.zzdkd r8 = r12.zzb
            com.google.android.gms.internal.ads.zzfwb r6 = r8.zzd(r7, r6)
            com.google.android.gms.internal.ads.zzdkd r8 = r12.zzb
            com.google.android.gms.internal.ads.zzezq r0 = r0.zzb
            com.google.android.gms.internal.ads.zzezi r0 = r0.zzb
            com.google.android.gms.internal.ads.zzfwb r8 = r8.zzh(r7, r1, r0)
            java.lang.String r0 = "custom_assets"
            com.google.android.gms.internal.ads.zzdki r1 = r12.zzc
            com.google.android.gms.internal.ads.zzfwb r11 = r1.zza(r7, r0)
            com.google.android.gms.internal.ads.zzdkd r0 = r12.zzb
            java.lang.String r1 = "enable_omid"
            boolean r1 = r7.optBoolean(r1)
            r10 = 0
            if (r1 != 0) goto L5f
        L59:
            com.google.android.gms.internal.ads.zzfwb r0 = com.google.android.gms.internal.ads.zzfvr.zzh(r10)
        L5d:
            r10 = r0
            goto L85
        L5f:
            java.lang.String r1 = "omid_settings"
            org.json.JSONObject r1 = r7.optJSONObject(r1)
            if (r1 != 0) goto L68
            goto L59
        L68:
            java.lang.String r13 = "omid_html"
            java.lang.String r1 = r1.optString(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r1)
            if (r13 == 0) goto L75
            goto L59
        L75:
            com.google.android.gms.internal.ads.zzfwb r10 = com.google.android.gms.internal.ads.zzfvr.zzh(r10)
            com.google.android.gms.internal.ads.zzdjs r13 = new com.google.android.gms.internal.ads.zzdjs
            r13.<init>()
            com.google.android.gms.internal.ads.zzfwc r0 = com.google.android.gms.internal.ads.zzcag.zze
            com.google.android.gms.internal.ads.zzfwb r0 = com.google.android.gms.internal.ads.zzfvr.zzm(r10, r13, r0)
            goto L5d
        L85:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            r0.add(r3)
            r0.add(r9)
            r0.add(r5)
            r0.add(r4)
            r0.add(r6)
            r0.add(r8)
            r0.add(r11)
            com.google.android.gms.internal.ads.zzbbc r1 = com.google.android.gms.internal.ads.zzbbk.zzeQ
            com.google.android.gms.internal.ads.zzbbi r13 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r13.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lb7
            r0.add(r10)
        Lb7:
            com.google.android.gms.internal.ads.zzfvq r13 = com.google.android.gms.internal.ads.zzfvr.zza(r0)
            com.google.android.gms.internal.ads.zzdjp r14 = new com.google.android.gms.internal.ads.zzdjp
            r0 = r14
            r1 = r15
            r7 = r18
            r0.<init>()
            com.google.android.gms.internal.ads.zzfwc r0 = r12.zza
            com.google.android.gms.internal.ads.zzfwb r0 = r13.zza(r14, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjq.zza(com.google.android.gms.internal.ads.zzezr, com.google.android.gms.internal.ads.zzezf, org.json.JSONObject):com.google.android.gms.internal.ads.zzfwb");
    }
}
