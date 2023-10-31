package com.qmuiteam.qmui.arch;

import androidx.fragment.app.Fragment;
import com.qmuiteam.qmui.arch.AbstractC9008b;
import com.qmuiteam.qmui.arch.C9048p;
import java.lang.reflect.Field;

/* renamed from: com.qmuiteam.qmui.arch.o */
/* loaded from: classes3.dex */
public final class C9047o implements C9048p.InterfaceC9049a {

    /* renamed from: a */
    public final /* synthetic */ boolean f17297a = false;

    /* renamed from: b */
    public final /* synthetic */ AbstractC9008b.C9016g f17298b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC9008b f17299c;

    public C9047o(AbstractC9008b.C9016g c9016g, AbstractC9008b abstractC9008b) {
        this.f17298b = c9016g;
        this.f17299c = abstractC9008b;
    }

    @Override // com.qmuiteam.qmui.arch.C9048p.InterfaceC9049a
    /* renamed from: a */
    public final String mo2765a() {
        return this.f17299c.getClass().getSimpleName();
    }

    @Override // com.qmuiteam.qmui.arch.C9048p.InterfaceC9049a
    /* renamed from: b */
    public final boolean mo2764b() {
        return true;
    }

    @Override // com.qmuiteam.qmui.arch.C9048p.InterfaceC9049a
    /* renamed from: c */
    public final boolean mo2763c(Object obj) {
        AbstractC9008b abstractC9008b = this.f17299c;
        AbstractC9008b.C9016g c9016g = this.f17298b;
        try {
            Field m2766b = C9048p.m2766b(obj, "mCmd", "cmd");
            m2766b.setAccessible(true);
            if (((Integer) m2766b.get(obj)).intValue() == 1) {
                if (this.f17297a) {
                    Field m2766b2 = C9048p.m2766b(obj, "mPopEnterAnim", "popEnterAnim");
                    m2766b2.setAccessible(true);
                    m2766b2.set(obj, Integer.valueOf(c9016g.f17231c));
                    Field m2766b3 = C9048p.m2766b(obj, "mPopExitAnim", "popExitAnim");
                    m2766b3.setAccessible(true);
                    m2766b3.set(obj, Integer.valueOf(c9016g.f17232d));
                }
                Field m2766b4 = C9048p.m2766b(obj, "mFragment", "fragment");
                m2766b4.setAccessible(true);
                Object obj2 = m2766b4.get(obj);
                m2766b4.set(obj, abstractC9008b);
                Field declaredField = Fragment.class.getDeclaredField("mBackStackNesting");
                declaredField.setAccessible(true);
                int intValue = ((Integer) declaredField.get(obj2)).intValue();
                declaredField.set(abstractC9008b, Integer.valueOf(intValue));
                declaredField.set(obj2, Integer.valueOf(intValue - 1));
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
