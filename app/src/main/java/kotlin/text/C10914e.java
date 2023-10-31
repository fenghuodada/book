package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC10742b;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.text.e */
/* loaded from: classes3.dex */
public final class C10914e {
    @NotNull

    /* renamed from: a */
    public final Matcher f21465a;
    @Nullable

    /* renamed from: b */
    public C10915a f21466b;

    /* renamed from: kotlin.text.e$a */
    /* loaded from: classes3.dex */
    public static final class C10915a extends AbstractC10742b<String> {
        public C10915a() {
        }

        @Override // kotlin.collections.AbstractC10740a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        @Override // kotlin.collections.AbstractC10742b, java.util.List
        public final Object get(int i) {
            String group = C10914e.this.f21465a.group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // kotlin.collections.AbstractC10742b, kotlin.collections.AbstractC10740a
        public final int getSize() {
            return C10914e.this.f21465a.groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC10742b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        @Override // kotlin.collections.AbstractC10742b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    public C10914e(@NotNull Matcher matcher, @NotNull String str) {
        this.f21465a = matcher;
        new C10916f(this);
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m403a() {
        if (this.f21466b == null) {
            this.f21466b = new C10915a();
        }
        C10915a c10915a = this.f21466b;
        C10843j.m433c(c10915a);
        return c10915a;
    }
}
