package androidx.activity.result;

import androidx.activity.result.contract.AbstractC0058a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C0608c;
import java.util.HashMap;

/* renamed from: androidx.activity.result.e */
/* loaded from: classes.dex */
public final class C0064e extends AbstractC0057c<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f109a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0058a f110b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0066g f111c;

    public C0064e(AbstractC0066g abstractC0066g, String str, AbstractC0058a abstractC0058a) {
        this.f111c = abstractC0066g;
        this.f109a = str;
        this.f110b = abstractC0058a;
    }

    @Override // androidx.activity.result.AbstractC0057c
    @NonNull
    public final AbstractC0058a<Object, ?> getContract() {
        return this.f110b;
    }

    @Override // androidx.activity.result.AbstractC0057c
    public final void launch(Object obj, @Nullable C0608c c0608c) {
        AbstractC0066g abstractC0066g = this.f111c;
        HashMap hashMap = abstractC0066g.f117c;
        String str = this.f109a;
        Integer num = (Integer) hashMap.get(str);
        AbstractC0058a abstractC0058a = this.f110b;
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
        this.f111c.m13046f(this.f109a);
    }
}
