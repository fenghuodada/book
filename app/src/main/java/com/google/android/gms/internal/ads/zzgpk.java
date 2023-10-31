package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzgpk {
    public static final zzgpk zza;
    public static final zzgpk zzb;
    public static final zzgpk zzc;
    public static final zzgpk zzd;
    public static final zzgpk zze;
    public static final zzgpk zzf;
    public static final zzgpk zzg;
    public static final zzgpk zzh;
    public static final zzgpk zzi;
    public static final zzgpk zzj;
    private static final /* synthetic */ zzgpk[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzgpk zzgpkVar = new zzgpk("VOID", 0, Void.class, Void.class, null);
        zza = zzgpkVar;
        Class cls = Integer.TYPE;
        zzgpk zzgpkVar2 = new zzgpk("INT", 1, cls, Integer.class, 0);
        zzb = zzgpkVar2;
        zzgpk zzgpkVar3 = new zzgpk("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgpkVar3;
        zzgpk zzgpkVar4 = new zzgpk("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgpkVar4;
        zzgpk zzgpkVar5 = new zzgpk("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgpkVar5;
        zzgpk zzgpkVar6 = new zzgpk("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgpkVar6;
        zzgpk zzgpkVar7 = new zzgpk("STRING", 6, String.class, String.class, "");
        zzg = zzgpkVar7;
        zzgpk zzgpkVar8 = new zzgpk("BYTE_STRING", 7, zzgno.class, zzgno.class, zzgno.zzb);
        zzh = zzgpkVar8;
        zzgpk zzgpkVar9 = new zzgpk("ENUM", 8, cls, Integer.class, null);
        zzi = zzgpkVar9;
        zzgpk zzgpkVar10 = new zzgpk("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgpkVar10;
        zzk = new zzgpk[]{zzgpkVar, zzgpkVar2, zzgpkVar3, zzgpkVar4, zzgpkVar5, zzgpkVar6, zzgpkVar7, zzgpkVar8, zzgpkVar9, zzgpkVar10};
    }

    private zzgpk(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzgpk[] values() {
        return (zzgpk[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
