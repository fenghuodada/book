package com.android.tool;

import android.app.Application;

/* renamed from: com.android.tool.a */
/* loaded from: classes.dex */
public class ApplicationC2534a extends Application {

    /* renamed from: a */
    public static ApplicationC2534a f6025a;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
        if (getString(com.ambrose.overwall.R.string.admobd).equals(cn.hutool.core.codec.C2026c.m9721b("Y2EtYXBwLXB1Yi0zNTcyNTk2MzM0Mjg4ODIxLzI2OTk5MDgyNzk=")) != false) goto L4;
     */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r5) {
        /*
            r4 = this;
            super.attachBaseContext(r5)
            java.lang.String r0 = "TXlBcHBsaWNhdGlvbg=="
            java.lang.String r0 = cn.hutool.core.codec.C2026c.m9721b(r0)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L89
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Exception -> L28
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Exception -> L28
            android.content.pm.PackageInfo r5 = r0.getPackageInfo(r5, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r5 = r5.versionName     // Catch: java.lang.Exception -> L28
            goto L31
        L28:
            r5 = move-exception
            java.lang.String r0 = "VersionInfo"
            java.lang.String r3 = "Exception"
            android.util.Log.e(r0, r3, r5)
            r5 = r1
        L31:
            java.lang.String r0 = "NC41LjE="
            java.lang.String r0 = cn.hutool.core.codec.C2026c.m9721b(r0)
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L89
            r5 = 2131951669(0x7f130035, float:1.953976E38)
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r0 = "Y2EtYXBwLXB1Yi0zNTcyNTk2MzM0Mjg4ODIxfjczMzIzMjYxNTI="
            java.lang.String r0 = cn.hutool.core.codec.C2026c.m9721b(r0)
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L89
            r5 = 2131951670(0x7f130036, float:1.9539761E38)
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r0 = "Y2EtYXBwLXB1Yi0zNTcyNTk2MzM0Mjg4ODIxLzY4NTk0NzkyODc="
            java.lang.String r0 = cn.hutool.core.codec.C2026c.m9721b(r0)
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L89
            r5 = 2131951671(0x7f130037, float:1.9539763E38)
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r0 = "Y2EtYXBwLXB1Yi0zNTcyNTk2MzM0Mjg4ODIxLzIwNTg0MDExMzM="
            java.lang.String r0 = cn.hutool.core.codec.C2026c.m9721b(r0)
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L89
            r5 = 2131951672(0x7f130038, float:1.9539765E38)
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r0 = "Y2EtYXBwLXB1Yi0zNTcyNTk2MzM0Mjg4ODIxLzI2OTk5MDgyNzk="
            java.lang.String r0 = cn.hutool.core.codec.C2026c.m9721b(r0)
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L8c
        L89:
            java.lang.System.exit(r2)
        L8c:
            java.util.HashSet r5 = androidx.multidex.C1524a.f3518a
            java.lang.String r5 = "Installing application"
            java.lang.String r0 = "MultiDex"
            android.util.Log.i(r0, r5)
            boolean r5 = androidx.multidex.C1524a.f3519b
            if (r5 == 0) goto L9c
            java.lang.String r5 = "VM has multidex support, MultiDex support library is disabled."
            goto Lc4
        L9c:
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()     // Catch: java.lang.Exception -> La1 java.lang.RuntimeException -> La3
            goto La9
        La1:
            r5 = move-exception
            goto Lc8
        La3:
            r5 = move-exception
            java.lang.String r2 = "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching."
            android.util.Log.w(r0, r2, r5)     // Catch: java.lang.Exception -> La1
        La9:
            if (r1 != 0) goto Lb1
            java.lang.String r5 = "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled."
            android.util.Log.i(r0, r5)     // Catch: java.lang.Exception -> La1
            goto Lc7
        Lb1:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> La1
            java.lang.String r2 = r1.sourceDir     // Catch: java.lang.Exception -> La1
            r5.<init>(r2)     // Catch: java.lang.Exception -> La1
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = r1.dataDir     // Catch: java.lang.Exception -> La1
            r2.<init>(r1)     // Catch: java.lang.Exception -> La1
            androidx.multidex.C1524a.m10505b(r4, r5, r2)     // Catch: java.lang.Exception -> La1
            java.lang.String r5 = "install done"
        Lc4:
            android.util.Log.i(r0, r5)
        Lc7:
            return
        Lc8:
            java.lang.String r1 = "MultiDex installation failure"
            android.util.Log.e(r0, r1, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MultiDex installation failed ("
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = ")."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.tool.ApplicationC2534a.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f6025a = this;
    }
}
