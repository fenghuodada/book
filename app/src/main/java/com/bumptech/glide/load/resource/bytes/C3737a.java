package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.InterfaceC3454e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bytes.a */
/* loaded from: classes.dex */
public final class C3737a implements InterfaceC3454e<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f9720a;

    /* renamed from: com.bumptech.glide.load.resource.bytes.a$a */
    /* loaded from: classes.dex */
    public static class C3738a implements InterfaceC3454e.InterfaceC3455a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC3454e.InterfaceC3455a
        @NonNull
        /* renamed from: a */
        public final Class<ByteBuffer> mo6524a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3454e.InterfaceC3455a
        @NonNull
        /* renamed from: b */
        public final InterfaceC3454e<ByteBuffer> mo6523b(ByteBuffer byteBuffer) {
            return new C3737a(byteBuffer);
        }
    }

    public C3737a(ByteBuffer byteBuffer) {
        this.f9720a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3454e
    @NonNull
    /* renamed from: a */
    public final ByteBuffer mo6526a() throws IOException {
        ByteBuffer byteBuffer = this.f9720a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3454e
    /* renamed from: b */
    public final void mo6525b() {
    }
}
