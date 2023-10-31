package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.C7373q;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.InterfaceC7380u;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.common.base.C7935d;
import com.google.common.collect.C8000o0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.drm.y */
/* loaded from: classes.dex */
public final class C6804y implements InterfaceC6765a0 {

    /* renamed from: a */
    public final InterfaceC7380u f11059a;
    @Nullable

    /* renamed from: b */
    public final String f11060b;

    /* renamed from: c */
    public final boolean f11061c;

    /* renamed from: d */
    public final HashMap f11062d;

    public C6804y(@Nullable String str, boolean z, C7373q.C7374a c7374a) {
        C7394a.m5134a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f11059a = c7374a;
        this.f11060b = str;
        this.f11061c = z;
        this.f11062d = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #4 {Exception -> 0x00e4, blocks: (B:3:0x003e, B:13:0x0062, B:14:0x0064, B:36:0x00d1, B:37:0x00d3, B:4:0x0043, B:5:0x004e, B:7:0x0055, B:12:0x005e, B:16:0x0068, B:35:0x0099, B:39:0x00dd, B:26:0x007b, B:28:0x007f, B:30:0x0089, B:32:0x008f), top: B:53:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m5961b(com.google.android.exoplayer2.upstream.InterfaceC7380u r36, java.lang.String r37, @androidx.annotation.Nullable byte[] r38, java.util.Map<java.lang.String, java.lang.String> r39) throws com.google.android.exoplayer2.drm.C6773b0 {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.C6804y.m5961b(com.google.android.exoplayer2.upstream.u, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* renamed from: a */
    public final byte[] m5962a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws C6773b0 {
        String str;
        String str2 = keyRequest.f10980b;
        if (this.f11061c || TextUtils.isEmpty(str2)) {
            str2 = this.f11060b;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C6622C.f10470e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (C6622C.f10468c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f11062d) {
                hashMap.putAll(this.f11062d);
            }
            return m5961b(this.f11059a, str2, keyRequest.f10979a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        C7394a.m5129f(uri, "The uri must be set.");
        throw new C6773b0(new DataSpec(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, C8000o0.f15789g, 0L, new IllegalStateException("No license URL"));
    }

    /* renamed from: c */
    public final byte[] m5960c(ExoMediaDrm.C6763c c6763c) throws C6773b0 {
        String str = c6763c.f10982b;
        int i = C7408g0.f13905a;
        String str2 = new String(c6763c.f10981a, C7935d.f15693c);
        StringBuilder sb = new StringBuilder(str2.length() + C0552c.m12193a(str, 15));
        sb.append(str);
        sb.append("&signedRequest=");
        sb.append(str2);
        return m5961b(this.f11059a, sb.toString(), null, Collections.emptyMap());
    }
}
