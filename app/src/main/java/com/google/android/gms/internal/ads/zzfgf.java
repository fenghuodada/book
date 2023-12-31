package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0235r;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfgf {
    private final zzefk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzezs zzf;
    private final zzezt zzg;
    private final Clock zzh;
    private final zzaqq zzi;

    public zzfgf(zzefk zzefkVar, zzbzz zzbzzVar, String str, String str2, Context context, @Nullable zzezs zzezsVar, @Nullable zzezt zzeztVar, Clock clock, zzaqq zzaqqVar) {
        this.zza = zzefkVar;
        this.zzb = zzbzzVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzezsVar;
        this.zzg = zzeztVar;
        this.zzh = clock;
        this.zzi = zzaqqVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_mpe@", C0235r.m12816a("2.", i2)));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String zzh(@Nullable String str) {
        return TextUtils.isEmpty(str) ? "" : zzbzs.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzi(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzezr zzezrVar, zzezf zzezfVar, List list) {
        return zzd(zzezrVar, zzezfVar, false, "", "", list);
    }

    public final List zzd(zzezr zzezrVar, @Nullable zzezf zzezfVar, boolean z, @Nullable String str, @Nullable String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String zzi = zzi(zzi(zzi((String) it.next(), "@gw_adlocid@", zzezrVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzezfVar != null) {
                zzi = zzbya.zzc(zzi(zzi(zzi(zzi, "@gw_qdata@", zzezfVar.zzz), "@gw_adnetid@", zzezfVar.zzy), "@gw_allocid@", zzezfVar.zzx), this.zze, zzezfVar.zzX);
            }
            String zzi2 = zzi(zzi(zzi(zzi, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdg)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !TextUtils.isEmpty(str2);
            if (z3) {
                z2 = z4;
            } else if (!z4) {
                arrayList.add(zzi2);
            }
            if (this.zzi.zzf(Uri.parse(zzi2))) {
                Uri.Builder buildUpon = Uri.parse(zzi2).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzi2 = buildUpon.build().toString();
            }
            arrayList.add(zzi2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzezf r10, java.util.List r11, com.google.android.gms.internal.ads.zzbuw r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r9.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r12.zzc()     // Catch: android.os.RemoteException -> La8
            int r12 = r12.zzb()     // Catch: android.os.RemoteException -> La8
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La8
            com.google.android.gms.internal.ads.zzbbc r4 = com.google.android.gms.internal.ads.zzbbk.zzdh
            com.google.android.gms.internal.ads.zzbbi r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzezt r4 = r9.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfov r4 = com.google.android.gms.internal.ads.zzfov.zzc()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.zzezs r4 = r4.zza
            goto L37
        L35:
            com.google.android.gms.internal.ads.zzezs r4 = r9.zzf
        L37:
            com.google.android.gms.internal.ads.zzfov r4 = com.google.android.gms.internal.ads.zzfov.zzd(r4)
        L3b:
            com.google.android.gms.internal.ads.zzfgd r5 = new com.google.android.gms.internal.ads.zzfon() { // from class: com.google.android.gms.internal.ads.zzfgd
                static {
                    /*
                        com.google.android.gms.internal.ads.zzfgd r0 = new com.google.android.gms.internal.ads.zzfgd
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.google.android.gms.internal.ads.zzfgd) com.google.android.gms.internal.ads.zzfgd.zza com.google.android.gms.internal.ads.zzfgd
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgd.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgd.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfon
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzezs r1 = (com.google.android.gms.internal.ads.zzezs) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.zzfgf.zza(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgd.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfov r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfge r7 = new com.google.android.gms.internal.ads.zzfon() { // from class: com.google.android.gms.internal.ads.zzfge
                static {
                    /*
                        com.google.android.gms.internal.ads.zzfge r0 = new com.google.android.gms.internal.ads.zzfge
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.google.android.gms.internal.ads.zzfge) com.google.android.gms.internal.ads.zzfge.zza com.google.android.gms.internal.ads.zzfge
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfge.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfge.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfon
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzezs r1 = (com.google.android.gms.internal.ads.zzezs) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.zzfgf.zzb(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfge.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfov r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L59:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzi(r6, r7, r12)
            java.lang.String r7 = r9.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzi(r6, r8, r7)
            android.content.Context r7 = r9.zze
            boolean r8 = r10.zzX
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbya.zzc(r6, r7, r8)
            r0.add(r6)
            goto L59
        La7:
            return r0
        La8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.zzbzt.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgf.zze(com.google.android.gms.internal.ads.zzezf, java.util.List, com.google.android.gms.internal.ads.zzbuw):java.util.List");
    }
}
