package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import com.facebook.ads.AdError;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.w */
/* loaded from: classes.dex */
public final class C7382w extends HttpDataSource$HttpDataSourceException {

    /* renamed from: b */
    public final int f13847b;

    /* renamed from: c */
    public final Map<String, List<String>> f13848c;

    public C7382w(int i, @Nullable C7365j c7365j, Map map) {
        super(C0510h.m12340a(26, "Response code: ", i), c7365j, (int) AdError.INTERNAL_ERROR_2004);
        this.f13847b = i;
        this.f13848c = map;
    }
}
