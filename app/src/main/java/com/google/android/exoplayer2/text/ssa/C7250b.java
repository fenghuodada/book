package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7394a;
import com.google.common.base.C7929b;

/* renamed from: com.google.android.exoplayer2.text.ssa.b */
/* loaded from: classes.dex */
public final class C7250b {

    /* renamed from: a */
    public final int f13216a;

    /* renamed from: b */
    public final int f13217b;

    /* renamed from: c */
    public final int f13218c;

    /* renamed from: d */
    public final int f13219d;

    /* renamed from: e */
    public final int f13220e;

    public C7250b(int i, int i2, int i3, int i4, int i5) {
        this.f13216a = i;
        this.f13217b = i2;
        this.f13218c = i3;
        this.f13219d = i4;
        this.f13220e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    /* renamed from: a */
    public static C7250b m5325a(String str) {
        char c;
        C7394a.m5134a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String m4294a = C7929b.m4294a(split[i5].trim());
            m4294a.getClass();
            switch (m4294a.hashCode()) {
                case 100571:
                    if (m4294a.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (m4294a.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (m4294a.equals("start")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (m4294a.equals("style")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = i5;
                    break;
                case 1:
                    i4 = i5;
                    break;
                case 2:
                    i = i5;
                    break;
                case 3:
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new C7250b(i, i2, i3, i4, split.length);
    }
}
