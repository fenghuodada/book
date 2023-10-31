package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.data.C3460h;
import com.bumptech.glide.load.data.C3467m;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.signature.C3845b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.a */
/* loaded from: classes.dex */
public final class C3586a<Data> implements InterfaceC3627o<Uri, Data> {

    /* renamed from: a */
    public final AssetManager f9524a;

    /* renamed from: b */
    public final InterfaceC3587a<Data> f9525b;

    /* renamed from: com.bumptech.glide.load.model.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3587a<Data> {
        /* renamed from: a */
        InterfaceC3452d<Data> mo6605a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.model.a$b */
    /* loaded from: classes.dex */
    public static class C3588b implements InterfaceC3629p<Uri, ParcelFileDescriptor>, InterfaceC3587a<ParcelFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f9526a;

        public C3588b(AssetManager assetManager) {
            this.f9526a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.C3586a.InterfaceC3587a
        /* renamed from: a */
        public final InterfaceC3452d<ParcelFileDescriptor> mo6605a(AssetManager assetManager, String str) {
            return new C3460h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Uri, ParcelFileDescriptor> mo6572b(C3635s c3635s) {
            return new C3586a(this.f9526a, this);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.a$c */
    /* loaded from: classes.dex */
    public static class C3589c implements InterfaceC3629p<Uri, InputStream>, InterfaceC3587a<InputStream> {

        /* renamed from: a */
        public final AssetManager f9527a;

        public C3589c(AssetManager assetManager) {
            this.f9527a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.C3586a.InterfaceC3587a
        /* renamed from: a */
        public final InterfaceC3452d<InputStream> mo6605a(AssetManager assetManager, String str) {
            return new C3467m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Uri, InputStream> mo6572b(C3635s c3635s) {
            return new C3586a(this.f9527a, this);
        }
    }

    public C3586a(AssetManager assetManager, InterfaceC3587a<Data> interfaceC3587a) {
        this.f9524a = assetManager;
        this.f9525b = interfaceC3587a;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Uri uri) {
        Uri uri2 = uri;
        if (!"file".equals(uri2.getScheme()) || uri2.getPathSegments().isEmpty() || !"android_asset".equals(uri2.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a mo6573b(@NonNull Uri uri, int i, int i2, @NonNull C3581i c3581i) {
        Uri uri2 = uri;
        return new InterfaceC3627o.C3628a(new C3845b(uri2), this.f9525b.mo6605a(this.f9524a, uri2.toString().substring(22)));
    }
}
