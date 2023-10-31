package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes.dex */
public abstract class AbstractC3450b<T> implements InterfaceC3452d<T> {

    /* renamed from: a */
    public final String f9193a;

    /* renamed from: b */
    public final AssetManager f9194b;

    /* renamed from: c */
    public T f9195c;

    public AbstractC3450b(AssetManager assetManager, String str) {
        this.f9194b = assetManager;
        this.f9193a = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    /* renamed from: b */
    public final void mo6578b() {
        T t = this.f9195c;
        if (t == null) {
            return;
        }
        try {
            mo6721c(t);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo6721c(T t) throws IOException;

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
    public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super T> interfaceC3453a) {
        try {
            T mo6720f = mo6720f(this.f9194b, this.f9193a);
            this.f9195c = mo6720f;
            interfaceC3453a.mo6589f(mo6720f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            interfaceC3453a.mo6590c(e);
        }
    }

    /* renamed from: f */
    public abstract T mo6720f(AssetManager assetManager, String str) throws IOException;
}
