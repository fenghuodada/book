package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.C1155a1;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.signature.C3845b;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.model.k */
/* loaded from: classes.dex */
public final class C3620k implements InterfaceC3627o<Uri, File> {

    /* renamed from: a */
    public final Context f9555a;

    /* renamed from: com.bumptech.glide.load.model.k$a */
    /* loaded from: classes.dex */
    public static final class C3621a implements InterfaceC3629p<Uri, File> {

        /* renamed from: a */
        public final Context f9556a;

        public C3621a(Context context) {
            this.f9556a = context;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Uri, File> mo6572b(C3635s c3635s) {
            return new C3620k(this.f9556a);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.k$b */
    /* loaded from: classes.dex */
    public static class C3622b implements InterfaceC3452d<File> {

        /* renamed from: c */
        public static final String[] f9557c = {"_data"};

        /* renamed from: a */
        public final Context f9558a;

        /* renamed from: b */
        public final Uri f9559b;

        public C3622b(Context context, Uri uri) {
            this.f9558a = context;
            this.f9559b = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: a */
        public final Class<File> mo6579a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: b */
        public final void mo6578b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: d */
        public final EnumC3444a mo6577d() {
            return EnumC3444a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: e */
        public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super File> interfaceC3453a) {
            Cursor query = this.f9558a.getContentResolver().query(this.f9559b, f9557c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                interfaceC3453a.mo6589f(new File(r0));
                return;
            }
            interfaceC3453a.mo6590c(new FileNotFoundException("Failed to find file path for: " + this.f9559b));
        }
    }

    public C3620k(Context context) {
        this.f9555a = context;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Uri uri) {
        return C1155a1.m11147a(uri);
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a<File> mo6573b(@NonNull Uri uri, int i, int i2, @NonNull C3581i c3581i) {
        Uri uri2 = uri;
        return new InterfaceC3627o.C3628a<>(new C3845b(uri2), new C3622b(this.f9555a, uri2));
    }
}
