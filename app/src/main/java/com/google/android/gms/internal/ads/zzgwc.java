package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgwc {
    private static String zza;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
        if (r6.contains("com.google.android.apps.chrome") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zza(android.content.Context r10) {
        /*
            java.lang.String r0 = com.google.android.gms.internal.ads.zzgwc.zza
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.String r3 = "http://www.example.com"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r1.<init>(r2, r3)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L23
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L24
        L23:
            r3 = r4
        L24:
            java.util.List r5 = r0.queryIntentActivities(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "android.support.customtabs.action.CustomTabsService"
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L31
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L31
        L5c:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L66
            com.google.android.gms.internal.ads.zzgwc.zza = r4
            goto Le9
        L66:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L77
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
        L73:
            com.google.android.gms.internal.ads.zzgwc.zza = r10
            goto Le9
        L77:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lc5
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.RuntimeException -> Lb5
            r0 = 64
            java.util.List r10 = r10.queryIntentActivities(r1, r0)     // Catch: java.lang.RuntimeException -> Lb5
            if (r10 == 0) goto Lbc
            int r0 = r10.size()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 != 0) goto L90
            goto Lbc
        L90:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.RuntimeException -> Lb5
        L94:
            boolean r0 = r10.hasNext()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r10.next()     // Catch: java.lang.RuntimeException -> Lb5
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.RuntimeException -> Lb5
            android.content.IntentFilter r1 = r0.filter     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            int r2 = r1.countDataAuthorities()     // Catch: java.lang.RuntimeException -> Lb5
            if (r2 == 0) goto L94
            int r1 = r1.countDataPaths()     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto L94
            goto Lc5
        Lb5:
            java.lang.String r10 = "CustomTabsHelper"
            java.lang.String r0 = "Runtime exception while getting specialized handlers"
            android.util.Log.e(r10, r0)
        Lbc:
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto Lc5
            com.google.android.gms.internal.ads.zzgwc.zza = r3
            goto Le9
        Lc5:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Lce
        Lcd:
            goto L73
        Lce:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ld7
            goto Lcd
        Ld7:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Le0
            goto Lcd
        Le0:
            java.lang.String r10 = "com.google.android.apps.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Le9
            goto Lcd
        Le9:
            java.lang.String r10 = com.google.android.gms.internal.ads.zzgwc.zza
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgwc.zza(android.content.Context):java.lang.String");
    }
}
