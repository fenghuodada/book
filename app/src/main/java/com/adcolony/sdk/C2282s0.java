package com.adcolony.sdk;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.adcolony.sdk.s0 */
/* loaded from: classes.dex */
public final class C2282s0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2218o0 f5553a;

    /* renamed from: com.adcolony.sdk.s0$a */
    /* loaded from: classes.dex */
    public static final class C2283a extends AbstractC10844k implements InterfaceC10809a<C10868p> {

        /* renamed from: a */
        public final /* synthetic */ C2218o0 f5554a;

        /* renamed from: b */
        public final /* synthetic */ C2100e2 f5555b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2283a(C2218o0 c2218o0, C2100e2 c2100e2) {
            super(0);
            this.f5554a = c2218o0;
            this.f5555b = c2100e2;
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final C10868p invoke() {
            this.f5554a.setTransparent(this.f5555b.f5098b.m9444o("transparent"));
            return C10868p.f21418a;
        }
    }

    public C2282s0(C2218o0 c2218o0) {
        this.f5553a = c2218o0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(@NotNull C2100e2 c2100e2) {
        C2218o0 c2218o0 = this.f5553a;
        C2218o0.m9576f(c2218o0, c2100e2, new C2283a(c2218o0, c2100e2));
    }
}
