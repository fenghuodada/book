package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.video.c */
/* loaded from: classes.dex */
public final class C7447c {

    /* renamed from: a */
    public final String f14011a;

    public C7447c(String str) {
        this.f14011a = str;
    }

    @Nullable
    /* renamed from: a */
    public static C7447c m4978a(C7436v c7436v) {
        String str;
        c7436v.m5018A(2);
        int m5002p = c7436v.m5002p();
        int i = m5002p >> 1;
        int m5002p2 = ((c7436v.m5002p() >> 3) & 31) | ((m5002p & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = m5002p2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(m5002p2);
        return new C7447c(sb.toString());
    }
}
