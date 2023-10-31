package com.permissionx.guolindev.request;

import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.permissionx.guolindev.request.q */
/* loaded from: classes3.dex */
public final class C8987q extends AbstractC10844k implements InterfaceC10809a<C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C8991u f17155a;

    /* renamed from: b */
    public final /* synthetic */ Map<String, Boolean> f17156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8987q(C8991u c8991u, Map<String, Boolean> map) {
        super(0);
        this.f17155a = c8991u;
        this.f17156b = map;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final C10868p invoke() {
        LinkedHashSet linkedHashSet;
        Map<String, Boolean> grantResults = this.f17156b;
        C10843j.m431e(grantResults, "grantResults");
        int i = C8991u.f17160l;
        C8991u c8991u = this.f17155a;
        if (c8991u.m2827h()) {
            C8992v c8992v = c8991u.f17162b;
            if (c8992v != null) {
                c8992v.f17178g.clear();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry<String, Boolean> entry : grantResults.entrySet()) {
                    String key = entry.getKey();
                    if (entry.getValue().booleanValue()) {
                        C8992v c8992v2 = c8991u.f17162b;
                        if (c8992v2 != null) {
                            c8992v2.f17178g.add(key);
                            C8992v c8992v3 = c8991u.f17162b;
                            if (c8992v3 != null) {
                                c8992v3.f17179h.remove(key);
                                C8992v c8992v4 = c8991u.f17162b;
                                if (c8992v4 != null) {
                                    linkedHashSet = c8992v4.f17180i;
                                } else {
                                    C10843j.m424l("pb");
                                    throw null;
                                }
                            } else {
                                C10843j.m424l("pb");
                                throw null;
                            }
                        } else {
                            C10843j.m424l("pb");
                            throw null;
                        }
                    } else if (c8991u.shouldShowRequestPermissionRationale(key)) {
                        arrayList.add(key);
                        C8992v c8992v5 = c8991u.f17162b;
                        if (c8992v5 != null) {
                            c8992v5.f17179h.add(key);
                        } else {
                            C10843j.m424l("pb");
                            throw null;
                        }
                    } else {
                        arrayList2.add(key);
                        C8992v c8992v6 = c8991u.f17162b;
                        if (c8992v6 != null) {
                            c8992v6.f17180i.add(key);
                            C8992v c8992v7 = c8991u.f17162b;
                            if (c8992v7 != null) {
                                linkedHashSet = c8992v7.f17179h;
                            } else {
                                C10843j.m424l("pb");
                                throw null;
                            }
                        } else {
                            C10843j.m424l("pb");
                            throw null;
                        }
                    }
                    linkedHashSet.remove(key);
                }
                ArrayList arrayList3 = new ArrayList();
                C8992v c8992v8 = c8991u.f17162b;
                if (c8992v8 != null) {
                    arrayList3.addAll(c8992v8.f17179h);
                    C8992v c8992v9 = c8991u.f17162b;
                    if (c8992v9 != null) {
                        arrayList3.addAll(c8992v9.f17180i);
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            boolean z = true;
                            if (it.hasNext()) {
                                String str = (String) it.next();
                                if (ContextCompat.m12040a(c8991u.requireContext(), str) != 0) {
                                    z = false;
                                }
                                if (z) {
                                    C8992v c8992v10 = c8991u.f17162b;
                                    if (c8992v10 != null) {
                                        c8992v10.f17179h.remove(str);
                                        C8992v c8992v11 = c8991u.f17162b;
                                        if (c8992v11 != null) {
                                            c8992v11.f17178g.add(str);
                                        } else {
                                            C10843j.m424l("pb");
                                            throw null;
                                        }
                                    } else {
                                        C10843j.m424l("pb");
                                        throw null;
                                    }
                                }
                            } else {
                                C8992v c8992v12 = c8991u.f17162b;
                                if (c8992v12 != null) {
                                    int size = c8992v12.f17178g.size();
                                    C8992v c8992v13 = c8991u.f17162b;
                                    if (c8992v13 != null) {
                                        if (size != c8992v13.f17175d.size()) {
                                            z = false;
                                        }
                                        if (z) {
                                            InterfaceC8971c interfaceC8971c = c8991u.f17163c;
                                            if (interfaceC8971c != null) {
                                                interfaceC8971c.mo2828b();
                                            } else {
                                                C10843j.m424l("task");
                                                throw null;
                                            }
                                        } else if (c8991u.f17162b != null) {
                                            InterfaceC8971c interfaceC8971c2 = c8991u.f17163c;
                                            if (interfaceC8971c2 != null) {
                                                interfaceC8971c2.mo2828b();
                                                if (c8991u.f17162b == null) {
                                                    C10843j.m424l("pb");
                                                    throw null;
                                                }
                                            } else {
                                                C10843j.m424l("task");
                                                throw null;
                                            }
                                        } else {
                                            C10843j.m424l("pb");
                                            throw null;
                                        }
                                    } else {
                                        C10843j.m424l("pb");
                                        throw null;
                                    }
                                } else {
                                    C10843j.m424l("pb");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        C10843j.m424l("pb");
                        throw null;
                    }
                } else {
                    C10843j.m424l("pb");
                    throw null;
                }
            } else {
                C10843j.m424l("pb");
                throw null;
            }
        }
        return C10868p.f21418a;
    }
}
