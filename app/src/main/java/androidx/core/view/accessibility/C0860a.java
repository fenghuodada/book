package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.accessibility.a */
/* loaded from: classes.dex */
public final class C0860a extends ClickableSpan {

    /* renamed from: a */
    public final int f2601a;

    /* renamed from: b */
    public final C0874o f2602b;

    /* renamed from: c */
    public final int f2603c;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public C0860a(int i, @NonNull C0874o c0874o, int i2) {
        this.f2601a = i;
        this.f2602b = c0874o;
        this.f2603c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2601a);
        this.f2602b.f2606a.performAction(this.f2603c, bundle);
    }
}
