package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.core.p003os.C0730a;
import androidx.core.p003os.C0731b;
import androidx.savedstate.C1689b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C10806j;
import kotlin.collections.C10765u;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC10992h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public final class C1508y {
    @NotNull

    /* renamed from: f */
    public static final Class<? extends Object>[] f3482f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    @NotNull

    /* renamed from: a */
    public final LinkedHashMap f3483a;
    @NotNull

    /* renamed from: b */
    public final LinkedHashMap f3484b;
    @NotNull

    /* renamed from: c */
    public final LinkedHashMap f3485c;
    @NotNull

    /* renamed from: d */
    public final LinkedHashMap f3486d;
    @NotNull

    /* renamed from: e */
    public final C1689b.InterfaceC1691b f3487e;

    /* renamed from: androidx.lifecycle.y$a */
    /* loaded from: classes.dex */
    public static final class C1509a {
        @JvmStatic
        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
        @NotNull
        /* renamed from: a */
        public static C1508y m10519a(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C1508y();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    C10843j.m431e(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new C1508y(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    C10843j.m432d(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new C1508y(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }

    public C1508y() {
        this.f3483a = new LinkedHashMap();
        this.f3484b = new LinkedHashMap();
        this.f3485c = new LinkedHashMap();
        this.f3486d = new LinkedHashMap();
        this.f3487e = new C1689b.InterfaceC1691b() { // from class: androidx.lifecycle.x
            @Override // androidx.savedstate.C1689b.InterfaceC1691b
            /* renamed from: a */
            public final Bundle mo10049a() {
                return C1508y.m10520a(C1508y.this);
            }
        };
    }

    public C1508y(@NotNull HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3483a = linkedHashMap;
        this.f3484b = new LinkedHashMap();
        this.f3485c = new LinkedHashMap();
        this.f3486d = new LinkedHashMap();
        this.f3487e = new C1689b.InterfaceC1691b() { // from class: androidx.lifecycle.x
            @Override // androidx.savedstate.C1689b.InterfaceC1691b
            /* renamed from: a */
            public final Bundle mo10049a() {
                return C1508y.m10520a(C1508y.this);
            }
        };
        linkedHashMap.putAll(hashMap);
    }

    /* renamed from: a */
    public static Bundle m10520a(C1508y this$0) {
        C10843j.m430f(this$0, "this$0");
        Iterator it = C10765u.m463f(this$0.f3484b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f3483a;
            boolean z = true;
            C1489r c1489r = null;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String key = (String) entry.getKey();
                Bundle mo10049a = ((C1689b.InterfaceC1691b) entry.getValue()).mo10049a();
                C10843j.m430f(key, "key");
                if (mo10049a != null) {
                    Class<? extends Object>[] clsArr = f3482f;
                    int i = 0;
                    while (true) {
                        if (i < 29) {
                            Class<? extends Object> cls = clsArr[i];
                            C10843j.m433c(cls);
                            if (cls.isInstance(mo10049a)) {
                                break;
                            }
                            i++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (z) {
                    Object obj = this$0.f3485c.get(key);
                    if (obj instanceof C1489r) {
                        c1489r = (C1489r) obj;
                    }
                    if (c1489r != null) {
                        c1489r.mo10510i(mo10049a);
                    } else {
                        linkedHashMap.put(key, mo10049a);
                    }
                    InterfaceC10992h interfaceC10992h = (InterfaceC10992h) this$0.f3486d.get(key);
                    if (interfaceC10992h != null) {
                        interfaceC10992h.setValue(mo10049a);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Can't put value with type ");
                    C10843j.m433c(mo10049a);
                    sb.append(mo10049a.getClass());
                    sb.append(" into saved state");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                C10806j[] c10806jArr = {new C10806j(UserMetadata.KEYDATA_FILENAME, arrayList), new C10806j("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    C10806j c10806j = c10806jArr[i2];
                    String str2 = (String) c10806j.f21397a;
                    B b = c10806j.f21398b;
                    if (b == 0) {
                        bundle.putString(str2, null);
                    } else if (b instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) b).booleanValue());
                    } else if (b instanceof Byte) {
                        bundle.putByte(str2, ((Number) b).byteValue());
                    } else if (b instanceof Character) {
                        bundle.putChar(str2, ((Character) b).charValue());
                    } else if (b instanceof Double) {
                        bundle.putDouble(str2, ((Number) b).doubleValue());
                    } else if (b instanceof Float) {
                        bundle.putFloat(str2, ((Number) b).floatValue());
                    } else if (b instanceof Integer) {
                        bundle.putInt(str2, ((Number) b).intValue());
                    } else if (b instanceof Long) {
                        bundle.putLong(str2, ((Number) b).longValue());
                    } else if (b instanceof Short) {
                        bundle.putShort(str2, ((Number) b).shortValue());
                    } else if (b instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) b);
                    } else if (b instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) b);
                    } else if (b instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) b);
                    } else if (b instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) b);
                    } else if (b instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) b);
                    } else if (b instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) b);
                    } else if (b instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) b);
                    } else if (b instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) b);
                    } else if (b instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) b);
                    } else if (b instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) b);
                    } else if (b instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) b);
                    } else if (b instanceof Object[]) {
                        Class<?> componentType = b.getClass().getComponentType();
                        C10843j.m433c(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) b);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) b);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) b);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) b);
                        }
                    } else {
                        if (!(b instanceof Serializable)) {
                            if (b instanceof IBinder) {
                                C0730a.m11865a(bundle, str2, (IBinder) b);
                            } else if (b instanceof Size) {
                                C0731b.m11864a(bundle, str2, (Size) b);
                            } else if (b instanceof SizeF) {
                                C0731b.m11863b(bundle, str2, (SizeF) b);
                            } else {
                                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                        }
                        bundle.putSerializable(str2, (Serializable) b);
                    }
                }
                return bundle;
            }
        }
    }
}
