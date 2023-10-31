package com.vungle.warren;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: com.vungle.warren.s1 */
/* loaded from: classes3.dex */
public final class C9969s1 extends RequestBody {

    /* renamed from: a */
    public final /* synthetic */ RequestBody f20015a;

    /* renamed from: b */
    public final /* synthetic */ Buffer f20016b;

    public C9969s1(RequestBody requestBody, Buffer buffer) {
        this.f20015a = requestBody;
        this.f20016b = buffer;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f20016b.size();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f20015a.contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(@NonNull BufferedSink bufferedSink) throws IOException {
        bufferedSink.write(this.f20016b.snapshot());
    }
}
