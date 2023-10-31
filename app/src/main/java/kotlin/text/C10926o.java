package kotlin.text;

import kotlin.C10806j;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
/* renamed from: kotlin.text.o */
/* loaded from: classes3.dex */
public final class C10926o extends AbstractC10844k implements InterfaceC10824p<CharSequence, Integer, C10806j<? extends Integer, ? extends Integer>> {

    /* renamed from: a */
    public final /* synthetic */ char[] f21472a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10926o(char[] cArr, boolean z) {
        super(2);
        this.f21472a = cArr;
        this.f21473b = z;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final C10806j<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        CharSequence $receiver = charSequence;
        int intValue = num.intValue();
        C10843j.m430f($receiver, "$this$$receiver");
        int m372t = C10929r.m372t(intValue, $receiver, this.f21473b, this.f21472a);
        if (m372t < 0) {
            return null;
        }
        return new C10806j<>(Integer.valueOf(m372t), 1);
    }
}
