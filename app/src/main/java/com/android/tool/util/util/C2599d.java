package com.android.tool.util.util;

import android.content.pm.PackageManager;
import androidx.appcompat.C0157c;
import cn.hutool.core.codec.C2024a;
import cn.hutool.core.codec.C2027d;
import cn.hutool.core.util.C2030a;
import cn.hutool.crypto.symmetric.C2035a;
import com.android.tool.ApplicationC2534a;

/* renamed from: com.android.tool.util.util.d */
/* loaded from: classes.dex */
public final class C2599d {
    /* renamed from: a */
    public static String m9341a(String str) {
        String str2;
        byte[] bytes;
        try {
            str2 = C0157c.m12922a(ApplicationC2534a.f6025a.getPackageManager().getPackageInfo(ApplicationC2534a.f6025a.getPackageName(), 64).signatures[0].toByteArray());
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            str2 = "";
        }
        if (str2 == null) {
            bytes = null;
        } else {
            bytes = str2.getBytes();
        }
        return new C2035a(bytes).m9711a(C2027d.m9719a(str), C2030a.f4901a);
    }

    /* renamed from: b */
    public static String m9340b(String str) {
        byte[] bytes;
        int i;
        String str2 = "";
        try {
            str2 = C0157c.m12921b(ApplicationC2534a.f6025a.getPackageManager().getPackageInfo(ApplicationC2534a.f6025a.getPackageName(), 64).signatures[0].toByteArray()).replaceAll("a", "").replaceAll("2", "").replaceAll(C2024a.m9723a("GJRA"), "").replaceAll("p", "").replaceAll("0", "");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (str2 == null) {
            bytes = null;
        } else {
            bytes = str2.getBytes();
        }
        C2035a c2035a = new C2035a(bytes);
        int length = str.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            int charAt = str.charAt(i2);
            if (charAt >= 48 && charAt <= 57) {
                int i3 = (charAt - 48) - 13;
                while (i3 < 0) {
                    i3 += 10;
                }
                charAt = i3 + 48;
            }
            int i4 = 65;
            if (charAt >= 65 && charAt <= 90) {
                i = (charAt - 65) - 13;
                while (i < 0) {
                    i += 26;
                }
            } else {
                i4 = 97;
                if (charAt >= 97 && charAt <= 122) {
                    i = (charAt - 97) - 13;
                    if (i < 0) {
                        i += 26;
                    }
                }
                cArr[i2] = (char) charAt;
            }
            charAt = i + i4;
            cArr[i2] = (char) charAt;
        }
        return c2035a.m9711a(C2027d.m9719a(new String(cArr)), C2030a.f4901a);
    }
}
