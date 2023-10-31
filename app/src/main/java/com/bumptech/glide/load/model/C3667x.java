package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.data.C3449a;
import com.bumptech.glide.load.data.C3461i;
import com.bumptech.glide.load.data.C3474n;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.signature.C3845b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.model.x */
/* loaded from: classes.dex */
public final class C3667x<Data> implements InterfaceC3627o<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f9626b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    public final InterfaceC3670c<Data> f9627a;

    /* renamed from: com.bumptech.glide.load.model.x$a */
    /* loaded from: classes.dex */
    public static final class C3668a implements InterfaceC3629p<Uri, AssetFileDescriptor>, InterfaceC3670c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f9628a;

        public C3668a(ContentResolver contentResolver) {
            this.f9628a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.C3667x.InterfaceC3670c
        /* renamed from: a */
        public final InterfaceC3452d<AssetFileDescriptor> mo6575a(Uri uri) {
            return new C3449a(this.f9628a, uri);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        /* renamed from: b */
        public final InterfaceC3627o<Uri, AssetFileDescriptor> mo6572b(C3635s c3635s) {
            return new C3667x(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.x$b */
    /* loaded from: classes.dex */
    public static class C3669b implements InterfaceC3629p<Uri, ParcelFileDescriptor>, InterfaceC3670c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f9629a;

        public C3669b(ContentResolver contentResolver) {
            this.f9629a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.C3667x.InterfaceC3670c
        /* renamed from: a */
        public final InterfaceC3452d<ParcelFileDescriptor> mo6575a(Uri uri) {
            return new C3461i(this.f9629a, uri);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Uri, ParcelFileDescriptor> mo6572b(C3635s c3635s) {
            return new C3667x(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.x$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3670c<Data> {
        /* renamed from: a */
        InterfaceC3452d<Data> mo6575a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.model.x$d */
    /* loaded from: classes.dex */
    public static class C3671d implements InterfaceC3629p<Uri, InputStream>, InterfaceC3670c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f9630a;

        public C3671d(ContentResolver contentResolver) {
            this.f9630a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.C3667x.InterfaceC3670c
        /* renamed from: a */
        public final InterfaceC3452d<InputStream> mo6575a(Uri uri) {
            return new C3474n(this.f9630a, uri);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Uri, InputStream> mo6572b(C3635s c3635s) {
            return new C3667x(this);
        }
    }

    public C3667x(InterfaceC3670c<Data> interfaceC3670c) {
        this.f9627a = interfaceC3670c;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Uri uri) {
        return f9626b.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a mo6573b(@NonNull Uri uri, int i, int i2, @NonNull C3581i c3581i) {
        Uri uri2 = uri;
        return new InterfaceC3627o.C3628a(new C3845b(uri2), this.f9627a.mo6575a(uri2));
    }
}
