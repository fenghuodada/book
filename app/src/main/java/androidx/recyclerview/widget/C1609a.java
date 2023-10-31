package androidx.recyclerview.widget;

import androidx.core.util.C0802f;
import androidx.recyclerview.widget.C1641p;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C1609a implements C1641p.InterfaceC1642a {

    /* renamed from: d */
    public final InterfaceC1610a f3860d;

    /* renamed from: a */
    public final C0802f f3857a = new C0802f(30);

    /* renamed from: b */
    public final ArrayList<C1611b> f3858b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C1611b> f3859c = new ArrayList<>();

    /* renamed from: f */
    public int f3862f = 0;

    /* renamed from: e */
    public final C1641p f3861e = new C1641p(this);

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1610a {
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static final class C1611b {

        /* renamed from: a */
        public int f3863a;

        /* renamed from: b */
        public int f3864b;

        /* renamed from: c */
        public Object f3865c;

        /* renamed from: d */
        public int f3866d;

        public C1611b(Object obj, int i, int i2, int i3) {
            this.f3863a = i;
            this.f3864b = i2;
            this.f3866d = i3;
            this.f3865c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1611b) {
                C1611b c1611b = (C1611b) obj;
                int i = this.f3863a;
                if (i != c1611b.f3863a) {
                    return false;
                }
                if (i == 8 && Math.abs(this.f3866d - this.f3864b) == 1 && this.f3866d == c1611b.f3864b && this.f3864b == c1611b.f3866d) {
                    return true;
                }
                if (this.f3866d == c1611b.f3866d && this.f3864b == c1611b.f3864b) {
                    Object obj2 = this.f3865c;
                    Object obj3 = c1611b.f3865c;
                    if (obj2 != null) {
                        if (!obj2.equals(obj3)) {
                            return false;
                        }
                    } else if (obj3 != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.f3863a * 31) + this.f3864b) * 31) + this.f3866d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f3863a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = "add";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f3864b);
            sb.append("c:");
            sb.append(this.f3866d);
            sb.append(",p:");
            sb.append(this.f3865c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C1609a(C1649w c1649w) {
        this.f3860d = c1649w;
    }

    /* renamed from: a */
    public final boolean m10182a(int i) {
        ArrayList<C1611b> arrayList = this.f3859c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1611b c1611b = arrayList.get(i2);
            int i3 = c1611b.f3863a;
            if (i3 == 8) {
                if (m10177f(c1611b.f3866d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c1611b.f3864b;
                int i5 = c1611b.f3866d + i4;
                while (i4 < i5) {
                    if (m10177f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m10181b() {
        ArrayList<C1611b> arrayList = this.f3859c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1649w) this.f3860d).m10102a(arrayList.get(i));
        }
        m10171l(arrayList);
        this.f3862f = 0;
    }

    /* renamed from: c */
    public final void m10180c() {
        m10181b();
        ArrayList<C1611b> arrayList = this.f3858b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1611b c1611b = arrayList.get(i);
            int i2 = c1611b.f3863a;
            InterfaceC1610a interfaceC1610a = this.f3860d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            C1649w c1649w = (C1649w) interfaceC1610a;
                            c1649w.m10102a(c1611b);
                            c1649w.m10098e(c1611b.f3864b, c1611b.f3866d);
                        }
                    } else {
                        C1649w c1649w2 = (C1649w) interfaceC1610a;
                        c1649w2.m10102a(c1611b);
                        c1649w2.m10100c(c1611b.f3864b, c1611b.f3866d, c1611b.f3865c);
                    }
                } else {
                    C1649w c1649w3 = (C1649w) interfaceC1610a;
                    c1649w3.m10102a(c1611b);
                    int i3 = c1611b.f3864b;
                    int i4 = c1611b.f3866d;
                    RecyclerView recyclerView = c1649w3.f4008a;
                    recyclerView.m10393O(i3, i4, true);
                    recyclerView.f3682n0 = true;
                    recyclerView.f3676k0.f3775c += i4;
                }
            } else {
                C1649w c1649w4 = (C1649w) interfaceC1610a;
                c1649w4.m10102a(c1611b);
                c1649w4.m10099d(c1611b.f3864b, c1611b.f3866d);
            }
        }
        m10171l(arrayList);
        this.f3862f = 0;
    }

    /* renamed from: d */
    public final void m10179d(C1611b c1611b) {
        int i;
        C0802f c0802f;
        boolean z;
        int i2 = c1611b.f3863a;
        if (i2 != 1 && i2 != 8) {
            int m10170m = m10170m(c1611b.f3864b, i2);
            int i3 = c1611b.f3864b;
            int i4 = c1611b.f3863a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c1611b);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            int i6 = 1;
            while (true) {
                int i7 = c1611b.f3866d;
                c0802f = this.f3857a;
                if (i5 >= i7) {
                    break;
                }
                int m10170m2 = m10170m((i * i5) + c1611b.f3864b, c1611b.f3863a);
                int i8 = c1611b.f3863a;
                if (i8 == 2 ? m10170m2 == m10170m : !(i8 != 4 || m10170m2 != m10170m + 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i6++;
                } else {
                    C1611b m10175h = m10175h(c1611b.f3865c, i8, m10170m, i6);
                    m10178e(m10175h, i3);
                    m10175h.f3865c = null;
                    c0802f.mo6395a(m10175h);
                    if (c1611b.f3863a == 4) {
                        i3 += i6;
                    }
                    i6 = 1;
                    m10170m = m10170m2;
                }
                i5++;
            }
            Object obj = c1611b.f3865c;
            c1611b.f3865c = null;
            c0802f.mo6395a(c1611b);
            if (i6 > 0) {
                C1611b m10175h2 = m10175h(obj, c1611b.f3863a, m10170m, i6);
                m10178e(m10175h2, i3);
                m10175h2.f3865c = null;
                c0802f.mo6395a(m10175h2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: e */
    public final void m10178e(C1611b c1611b, int i) {
        C1649w c1649w = (C1649w) this.f3860d;
        c1649w.m10102a(c1611b);
        int i2 = c1611b.f3863a;
        if (i2 != 2) {
            if (i2 == 4) {
                c1649w.m10100c(i, c1611b.f3866d, c1611b.f3865c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i3 = c1611b.f3866d;
        RecyclerView recyclerView = c1649w.f4008a;
        recyclerView.m10393O(i, i3, true);
        recyclerView.f3682n0 = true;
        recyclerView.f3676k0.f3775c += i3;
    }

    /* renamed from: f */
    public final int m10177f(int i, int i2) {
        ArrayList<C1611b> arrayList = this.f3859c;
        int size = arrayList.size();
        while (i2 < size) {
            C1611b c1611b = arrayList.get(i2);
            int i3 = c1611b.f3863a;
            if (i3 == 8) {
                int i4 = c1611b.f3864b;
                if (i4 == i) {
                    i = c1611b.f3866d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1611b.f3866d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c1611b.f3864b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c1611b.f3866d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c1611b.f3866d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public final boolean m10176g() {
        return this.f3858b.size() > 0;
    }

    /* renamed from: h */
    public final C1611b m10175h(Object obj, int i, int i2, int i3) {
        C1611b c1611b = (C1611b) this.f3857a.mo6394b();
        if (c1611b == null) {
            return new C1611b(obj, i, i2, i3);
        }
        c1611b.f3863a = i;
        c1611b.f3864b = i2;
        c1611b.f3866d = i3;
        c1611b.f3865c = obj;
        return c1611b;
    }

    /* renamed from: i */
    public final void m10174i(C1611b c1611b) {
        this.f3859c.add(c1611b);
        int i = c1611b.f3863a;
        InterfaceC1610a interfaceC1610a = this.f3860d;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        ((C1649w) interfaceC1610a).m10098e(c1611b.f3864b, c1611b.f3866d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c1611b);
                }
                ((C1649w) interfaceC1610a).m10100c(c1611b.f3864b, c1611b.f3866d, c1611b.f3865c);
                return;
            }
            int i2 = c1611b.f3864b;
            int i3 = c1611b.f3866d;
            RecyclerView recyclerView = ((C1649w) interfaceC1610a).f4008a;
            recyclerView.m10393O(i2, i3, false);
            recyclerView.f3682n0 = true;
            return;
        }
        ((C1649w) interfaceC1610a).m10099d(c1611b.f3864b, c1611b.f3866d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018e, code lost:
        r1.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:
        if (r11.f3864b == r11.f3866d) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0197, code lost:
        r1.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019b, code lost:
        r1.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019e, code lost:
        if (r4 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a0, code lost:
        r1.add(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (r5 > r12.f3864b) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0187, code lost:
        if (r5 >= r12.f3864b) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
        r11.f3866d = r5 - r12.f3866d;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10173j() {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1609a.m10173j():void");
    }

    /* renamed from: k */
    public final void m10172k(C1611b c1611b) {
        c1611b.f3865c = null;
        this.f3857a.mo6395a(c1611b);
    }

    /* renamed from: l */
    public final void m10171l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m10172k((C1611b) arrayList.get(i));
        }
        arrayList.clear();
    }

    /* renamed from: m */
    public final int m10170m(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList<C1611b> arrayList = this.f3859c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1611b c1611b = arrayList.get(size);
            int i9 = c1611b.f3863a;
            if (i9 == 8) {
                int i10 = c1611b.f3864b;
                int i11 = c1611b.f3866d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            c1611b.f3864b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            c1611b.f3864b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        c1611b.f3866d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    c1611b.f3866d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    c1611b.f3864b = i7;
                    i--;
                }
            } else {
                int i12 = c1611b.f3864b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    c1611b.f3864b = i3;
                } else if (i9 == 1) {
                    i -= c1611b.f3866d;
                } else if (i9 == 2) {
                    i += c1611b.f3866d;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1611b c1611b2 = arrayList.get(size2);
            if (c1611b2.f3863a == 8) {
                int i13 = c1611b2.f3866d;
                if (i13 != c1611b2.f3864b && i13 >= 0) {
                }
                arrayList.remove(size2);
                m10172k(c1611b2);
            } else {
                if (c1611b2.f3866d > 0) {
                }
                arrayList.remove(size2);
                m10172k(c1611b2);
            }
        }
        return i;
    }
}
