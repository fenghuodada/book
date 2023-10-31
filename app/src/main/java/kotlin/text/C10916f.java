package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC10740a;
import kotlin.collections.C10756l;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.ranges.C10878c;
import kotlin.ranges.C10882g;
import kotlin.sequences.C10907i;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.text.f */
/* loaded from: classes3.dex */
public final class C10916f extends AbstractC10740a<C10913d> {

    /* renamed from: a */
    public final /* synthetic */ C10914e f21468a;

    /* renamed from: kotlin.text.f$a */
    /* loaded from: classes3.dex */
    public static final class C10917a extends AbstractC10844k implements InterfaceC10820l<Integer, C10913d> {
        public C10917a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.InterfaceC10820l
        public final C10913d invoke(Integer num) {
            int intValue = num.intValue();
            C10914e c10914e = C10916f.this.f21468a;
            Matcher matcher = c10914e.f21465a;
            C10878c m411c = C10882g.m411c(matcher.start(intValue), matcher.end(intValue));
            if (Integer.valueOf(m411c.f21422a).intValue() >= 0) {
                String group = c10914e.f21465a.group(intValue);
                C10843j.m431e(group, "matchResult.group(index)");
                return new C10913d(group, m411c);
            }
            return null;
        }
    }

    public C10916f(C10914e c10914e) {
        this.f21468a = c10914e;
    }

    @Override // kotlin.collections.AbstractC10740a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof C10913d;
        }
        if (!z) {
            return false;
        }
        return super.contains((C10913d) obj);
    }

    @Override // kotlin.collections.AbstractC10740a
    public final int getSize() {
        return this.f21468a.f21465a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractC10740a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // kotlin.collections.AbstractC10740a, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<C10913d> iterator() {
        return new C10907i.C10908a(new C10907i(new C10756l(new C10878c(0, size() - 1)), new C10917a()));
    }
}
