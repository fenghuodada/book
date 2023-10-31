package com.qmuiteam.qmui.util;

import android.annotation.SuppressLint;
import android.os.Build;

@SuppressLint({"PrivateApi"})
/* renamed from: com.qmuiteam.qmui.util.a */
/* loaded from: classes3.dex */
public final class C9140a {

    /* renamed from: b */
    public static final String f17574b;

    /* renamed from: c */
    public static final String f17575c;

    /* renamed from: a */
    public static final String[] f17573a = {"m9", "M9", "mx", "MX"};

    /* renamed from: d */
    public static final String f17576d = Build.BRAND.toLowerCase();

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[Catch: Exception -> 0x009d, TRY_ENTER, TryCatch #3 {Exception -> 0x009d, blocks: (B:22:0x0053, B:27:0x007c, B:28:0x0080, B:33:0x0097, B:34:0x009b), top: B:43:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[Catch: Exception -> 0x009d, TRY_ENTER, TryCatch #3 {Exception -> 0x009d, blocks: (B:22:0x0053, B:27:0x007c, B:28:0x0080, B:33:0x0097, B:34:0x009b), top: B:43:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "m9"
            java.lang.String r1 = "M9"
            java.lang.String r2 = "mx"
            java.lang.String r3 = "MX"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.qmuiteam.qmui.util.C9140a.f17573a = r0
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r0.toLowerCase()
            com.qmuiteam.qmui.util.C9140a.f17576d = r0
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 0
            if (r1 >= r2) goto L53
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4d
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4d
            java.lang.String r5 = "build.prop"
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4d
            r0.load(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4e
            r1.close()     // Catch: java.io.IOException -> L39
            goto L53
        L39:
            r1 = move-exception
            r1.printStackTrace()
            goto L53
        L3e:
            r0 = move-exception
            r3 = r1
            goto L42
        L41:
            r0 = move-exception
        L42:
            if (r3 == 0) goto L4c
            r3.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r1 = move-exception
            r1.printStackTrace()
        L4c:
            throw r0
        L4d:
            r1 = r3
        L4e:
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.io.IOException -> L39
        L53:
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L9d
            java.lang.String r2 = "get"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L9d
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Exception -> L9d
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.Exception -> L9d
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r5 = r0.getProperty(r2)     // Catch: java.lang.Exception -> L9d
            if (r5 != 0) goto L7a
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L7a
            r6[r7] = r2     // Catch: java.lang.Exception -> L7a
            java.lang.Object r2 = r1.invoke(r3, r6)     // Catch: java.lang.Exception -> L7a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L7a
            r5 = r2
        L7a:
            if (r5 == 0) goto L80
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.lang.Exception -> L9d
        L80:
            com.qmuiteam.qmui.util.C9140a.f17574b = r5     // Catch: java.lang.Exception -> L9d
            java.lang.String r2 = "ro.build.display.id"
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L95
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L95
            r4[r7] = r2     // Catch: java.lang.Exception -> L95
            java.lang.Object r1 = r1.invoke(r3, r4)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L95
            r0 = r1
        L95:
            if (r0 == 0) goto L9b
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Exception -> L9d
        L9b:
            com.qmuiteam.qmui.util.C9140a.f17575c = r0     // Catch: java.lang.Exception -> L9d
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.util.C9140a.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2647a(int r7) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = com.qmuiteam.qmui.util.C9140a.f17575c
            if (r2 == 0) goto L3b
            java.lang.String r3 = ""
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "(\\d+\\.){2}\\d"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r3.find()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3b
            java.lang.String r3 = r3.group()     // Catch: java.lang.Throwable -> L3b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L3b
            if (r4 <= 0) goto L3b
            java.lang.String r4 = "\\."
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L3b
            int r4 = r3.length     // Catch: java.lang.Throwable -> L3b
            if (r4 < r0) goto L3b
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L3b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 >= r7) goto L3b
            r7 = r0
            goto L3c
        L3b:
            r7 = r1
        L3c:
            java.lang.String[] r3 = com.qmuiteam.qmui.util.C9140a.f17573a
            java.lang.String r4 = android.os.Build.BOARD
            if (r4 != 0) goto L43
            goto L54
        L43:
            r5 = r1
        L44:
            r6 = 4
            if (r5 >= r6) goto L54
            r6 = r3[r5]
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L51
            r3 = r0
            goto L55
        L51:
            int r5 = r5 + 1
            goto L44
        L54:
            r3 = r1
        L55:
            if (r3 != 0) goto L6d
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L67
            java.lang.String r3 = "flyme"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L67
            r2 = r0
            goto L68
        L67:
            r2 = r1
        L68:
            if (r2 == 0) goto L6b
            goto L6d
        L6b:
            r2 = r1
            goto L6e
        L6d:
            r2 = r0
        L6e:
            if (r2 == 0) goto L73
            if (r7 == 0) goto L73
            goto L74
        L73:
            r0 = r1
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.util.C9140a.m2647a(int):boolean");
    }
}
