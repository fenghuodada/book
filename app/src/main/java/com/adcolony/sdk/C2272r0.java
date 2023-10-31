package com.adcolony.sdk;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.adcolony.sdk.r0 */
/* loaded from: classes.dex */
public final class C2272r0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2218o0 f5530a;

    /* renamed from: com.adcolony.sdk.r0$a */
    /* loaded from: classes.dex */
    public static final class C2273a extends AbstractC10844k implements InterfaceC10809a<C10868p> {

        /* renamed from: a */
        public final /* synthetic */ C2218o0 f5531a;

        /* renamed from: b */
        public final /* synthetic */ C2100e2 f5532b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2273a(C2218o0 c2218o0, C2100e2 c2100e2) {
            super(0);
            this.f5531a = c2218o0;
            this.f5532b = c2100e2;
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final C10868p invoke() {
            this.f5531a.setBounds(this.f5532b);
            return C10868p.f21418a;
        }
    }

    public C2272r0(C2218o0 c2218o0) {
        this.f5530a = c2218o0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(@NotNull C2100e2 c2100e2) {
        C2218o0 c2218o0 = this.f5530a;
        C2218o0.m9576f(c2218o0, c2100e2, new C2273a(c2218o0, c2100e2));
    }
}
