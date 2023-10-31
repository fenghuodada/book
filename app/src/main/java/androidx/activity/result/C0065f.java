package androidx.activity.result;

import androidx.activity.result.contract.AbstractC0058a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C0608c;
import java.util.HashMap;

/* renamed from: androidx.activity.result.f */
/* loaded from: classes.dex */
public final class C0065f extends AbstractC0057c<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f112a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0058a f113b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0066g f114c;

    public C0065f(AbstractC0066g abstractC0066g, String str, AbstractC0058a abstractC0058a) {
        this.f114c = abstractC0066g;
        this.f112a = str;
        this.f113b = abstractC0058a;
    }

    @Override // androidx.activity.result.AbstractC0057c
    @NonNull
    public final AbstractC0058a<Object, ?> getContract() {
        return this.f113b;
    }

    @Override // androidx.activity.result.AbstractC0057c
    public final void launch(Object obj, @Nullable C0608c c0608c) {
        AbstractC0066g abstractC0066g = this.f114c;
        HashMap hashMap = abstractC0066g.f117c;
        String str = this.f112a;
        Integer num = (Integer) hashMap.get(str);
        AbstractC0058a abstractC0058a = this.f113b;
        if (num != null) {
            abstractC0066g.f119e.add(str);
            try {
                abstractC0066g.mo13050b(num.intValue(), abstractC0058a, obj);
                return;
            } catch (Exception e) {
                abstractC0066g.f119e.remove(str);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0058a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    @Override // androidx.activity.result.AbstractC0057c
    public final void unregister() {
        this.f114c.m13046f(this.f112a);
    }
}
