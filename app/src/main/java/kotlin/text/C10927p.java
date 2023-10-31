package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C10806j;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C10878c;

@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
/* renamed from: kotlin.text.p */
/* loaded from: classes3.dex */
public final class C10927p extends AbstractC10844k implements InterfaceC10824p<CharSequence, Integer, C10806j<? extends Integer, ? extends Integer>> {

    /* renamed from: a */
    public final /* synthetic */ List<String> f21474a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10927p(List<String> list, boolean z) {
        super(2);
        this.f21474a = list;
        this.f21475b = z;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final C10806j<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        Object obj;
        C10806j c10806j;
        Object obj2;
        Object obj3;
        CharSequence $receiver = charSequence;
        int intValue = num.intValue();
        C10843j.m430f($receiver, "$this$$receiver");
        List<String> list = this.f21474a;
        boolean z = this.f21475b;
        if (!z && list.size() == 1) {
            List<String> list2 = list;
            if (list2 instanceof List) {
                List<String> list3 = list2;
                int size = list3.size();
                if (size != 0) {
                    if (size == 1) {
                        obj3 = list3.get(0);
                    } else {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                } else {
                    throw new NoSuchElementException("List is empty.");
                }
            } else {
                Iterator<T> it = list2.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (!it.hasNext()) {
                        obj3 = next;
                    } else {
                        throw new IllegalArgumentException("Collection has more than one element.");
                    }
                } else {
                    throw new NoSuchElementException("Collection is empty.");
                }
            }
            String str = (String) obj3;
            int m373s = C10929r.m373s($receiver, str, intValue, false, 4);
            if (m373s >= 0) {
                c10806j = new C10806j(Integer.valueOf(m373s), str);
            }
            c10806j = null;
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            C10878c c10878c = new C10878c(intValue, $receiver.length());
            boolean z2 = $receiver instanceof String;
            int i = c10878c.f21424c;
            int i2 = c10878c.f21423b;
            if (z2) {
                if ((i > 0 && intValue <= i2) || (i < 0 && i2 <= intValue)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                String str2 = (String) obj2;
                                if (C10925n.m395h(0, intValue, str2.length(), str2, (String) $receiver, z)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            c10806j = new C10806j(Integer.valueOf(intValue), str3);
                            break;
                        } else if (intValue == i2) {
                            break;
                        } else {
                            intValue += i;
                        }
                    }
                }
                c10806j = null;
            } else {
                if ((i > 0 && intValue <= i2) || (i < 0 && i2 <= intValue)) {
                    while (true) {
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                String str4 = (String) obj;
                                if (C10929r.m367y(str4, 0, $receiver, intValue, str4.length(), z)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            c10806j = new C10806j(Integer.valueOf(intValue), str5);
                            break;
                        } else if (intValue == i2) {
                            break;
                        } else {
                            intValue += i;
                        }
                    }
                }
                c10806j = null;
            }
        }
        if (c10806j == null) {
            return null;
        }
        return new C10806j<>(c10806j.f21397a, Integer.valueOf(((String) c10806j.f21398b).length()));
    }
}
