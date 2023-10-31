package com.google.android.exoplayer2.upstream;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C7373q;
import com.google.android.exoplayer2.upstream.InterfaceC7363i;

/* renamed from: com.google.android.exoplayer2.upstream.p */
/* loaded from: classes.dex */
public final class C7372p implements InterfaceC7363i.InterfaceC7364a {

    /* renamed from: a */
    public final Context f13822a;
    @Nullable

    /* renamed from: b */
    public final InterfaceC7351c0 f13823b;

    /* renamed from: c */
    public final InterfaceC7363i.InterfaceC7364a f13824c;

    public C7372p(Context context, @Nullable String str) {
        C7373q.C7374a c7374a = new C7373q.C7374a();
        c7374a.f13840b = str;
        this.f13822a = context.getApplicationContext();
        this.f13823b = null;
        this.f13824c = c7374a;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i.InterfaceC7364a
    /* renamed from: a */
    public final InterfaceC7363i mo5147a() {
        C7371o c7371o = new C7371o(this.f13822a, this.f13824c.mo5147a());
        InterfaceC7351c0 interfaceC7351c0 = this.f13823b;
        if (interfaceC7351c0 != null) {
            c7371o.mo5158c(interfaceC7351c0);
        }
        return c7371o;
    }
}
