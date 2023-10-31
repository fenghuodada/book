package com.android.tool.util.util.request;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;

/* renamed from: com.android.tool.util.util.request.b */
/* loaded from: classes.dex */
public final class C2605b {
    /* renamed from: a */
    public static String m9334a(Context context) {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                byte[] digest = messageDigest.digest();
                char[] cArr = new char[32];
                int i = 0;
                for (int i2 = 0; i2 < 16; i2++) {
                    byte b = digest[i2];
                    int i3 = i + 1;
                    char[] cArr2 = C2604a.f6122a;
                    cArr[i] = cArr2[(b >>> 4) & 15];
                    i = i3 + 1;
                    cArr[i3] = cArr2[b & 15];
                }
                return new String(cArr);
            } catch (Exception unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(17:41|42|4|5|6|7|(11:35|36|10|(2:31|32)|12|13|14|(4:17|(2:19|20)(1:22)|21|15)|23|24|25)|9|10|(0)|12|13|14|(1:15)|23|24|25)|3|4|5|6|7|(0)|9|10|(0)|12|13|14|(1:15)|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bd, code lost:
        r3 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011e A[Catch: Exception -> 0x0154, TryCatch #4 {Exception -> 0x0154, blocks: (B:20:0x0100, B:21:0x011b, B:23:0x011e, B:25:0x0126, B:26:0x0137, B:27:0x014d), top: B:43:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m9333b(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.tool.util.util.request.C2605b.m9333b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    public static boolean m9332c(Context context, String str) {
        String[] strArr;
        try {
            strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            strArr = null;
        }
        ArrayList arrayList = new ArrayList();
        if (strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
        }
        return arrayList.contains(str);
    }
}
