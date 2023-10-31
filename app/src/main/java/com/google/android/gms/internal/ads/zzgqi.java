package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.C0510h;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgqi {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzgqg zzgqgVar, String str) {
        StringBuilder m12339b = C0510h.m12339b("# ", str);
        zzd(zzgqgVar, m12339b, 0);
        return m12339b.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            zzc(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzgro.zza(zzgno.zzw((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzgno) {
                sb.append(": \"");
                sb.append(zzgro.zza((zzgno) obj));
                sb.append('\"');
            } else if (obj instanceof zzgow) {
                sb.append(" {");
                zzd((zzgow) obj, sb, i + 2);
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                zzb(sb, i3, "key", entry2.getKey());
                zzb(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            }
        }
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzgqg zzgqgVar, StringBuilder sb, int i) {
        int i2;
        Object obj;
        Method method;
        String substring;
        Object zzaQ;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgqgVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i2);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                zzaQ = zzgow.zzaQ(method2, zzgqgVar, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object zzaQ2 = zzgow.zzaQ(method4, zzgqgVar, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) zzgow.zzaQ(method5, zzgqgVar, new Object[0])).booleanValue()) {
                            }
                            zzb(sb, i, substring2, zzaQ2);
                        } else if (zzaQ2 instanceof Boolean) {
                            if (!((Boolean) zzaQ2).booleanValue()) {
                            }
                            zzb(sb, i, substring2, zzaQ2);
                        } else if (zzaQ2 instanceof Integer) {
                            if (((Integer) zzaQ2).intValue() == 0) {
                            }
                            zzb(sb, i, substring2, zzaQ2);
                        } else if (zzaQ2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaQ2).floatValue()) == 0) {
                            }
                            zzb(sb, i, substring2, zzaQ2);
                        } else if (zzaQ2 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzaQ2).doubleValue()) == 0) {
                            }
                            zzb(sb, i, substring2, zzaQ2);
                        } else {
                            if (zzaQ2 instanceof String) {
                                obj = "";
                            } else if (zzaQ2 instanceof zzgno) {
                                obj = zzgno.zzb;
                            } else if (zzaQ2 instanceof zzgqg) {
                                if (zzaQ2 == ((zzgqg) zzaQ2).zzbf()) {
                                }
                                zzb(sb, i, substring2, zzaQ2);
                            } else {
                                if ((zzaQ2 instanceof Enum) && ((Enum) zzaQ2).ordinal() == 0) {
                                }
                                zzb(sb, i, substring2, zzaQ2);
                            }
                            if (zzaQ2.equals(obj)) {
                            }
                            zzb(sb, i, substring2, zzaQ2);
                        }
                    }
                }
                i2 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                zzaQ = zzgow.zzaQ(method, zzgqgVar, new Object[0]);
            }
            zzb(sb, i, substring, zzaQ);
            i2 = 3;
        }
        if (zzgqgVar instanceof zzgot) {
            zzgot zzgotVar = (zzgot) zzgqgVar;
            throw null;
        }
        zzgrr zzgrrVar = ((zzgow) zzgqgVar).zzc;
        if (zzgrrVar != null) {
            zzgrrVar.zzi(sb, i);
        }
    }
}
