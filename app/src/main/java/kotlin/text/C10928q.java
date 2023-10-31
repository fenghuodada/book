package kotlin.text;

import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.ranges.C10878c;

/* renamed from: kotlin.text.q */
/* loaded from: classes3.dex */
public final class C10928q extends AbstractC10844k implements InterfaceC10820l<C10878c, String> {

    /* renamed from: a */
    public final /* synthetic */ CharSequence f21476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10928q(CharSequence charSequence) {
        super(1);
        this.f21476a = charSequence;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final String invoke(C10878c c10878c) {
        C10878c it = c10878c;
        C10843j.m430f(it, "it");
        return C10929r.m384H(this.f21476a, it);
    }
}
