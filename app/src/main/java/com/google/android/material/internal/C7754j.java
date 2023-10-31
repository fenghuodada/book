package com.google.android.material.internal;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.AbstractC7778f;
import com.google.android.material.resources.C7775d;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes3.dex */
public final class C7754j {

    /* renamed from: c */
    public float f15115c;
    @Nullable

    /* renamed from: e */
    public WeakReference<InterfaceC7756b> f15117e;
    @Nullable

    /* renamed from: f */
    public C7775d f15118f;

    /* renamed from: a */
    public final TextPaint f15113a = new TextPaint(1);

    /* renamed from: b */
    public final C7755a f15114b = new C7755a();

    /* renamed from: d */
    public boolean f15116d = true;

    /* renamed from: com.google.android.material.internal.j$a */
    /* loaded from: classes3.dex */
    public class C7755a extends AbstractC7778f {
        public C7755a() {
        }

        @Override // com.google.android.material.resources.AbstractC7778f
        /* renamed from: a */
        public final void mo4484a(int i) {
            C7754j c7754j = C7754j.this;
            c7754j.f15116d = true;
            InterfaceC7756b interfaceC7756b = c7754j.f15117e.get();
            if (interfaceC7756b != null) {
                interfaceC7756b.mo4512a();
            }
        }

        @Override // com.google.android.material.resources.AbstractC7778f
        /* renamed from: b */
        public final void mo4483b(@NonNull Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C7754j c7754j = C7754j.this;
            c7754j.f15116d = true;
            InterfaceC7756b interfaceC7756b = c7754j.f15117e.get();
            if (interfaceC7756b != null) {
                interfaceC7756b.mo4512a();
            }
        }
    }

    /* renamed from: com.google.android.material.internal.j$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7756b {
        /* renamed from: a */
        void mo4512a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C7754j(@Nullable InterfaceC7756b interfaceC7756b) {
        this.f15117e = new WeakReference<>(null);
        this.f15117e = new WeakReference<>(interfaceC7756b);
    }
}
