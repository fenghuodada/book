package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.InterfaceC3454e;
import java.util.HashMap;

/* renamed from: com.bumptech.glide.load.data.f */
/* loaded from: classes.dex */
public final class C3456f {

    /* renamed from: b */
    public static final C3457a f9200b = new C3457a();

    /* renamed from: a */
    public final HashMap f9201a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    /* loaded from: classes.dex */
    public class C3457a implements InterfaceC3454e.InterfaceC3455a<Object> {
        @Override // com.bumptech.glide.load.data.InterfaceC3454e.InterfaceC3455a
        @NonNull
        /* renamed from: a */
        public final Class<Object> mo6524a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3454e.InterfaceC3455a
        @NonNull
        /* renamed from: b */
        public final InterfaceC3454e<Object> mo6523b(@NonNull Object obj) {
            return new C3458b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    /* loaded from: classes.dex */
    public static final class C3458b implements InterfaceC3454e<Object> {

        /* renamed from: a */
        public final Object f9202a;

        public C3458b(@NonNull Object obj) {
            this.f9202a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3454e
        @NonNull
        /* renamed from: a */
        public final Object mo6526a() {
            return this.f9202a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3454e
        /* renamed from: b */
        public final void mo6525b() {
        }
    }
}
