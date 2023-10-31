package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.x */
/* loaded from: classes.dex */
public final class C7383x {

    /* renamed from: a */
    public final HashMap f13849a = new HashMap();
    @Nullable

    /* renamed from: b */
    public Map<String, String> f13850b;

    /* renamed from: a */
    public final synchronized Map<String, String> m5142a() {
        if (this.f13850b == null) {
            this.f13850b = Collections.unmodifiableMap(new HashMap(this.f13849a));
        }
        return this.f13850b;
    }
}
