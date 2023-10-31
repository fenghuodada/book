package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.TypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.work.f */
/* loaded from: classes.dex */
public final class C1837f {

    /* renamed from: b */
    public static final String f4457b = AbstractC2005l.m9732e("Data");

    /* renamed from: c */
    public static final C1837f f4458c;

    /* renamed from: a */
    public final HashMap f4459a;

    /* renamed from: androidx.work.f$a */
    /* loaded from: classes.dex */
    public static final class C1838a {

        /* renamed from: a */
        public final HashMap f4460a = new HashMap();

        @NonNull
        /* renamed from: a */
        public final void m9902a(@NonNull HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap hashMap2 = this.f4460a;
                if (value == null) {
                    value = null;
                } else {
                    Class<?> cls = value.getClass();
                    if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                        int i = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            String str2 = C1837f.f4457b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            String str3 = C1837f.f4457b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            hashMap2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            String str4 = C1837f.f4457b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            hashMap2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            String str5 = C1837f.f4457b;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            hashMap2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            String str6 = C1837f.f4457b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            hashMap2.put(str, fArr2);
                        } else if (cls == double[].class) {
                            double[] dArr = (double[]) value;
                            String str7 = C1837f.f4457b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            hashMap2.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                        }
                    }
                }
                hashMap2.put(str, value);
            }
        }
    }

    static {
        C1837f c1837f = new C1837f(new HashMap());
        m9903b(c1837f);
        f4458c = c1837f;
    }

    public C1837f() {
    }

    public C1837f(@NonNull C1837f c1837f) {
        this.f4459a = new HashMap(c1837f.f4459a);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public C1837f(@NonNull HashMap hashMap) {
        this.f4459a = new HashMap(hashMap);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0060: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:38:0x005f */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.NonNull
    @androidx.room.TypeConverter
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.C1837f m9904a(@androidx.annotation.NonNull byte[] r8) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = androidx.work.C1837f.f4457b
            int r2 = r8.length
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r2 > r3) goto L74
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3c java.lang.ClassNotFoundException -> L3e java.io.IOException -> L40
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3c java.lang.ClassNotFoundException -> L3e java.io.IOException -> L40
            int r8 = r4.readInt()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
        L1d:
            if (r8 <= 0) goto L2d
            java.lang.String r5 = r4.readUTF()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            java.lang.Object r6 = r4.readObject()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            int r8 = r8 + (-1)
            goto L1d
        L2d:
            r4.close()     // Catch: java.io.IOException -> L31
            goto L51
        L31:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
            goto L51
        L36:
            r8 = move-exception
            goto L5f
        L38:
            r8 = move-exception
            goto L44
        L3a:
            r8 = move-exception
            goto L44
        L3c:
            r2 = move-exception
            goto L61
        L3e:
            r4 = move-exception
            goto L41
        L40:
            r4 = move-exception
        L41:
            r7 = r4
            r4 = r8
            r8 = r7
        L44:
            android.util.Log.e(r1, r0, r8)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L51
            r4.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L51:
            r3.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L59:
            androidx.work.f r8 = new androidx.work.f
            r8.<init>(r2)
            return r8
        L5f:
            r2 = r8
            r8 = r4
        L61:
            if (r8 == 0) goto L6b
            r8.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L6b:
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L73:
            throw r2
        L74:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1837f.m9904a(byte[]):androidx.work.f");
    }

    @NonNull
    @TypeConverter
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: b */
    public static byte[] m9903b(@NonNull C1837f c1837f) {
        ObjectOutputStream objectOutputStream;
        String str = f4457b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(c1837f.f4459a.size());
                    for (Map.Entry entry : c1837f.f4459a.entrySet()) {
                        objectOutputStream.writeUTF((String) entry.getKey());
                        objectOutputStream.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream.close();
                    } catch (IOException e) {
                        Log.e(str, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(str, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream2 = objectOutputStream;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e4) {
                            Log.e(str, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(str, "Error in Data#toByteArray: ", e5);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(str, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        Log.e(str, "Error in Data#toByteArray: ", e7);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1837f.class != obj.getClass()) {
            return false;
        }
        C1837f c1837f = (C1837f) obj;
        HashMap hashMap = this.f4459a;
        Set<String> keySet = hashMap.keySet();
        if (keySet.equals(c1837f.f4459a.keySet())) {
            for (String str : keySet) {
                Object obj2 = hashMap.get(str);
                Object obj3 = c1837f.f4459a.get(str);
                if (obj2 == null || obj3 == null) {
                    if (obj2 == obj3) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z = obj2.equals(obj3);
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4459a.hashCode() * 31;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f4459a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
