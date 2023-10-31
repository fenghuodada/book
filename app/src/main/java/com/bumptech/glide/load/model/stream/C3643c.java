package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1155a1;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.data.mediastore.C3469b;
import com.bumptech.glide.load.model.C3635s;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.load.model.InterfaceC3629p;
import com.bumptech.glide.load.resource.bitmap.C3690f0;
import com.bumptech.glide.signature.C3845b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.c */
/* loaded from: classes.dex */
public final class C3643c implements InterfaceC3627o<Uri, InputStream> {

    /* renamed from: a */
    public final Context f9595a;

    /* renamed from: com.bumptech.glide.load.model.stream.c$a */
    /* loaded from: classes.dex */
    public static class C3644a implements InterfaceC3629p<Uri, InputStream> {

        /* renamed from: a */
        public final Context f9596a;

        public C3644a(Context context) {
            this.f9596a = context;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Uri, InputStream> mo6572b(C3635s c3635s) {
            return new C3643c(this.f9596a);
        }
    }

    public C3643c(Context context) {
        this.f9595a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Uri uri) {
        Uri uri2 = uri;
        if (C1155a1.m11147a(uri2) && uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    @Nullable
    /* renamed from: b */
    public final InterfaceC3627o.C3628a<InputStream> mo6573b(@NonNull Uri uri, int i, int i2, @NonNull C3581i c3581i) {
        boolean z;
        Uri uri2 = uri;
        boolean z2 = true;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Long l = (Long) c3581i.m6606c(C3690f0.f9652d);
            if (l == null || l.longValue() != -1) {
                z2 = false;
            }
            if (z2) {
                C3845b c3845b = new C3845b(uri2);
                Context context = this.f9595a;
                return new InterfaceC3627o.C3628a<>(c3845b, C3469b.m6718c(context, uri2, new C3469b.C3471b(context.getContentResolver())));
            }
        }
        return null;
    }
}
