package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* renamed from: retrofit2.z */
/* loaded from: classes3.dex */
public final class C11291z extends AbstractC11202a0<Object> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC11202a0 f22073a;

    public C11291z(AbstractC11202a0 abstractC11202a0) {
        this.f22073a = abstractC11202a0;
    }

    @Override // retrofit2.AbstractC11202a0
    /* renamed from: a */
    public final void mo0a(C11236c0 c11236c0, @Nullable Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f22073a.mo0a(c11236c0, Array.get(obj, i));
        }
    }
}
