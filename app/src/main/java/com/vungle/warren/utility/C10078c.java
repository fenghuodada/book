package com.vungle.warren.utility;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8690m;
import com.google.gson.C8695r;
import com.google.gson.C8699t;
import com.google.gson.C8703x;
import com.unity3d.ads.metadata.MediationMetaData;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.admarkup.AbstractC9853a;
import com.vungle.warren.model.admarkup.C9854b;
import com.vungle.warren.model.admarkup.C9855c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* renamed from: com.vungle.warren.utility.c */
/* loaded from: classes3.dex */
public final class C10078c {
    @Nullable
    /* renamed from: a */
    public static AbstractC9853a m1278a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            AbstractC8692o m3209b = C8699t.m3209b(str);
            if (!(m3209b instanceof C8695r)) {
                return null;
            }
            C8695r m3220n = m3209b.m3220n();
            int mo3204k = m3209b.m3220n().m3213w(MediationMetaData.KEY_VERSION).mo3204k();
            if (mo3204k != 1) {
                if (mo3204k != 2) {
                    return null;
                }
                return m1277b(m3220n);
            }
            return C9854b.m1453c(str);
        } catch (C8703x unused) {
            VungleLogger.m1603c(C10078c.class.getName(), "Encountered issue serializing models");
            return null;
        }
    }

    /* renamed from: b */
    public static C9855c m1277b(C8695r c8695r) {
        String mo3202p = c8695r.m3213w("adunit").mo3202p();
        C8690m m3221m = c8695r.m3213w(AdSDKNotificationListener.IMPRESSION_EVENT).m3221m();
        String[] strArr = new String[m3221m.size()];
        for (int i = 0; i < m3221m.size(); i++) {
            strArr[i] = m3221m.m3222t(i).mo3202p();
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(mo3202p, 0));
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[32];
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read != -1) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return new C9855c(C8699t.m3209b(sb.toString()).m3220n(), strArr);
                }
            }
        } catch (IOException unused) {
            VungleLogger.m1603c(C10078c.class.getName(), "Encountered issue serializing models");
            return null;
        }
    }
}
