package com.google.android.exoplayer2.text.ttml;

import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.text.ttml.e */
/* loaded from: classes.dex */
public final class C7261e {
    @Nullable
    /* renamed from: a */
    public static TtmlStyle m5302a(@Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, Map<String, TtmlStyle> map) {
        int i = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i < length) {
                    ttmlStyle2.m5323a(map.get(strArr[i]));
                    i++;
                }
                return ttmlStyle2;
            }
        } else if (strArr != null && strArr.length == 1) {
            ttmlStyle.m5323a(map.get(strArr[0]));
            return ttmlStyle;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                ttmlStyle.m5323a(map.get(strArr[i]));
                i++;
            }
        }
        return ttmlStyle;
    }
}
