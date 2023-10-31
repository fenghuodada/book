package com.applovin.impl.adview;

import com.applovin.impl.sdk.C3349v;
import com.google.android.exoplayer2.mediacodec.C7024n;
import com.google.android.exoplayer2.mediacodec.C7032u;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.applovin.impl.adview.x */
/* loaded from: classes.dex */
public final /* synthetic */ class C2808x implements C7032u.InterfaceC7038f {
    /* renamed from: b */
    public static void m8855b(String str, String str2, C3349v c3349v, String str3) {
        c3349v.m6855b(str3, str + str2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7038f
    /* renamed from: a */
    public int mo5556a(Object obj) {
        String str = ((C7024n) obj).f12389a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (C7408g0.f13905a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }
}
