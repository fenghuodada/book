package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: com.google.android.exoplayer2.metadata.emsg.c */
/* loaded from: classes.dex */
public final class C7056c {

    /* renamed from: a */
    public final ByteArrayOutputStream f12503a;

    /* renamed from: b */
    public final DataOutputStream f12504b;

    public C7056c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.f12503a = byteArrayOutputStream;
        this.f12504b = new DataOutputStream(byteArrayOutputStream);
    }
}
