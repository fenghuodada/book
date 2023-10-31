package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes.dex */
public abstract class AbstractC3466l<T> implements InterfaceC3452d<T> {

    /* renamed from: a */
    public final Uri f9214a;

    /* renamed from: b */
    public final ContentResolver f9215b;

    /* renamed from: c */
    public T f9216c;

    public AbstractC3466l(ContentResolver contentResolver, Uri uri) {
        this.f9215b = contentResolver;
        this.f9214a = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    /* renamed from: b */
    public final void mo6578b() {
        T t = this.f9216c;
        if (t != null) {
            try {
                mo6715c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo6715c(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: d */
    public final EnumC3444a mo6577d() {
        return EnumC3444a.LOCAL;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    /* renamed from: e */
    public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super T> interfaceC3453a) {
        try {
            ?? r3 = (T) mo6714f(this.f9215b, this.f9214a);
            this.f9216c = r3;
            interfaceC3453a.mo6589f(r3);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            interfaceC3453a.mo6590c(e);
        }
    }

    /* renamed from: f */
    public abstract Object mo6714f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;
}
