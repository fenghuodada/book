package androidx.core.text;

/* renamed from: androidx.core.text.l */
/* loaded from: classes.dex */
public final class C0790l {

    /* renamed from: a */
    public static final C0794d f2492a = new C0794d(null, false);

    /* renamed from: b */
    public static final C0794d f2493b = new C0794d(null, true);

    /* renamed from: c */
    public static final C0794d f2494c;

    /* renamed from: d */
    public static final C0794d f2495d;

    /* renamed from: androidx.core.text.l$a */
    /* loaded from: classes.dex */
    public static class C0791a implements InterfaceC0792b {

        /* renamed from: a */
        public static final C0791a f2496a = new C0791a();

        @Override // androidx.core.text.C0790l.InterfaceC0792b
        /* renamed from: a */
        public final int mo11800a(CharSequence charSequence, int i) {
            int i2 = i + 0;
            int i3 = 2;
            for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                C0794d c0794d = C0790l.f2492a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i3 = 2;
                                break;
                        }
                    }
                    i3 = 0;
                }
                i3 = 1;
            }
            return i3;
        }
    }

    /* renamed from: androidx.core.text.l$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0792b {
        /* renamed from: a */
        int mo11800a(CharSequence charSequence, int i);
    }

    /* renamed from: androidx.core.text.l$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0793c implements InterfaceC0789k {

        /* renamed from: a */
        public final InterfaceC0792b f2497a;

        public AbstractC0793c(C0791a c0791a) {
            this.f2497a = c0791a;
        }

        /* renamed from: a */
        public abstract boolean mo11798a();

        /* renamed from: b */
        public final boolean m11799b(CharSequence charSequence, int i) {
            if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
                InterfaceC0792b interfaceC0792b = this.f2497a;
                if (interfaceC0792b == null) {
                    return mo11798a();
                }
                int mo11800a = interfaceC0792b.mo11800a(charSequence, i);
                if (mo11800a == 0) {
                    return true;
                }
                if (mo11800a != 1) {
                    return mo11798a();
                }
                return false;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: androidx.core.text.l$d */
    /* loaded from: classes.dex */
    public static class C0794d extends AbstractC0793c {

        /* renamed from: b */
        public final boolean f2498b;

        public C0794d(C0791a c0791a, boolean z) {
            super(c0791a);
            this.f2498b = z;
        }

        @Override // androidx.core.text.C0790l.AbstractC0793c
        /* renamed from: a */
        public final boolean mo11798a() {
            return this.f2498b;
        }
    }

    static {
        C0791a c0791a = C0791a.f2496a;
        f2494c = new C0794d(c0791a, false);
        f2495d = new C0794d(c0791a, true);
    }
}
