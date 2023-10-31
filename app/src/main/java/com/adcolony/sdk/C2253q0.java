package com.adcolony.sdk;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.adcolony.sdk.q0 */
/* loaded from: classes.dex */
public final class C2253q0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2218o0 f5495a;

    /* renamed from: com.adcolony.sdk.q0$a */
    /* loaded from: classes.dex */
    public static final class C2254a extends AbstractC10844k implements InterfaceC10809a<C10868p> {

        /* renamed from: a */
        public final /* synthetic */ C2218o0 f5496a;

        /* renamed from: b */
        public final /* synthetic */ C2100e2 f5497b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2254a(C2218o0 c2218o0, C2100e2 c2100e2) {
            super(0);
            this.f5496a = c2218o0;
            this.f5497b = c2100e2;
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final C10868p invoke() {
            this.f5496a.setVisible(this.f5497b);
            return C10868p.f21418a;
        }
    }

    public C2253q0(C2218o0 c2218o0) {
        this.f5495a = c2218o0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(@NotNull C2100e2 c2100e2) {
        C2218o0 c2218o0 = this.f5495a;
        C2218o0.m9576f(c2218o0, c2100e2, new C2254a(c2218o0, c2100e2));
    }
}
