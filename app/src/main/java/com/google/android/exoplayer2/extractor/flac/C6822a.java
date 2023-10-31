package com.google.android.exoplayer2.extractor.flac;

import androidx.activity.result.C0054a;
import androidx.activity.result.InterfaceC0056b;
import com.google.android.exoplayer2.extractor.AbstractC6810a;
import com.google.android.exoplayer2.extractor.C6885o;
import com.google.android.exoplayer2.util.C7408g0;
import com.permissionx.guolindev.request.C8989s;
import com.permissionx.guolindev.request.C8991u;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.google.android.exoplayer2.extractor.flac.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C6822a implements AbstractC6810a.InterfaceC6814d, InterfaceC0056b {

    /* renamed from: b */
    public final /* synthetic */ Object f11146b;

    public /* synthetic */ C6822a(Object obj) {
        this.f11146b = obj;
    }

    @Override // com.google.android.exoplayer2.extractor.AbstractC6810a.InterfaceC6814d
    /* renamed from: a */
    public final long mo5943a(long j) {
        C6885o c6885o = (C6885o) this.f11146b;
        return C7408g0.m5098h((j * c6885o.f11540e) / 1000000, 0L, c6885o.f11545j - 1);
    }

    @Override // androidx.activity.result.InterfaceC0056b
    public final void onActivityResult(Object obj) {
        C8991u this$0 = (C8991u) this.f11146b;
        C0054a c0054a = (C0054a) obj;
        int i = C8991u.f17160l;
        C10843j.m430f(this$0, "this$0");
        this$0.m2825j(new C8989s(this$0));
    }
}
