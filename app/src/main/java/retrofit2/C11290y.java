package retrofit2;

import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: retrofit2.y */
/* loaded from: classes3.dex */
public final class C11290y extends AbstractC11202a0<Iterable<Object>> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC11202a0 f22072a;

    public C11290y(AbstractC11202a0 abstractC11202a0) {
        this.f22072a = abstractC11202a0;
    }

    @Override // retrofit2.AbstractC11202a0
    /* renamed from: a */
    public final void mo0a(C11236c0 c11236c0, @Nullable Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 != null) {
            for (Object obj : iterable2) {
                this.f22072a.mo0a(c11236c0, obj);
            }
        }
    }
}
