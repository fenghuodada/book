package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.i */
/* loaded from: classes.dex */
public interface InterfaceC7363i extends InterfaceC7361g {

    /* renamed from: com.google.android.exoplayer2.upstream.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7364a {
        /* renamed from: a */
        InterfaceC7363i mo5147a();
    }

    /* renamed from: c */
    void mo5158c(InterfaceC7351c0 interfaceC7351c0);

    void close() throws IOException;

    /* renamed from: g */
    long mo5146g(DataSpec dataSpec) throws IOException;

    /* renamed from: h */
    Map<String, List<String>> mo5154h();

    @Nullable
    /* renamed from: k */
    Uri mo5145k();
}
