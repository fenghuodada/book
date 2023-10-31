package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.model.InterfaceC3627o;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.t */
/* loaded from: classes.dex */
public final class C3654t<Data> implements InterfaceC3627o<Integer, Data> {

    /* renamed from: a */
    public final InterfaceC3627o<Uri, Data> f9615a;

    /* renamed from: b */
    public final Resources f9616b;

    /* renamed from: com.bumptech.glide.load.model.t$a */
    /* loaded from: classes.dex */
    public static final class C3655a implements InterfaceC3629p<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f9617a;

        public C3655a(Resources resources) {
            this.f9617a = resources;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        /* renamed from: b */
        public final InterfaceC3627o<Integer, AssetFileDescriptor> mo6572b(C3635s c3635s) {
            return new C3654t(this.f9617a, c3635s.m6585c(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.t$b */
    /* loaded from: classes.dex */
    public static class C3656b implements InterfaceC3629p<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f9618a;

        public C3656b(Resources resources) {
            this.f9618a = resources;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Integer, ParcelFileDescriptor> mo6572b(C3635s c3635s) {
            return new C3654t(this.f9618a, c3635s.m6585c(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.t$c */
    /* loaded from: classes.dex */
    public static class C3657c implements InterfaceC3629p<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f9619a;

        public C3657c(Resources resources) {
            this.f9619a = resources;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Integer, InputStream> mo6572b(C3635s c3635s) {
            return new C3654t(this.f9619a, c3635s.m6585c(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.t$d */
    /* loaded from: classes.dex */
    public static class C3658d implements InterfaceC3629p<Integer, Uri> {

        /* renamed from: a */
        public final Resources f9620a;

        public C3658d(Resources resources) {
            this.f9620a = resources;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Integer, Uri> mo6572b(C3635s c3635s) {
            return new C3654t(this.f9620a, C3664w.f9623a);
        }
    }

    public C3654t(Resources resources, InterfaceC3627o<Uri, Data> interfaceC3627o) {
        this.f9616b = resources;
        this.f9615a = interfaceC3627o;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6574a(@NonNull Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a mo6573b(@NonNull Integer num, int i, int i2, @NonNull C3581i c3581i) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f9616b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f9615a.mo6573b(uri, i, i2, c3581i);
    }
}
